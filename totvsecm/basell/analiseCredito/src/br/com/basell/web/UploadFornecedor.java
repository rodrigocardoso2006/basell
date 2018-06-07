package br.com.basell.web;

import br.com.basell.ecm.DocumentController;
import br.com.basell.ecm.FornecedorController;
import br.com.basell.entity.DocumentExtent;
import br.com.basell.utils.ParametrosGeraisUtil;
import com.datasul.technology.webdesk.dm.ws.WebServiceMessage;
import com.datasul.technology.webdesk.dm.ws.WebServiceMessageArray;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1;
	private static final String TMP_DIR_PATH = "/tmp";
	private File tmpDir;
	private String context;
	private static final Logger log = Logger.getLogger("UploadFileHolerite.class");

	public void init(ServletConfig config) throws ServletException {
		System.out.println("INIT");
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
		System.out.println("DOGET");
		request.setAttribute("documento2", (Object) "NINI");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DOPOST");
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
		try {
			List items = uploadHandler.parseRequest(request);
			Iterator itr = items.iterator();
			DocumentController dc = new DocumentController();
			FornecedorController fc = new FornecedorController();
			int folderCustomer = 0;
			DocumentExtent document = new DocumentExtent();
			document.setProvisory(Boolean.valueOf(false));
			document.setRenovation(Boolean.valueOf(false));
			document.setPending(Boolean.valueOf(false));
			document.setExtra(Boolean.valueOf(false));
			Boolean expires = true;
			String dateExpires = "";
			String acao = "";
			int doc = 0;
			int version = 1000;
			byte[] content = null;
			while (itr.hasNext()) {
				FileItem item = (FileItem) itr.next();
				System.out.println("INIT:" + item.getName());
				if (item.isFormField()) {
					System.out.println("ITEM:" + item.getFieldName() + ":" + item.getString());
					if (item.getFieldName().equalsIgnoreCase("formFornecedor")) {
						folderCustomer = Integer.parseInt(item.getString());
						document.setParentDocumentId(Integer.valueOf(folderCustomer));
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("codeTipoDoc")) {
						System.out.println("TIPODOC:" + item.getString());
						document.setVersionDescription(item.getString());
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("dataEntrega")) {
						System.out.println("ENTREGA:" + item.getString());
						if (!item.getString().equalsIgnoreCase("")) {
							document.setCreateDate(dc.getDate(item.getString()));
						}
						System.out.println("PASSOU");
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("dataVenc")) {
						dateExpires = item.getString();
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("descricao")) {
						document.setDocumentDescription(item.getString());
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("extra")) {
						document.setExtra(Boolean.valueOf(true));
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("ch-Provisorio")) {
						document.setProvisory(Boolean.valueOf(true));
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("narrativa-Provisorio")) {
						document.setNotificationProvisory(item.getString());
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("ch-Renovacao")) {
						document.setRenovation(Boolean.valueOf(true));
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("narrativa-Renovacao")) {
						document.setNotificationRenovation(item.getString());
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("ch-Pendente")) {
						document.setPending(Boolean.valueOf(true));
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("narrativa-Pendente")) {
						document.setNotificationPending(item.getString());
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("acao")) {
						acao = item.getString();
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("expira")) {
						expires = false;
						continue;
					}
					if (item.getFieldName().equalsIgnoreCase("document")) {
						if (item.getString().equalsIgnoreCase(""))
							continue;
						doc = Integer.parseInt(item.getString());
						continue;
					}
					if (!item.getFieldName().equalsIgnoreCase("version") || item.getString().equalsIgnoreCase(""))
						continue;
					version = Integer.parseInt(item.getString());
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
				content = item.get();
			}
			document.setExpires(expires);
			System.out.println("expires:" + expires + ":" + dateExpires);
			if (expires.booleanValue() && dateExpires.split("/").length == 3) {
				document.setExpirationDate(dc.getDate(dateExpires));
			} else {
				document.setExpirationDate(null);
			}
			System.out.println("DATAS:" + document.getExpirationDate() + ":" + document.getCreateDate());
			document.setVersionOption("0");
			document.setVersion(version);
			if (acao.equalsIgnoreCase("delete")) {
				document.setActiveVersion(Boolean.valueOf(false));
				fc.delete(doc, version);
				response.getWriter().print("doc-" + doc);
			} else {
				document.setDocumentId(Integer.valueOf(doc));
				System.out.println("WRITE:" + folderCustomer + ":" + acao);
				WebServiceMessageArray d = fc.publish(doc, version, document, f, content);
				if (((WebServiceMessage) d.getItem().get(0)).getDocumentId() > 0) {
					response.getWriter().print("doc-" + ((WebServiceMessage) d.getItem().get(0)).getDocumentId());
				} else {
					response.getWriter()
							.print("erro-" + ((WebServiceMessage) d.getItem().get(0)).getWebServiceMessage());
				}
				System.out.println("FEITO:" + (Object) d);
			}
		} catch (FileUploadException ex) {
			log.info("Error encountered while parsing the request");
		} catch (Exception ex) {
			log.info("Error encountered while uploading file:" + ex.getMessage());
		}
	}
}