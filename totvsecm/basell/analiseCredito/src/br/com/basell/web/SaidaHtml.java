package br.com.basell.web;

import br.com.basell.ecm.GroupController;
import br.com.basell.entity.Group;
import com.datasul.technology.webdesk.dm.ws.DocumentDto;
import java.util.List;

public class SaidaHtml {
	public String newProvider(DocumentDto document) {
		GroupController gc = new GroupController();
		String out = "<h3 id='ac" + document.getDocumentId() + "'>" + document.getAdditionalComments()
				+ " (0 documentos)";
		out = out + "<img id='img" + document.getDocumentId()
				+ "' src='imgs/delete.png' border='0' title='Eliminar fornecedor' onclick='javascript:doDelete("
				+ document.getDocumentId() + ")' style='cursor: pointer' /></h3>";
		out = out + "<div id='div" + document.getDocumentId() + "'><p>";
		out = out + "<table width='100%' border='0'>";
		out = out + "<tr>";
		out = out + "<td class='tableLabel'><label>Fornecedor:</label></td>";
		out = out + "<td><input id='codEmitente-" + document.getDocumentId() + "' name='codEmitente-"
				+ document.getDocumentId() + "' type='text' class='readonly' size='20' readonly value='"
				+ document.getDocumentId() + "' /></td>";
		out = out + "</tr>";
		out = out + "<tr>";
		out = out + "<td class='tableLabel'><label>Grupo:</label></td>";
		out = out + "<td>";
		out = out + "<select id='codigoGrupo-" + document.getDocumentId() + "' name='codigoGrupo-"
				+ document.getDocumentId() + "'>";
		List<Group> lista = gc.getGroupList();
		for (Group g : lista) {
			out = out + "<option value='" + g.getCode() + "'";
			if (g.getCode().equalsIgnoreCase(document.getDocumentKeyWord())) {
				out = out + "selected";
			}
			out = out + ">(" + g.getCode() + ")" + g.getDescription() + "</option>";
		}
		out = out + "</select>";
		out = out + "</td>";
		out = out + "</tr>";
		out = out + "</table>";
		out = out + "</p></div>";
		return out;
	}
}