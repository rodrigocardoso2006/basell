package br.com.basell.web;

import br.com.basell.ecm.DocumentController;
import br.com.basell.utils.ParametrosGeraisUtil;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadFiles extends HttpServlet {
	private static final long serialVersionUID = 1;
	private static final String TMP_DIR_PATH = "/tmp";
	private File tmpDir;
	private String context;
	private static final Logger log = Logger.getLogger("UploadFileHolerite.class");

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.tmpDir = new File("/tmp");
		if (!this.tmpDir.exists()) {
			this.tmpDir.mkdirs();
		}
		if (!this.tmpDir.isDirectory()) {
			throw new ServletException("/tmp is not a directory");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("documento2", (Object) "NINI");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.context = request.getRequestURL().toString();
		this.context = this.context.replace("/UploadFiles", "/");
		response.setContentType("text/html");
		DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
		fileItemFactory.setSizeThreshold(1048576);
		fileItemFactory.setRepository(this.tmpDir);
		ParametrosGeraisUtil pg = new ParametrosGeraisUtil();
		String folder = pg.getUrl();
		ServletFileUpload uploadHandler = new ServletFileUpload((FileItemFactory) fileItemFactory);
		File f = null;
		String cliente = "";
		String atividade = "";
		Integer folderCustomer = 0;
		String tipo = "1";
		try {
			List items = uploadHandler.parseRequest(request);
			Iterator itr = items.iterator();
			DocumentController dc = new DocumentController();
			while (itr.hasNext()) {
				FileItem item = (FileItem) itr.next();
				if (item.isFormField()) {
					System.out.println("ITEM:" + item.getFieldName() + ":" + item.getString());
					if (item.getFieldName().equals("codigoCliente")) {
						folder = folder + "\\" + item.getString();
						cliente = item.getString();
						folderCustomer = dc.publishFolder(cliente);
						request.setAttribute("folderCustomer", (Object) folderCustomer);
						continue;
					}
					if (item.getFieldName().equals("atividade")) {
						atividade = item.getString();
						continue;
					}
					if (item.getFieldName().equals("tipo")) {
						tipo = item.getString();
						continue;
					}
					if (item.getFieldName().matches("documento(.*)")) {
						request.setAttribute(item.getFieldName(), (Object) item.getString());
						continue;
					}
					if (item.getFieldName().matches("nao_enviado(.*)") && item.getString().equals("on")) {
						request.setAttribute(item.getFieldName().replaceAll("nao_enviado", "documento"),
								(Object) "nao");
						continue;
					}
					request.setAttribute(item.getFieldName(), (Object) item.getString());
					continue;
				}
				if (item.getName().equals(""))
					continue;
				File destinationDir = new File(folder);
				if (!destinationDir.exists()) {
					destinationDir.mkdirs();
				}
				System.out.println("ITEM FILE:" + item.getFieldName());
				String fileName = item.getName();
				String fileDestination = "";
				fileDestination = fileName.lastIndexOf("\\") >= 0
						? destinationDir.getAbsolutePath() + fileName.substring(fileName.lastIndexOf("\\"))
						: destinationDir.getAbsolutePath() + fileName.substring(fileName.lastIndexOf("\\") + 1);
				f = new File(fileDestination);
				System.out.println("fileDestination:" + fileDestination);
				System.out.println("NAME: " + f.getAbsoluteFile().getName());
				item.write(f);
				System.out.println("WRITE");
				Integer d = dc.publish(folderCustomer, item.getFieldName(), f, item.get());
				System.out.println("D: " + d + ":" + item.getFieldName().replaceAll("file", "documento"));
				request.setAttribute(item.getFieldName().replaceAll("file", "documento"), (Object) d);
			}
		} catch (FileUploadException ex) {
			log.info("Error encountered while parsing the request");
		} catch (Exception ex) {
			log.info("Error encountered while uploading file:" + ex.getMessage());
		}
		if (tipo.equals("1")) {
			this.getServletContext().getRequestDispatcher("/documentos.jsp?ativ=" + atividade)
					.forward((ServletRequest) request, (ServletResponse) response);
		} else {
			this.getServletContext().getRequestDispatcher("/analise.jsp?ativ=" + atividade)
					.forward((ServletRequest) request, (ServletResponse) response);
		}
	}
}