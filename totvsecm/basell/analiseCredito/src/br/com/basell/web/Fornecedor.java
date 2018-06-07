package br.com.basell.web;

import br.com.basell.ecm.DocumentTypeController;
import br.com.basell.ecm.FornecedorController;
import br.com.basell.ecm.GroupController;
import com.datasul.technology.webdesk.dm.ws.DocumentDto;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fornecedor extends HttpServlet {
	private static final long serialVersionUID = 1;
	private static final Logger log = Logger.getLogger("Fornecedor.class");

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("TESTE");
		FornecedorController fc = new FornecedorController();
		GroupController gc = new GroupController();
		request.setAttribute("fornecedor",
				(Object) fc.getDocumentByProvider(Integer.valueOf(FornecedorController.parent)));
		request.setAttribute("grupos", (Object) gc.getGroupList());
		request.getRequestDispatcher("/fornecedores.jsp").forward((ServletRequest) request, (ServletResponse) response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SAVE::" + request.getParameter("codigo") + ":" + request.getParameter("grupo") + ":"
				+ request.getParameter("ativo"));
		String acao = request.getParameter("acao");
		FornecedorController fc = new FornecedorController();
		int f = 0;
		if (acao.equalsIgnoreCase("sf")) {
			DocumentDto d = new DocumentDto();
			d.setDocumentDescription(request.getParameter("codigo"));
			d.setAdditionalComments(request.getParameter("nome"));
			d.setDocumentKeyWord(request.getParameter("grupo"));
			f = fc.create(d);
			d.setDocumentId(Integer.valueOf(f));
		} else if (acao.equalsIgnoreCase("df")) {
			int code = Integer.parseInt(request.getParameter("codigo"));
			fc.delete(code);
		} else if (acao.equalsIgnoreCase("af")) {
			int code = Integer.parseInt(request.getParameter("codigo"));
			fc.active(code);
		} else if (acao.equalsIgnoreCase("cf")) {
			int code = Integer.parseInt(request.getParameter("codigo"));
			fc.change(code, request.getParameter("grupo"), 1);
		} else if (acao.equalsIgnoreCase("doc")) {
			int folder = Integer.parseInt(request.getParameter("codigo"));
			List docs = fc.getAllDocuments(Integer.valueOf(folder));
			DocumentTypeController dtc = new DocumentTypeController();
			System.out.println("docs:" + docs.size());
			request.setAttribute("tipos", (Object) dtc.getDocumentTypeList());
			request.setAttribute("documentos", (Object) docs);
			request.getRequestDispatcher("/mostrarDocumentos.jsp").forward((ServletRequest) request,
					(ServletResponse) response);
			return;
		}
		System.out.println("SAVE::" + request.getParameter("codigo") + ":" + request.getParameter("nome") + ":"
				+ request.getParameter("grupo"));
		response.getOutputStream().print("OK:" + f);
	}
}