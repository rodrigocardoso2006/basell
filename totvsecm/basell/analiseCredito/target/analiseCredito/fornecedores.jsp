<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.basell.entity.DocumentExtent"%>
<%@page import="br.com.basell.entity.DocumentType"%>
<%@page import="br.com.basell.entity.Group"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.datasul.technology.webdesk.dm.ws.DocumentDto"%>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
		<link rel="stylesheet" href="js/jquery-ui/css/cupertino/jquery-ui.custom.css" type="text/css" />
		<link rel="stylesheet" type="text/css" href="css/estilo.css"/>
		<style>
			* {
				font-family: Verdana, Tahoma, sans-serif;
				font-size: 11px;
			}
			th {
				background-color: #1E90FF;
				color: #FFFFFF;
				font-size: 13px;
				padding: 5px 5px 5px 5px;
			}
			td {
				padding: 5px 5px 5px 5px;
			}
			.ui-dialog-titlebar-close {
 				visibility: hidden;
			}
			
			.centerDiv {
				border-radius: 5px;
				text-align: center;
				padding:10px;
				position:absolute;
				margin-top:-25px;
				margin-left:-400px;
				top:50%;
				left:50%;
				width: 150px; 
				height: 50px; 
				background-color: white; 
				border: 1px solid #000000; 
				padding: 10px 10px 10px 10px;
			}
			.ui-datepicker-trigger { position: relative; top: 2px; }			
			
		</style>
		<script src="js/jquery-ui/js/jquery.js"></script>
		<script src="js/jquery-ui/js/jquery.blockUI.js"></script>
		<script src="js/fornecedor.js"></script>
		<script src="js/entity.js"></script>
		<script src="js/jquery-ui/js/jquery-ui.custom.js"></script>
	    
<% ArrayList<DocumentDto> fornecedor = (ArrayList<DocumentDto>) request.getAttribute("fornecedor"); %>
<% ArrayList<Group> grupo = (ArrayList<Group>) request.getAttribute("grupos"); %>
<% ArrayList<DocumentExtent> documentos = (ArrayList<DocumentExtent>) request.getAttribute("documentos"); %>
<% ArrayList<DocumentType> tipos = (ArrayList<DocumentType>) request.getAttribute("tipos"); %>
	    
  		<script>
  			var history = false;
  			
  			function onSave(fornecedor) {
  				var g = document.getElementById("grp" + fornecedor);
  				var v = g.options[g.selectedIndex].value;
  				var params = { codigo: fornecedor, grupo: v, acao: "cf" };
  				
  				$.blockUI({
  					message: '<h1>Salvando fornecedor</h1>',
  					css: { 
	  		            border: 'none', 
	  		            padding: '15px', 
	  		            backgroundColor: '#000', 
	  		            '-webkit-border-radius': '10px', 
	  		            '-moz-border-radius': '10px', 
	  		            opacity: .5, 
	  		            color: '#fff'
	  		        } 
  				}); 
  				 
  				$("#loadingText").html("Alterando fornecedor");
  				
  				$.ajax({
  				  type: "POST",
  				  url: "/analiseCredito/Fornecedor",
  				  data: params
  				}).done(function( msg ) {
  					$.unblockUI();
  				    alert("Fornecedor salvo com sucesso");
  				  });  				
  				
  			}
  			
  			function doSaveForn() {
  				var table = document.getElementById("tableLista");
  				var texto = $("#nomeFornecedor").val();
  				for (var i=2;i<table.rows.length;i++) {
 					var r = table.rows[i];
  					var id = r.id.split("-");
  					var input = r.cells[1].getElementsByTagName('input')[0];
  					if (input.value.toLowerCase() == texto.toLowerCase()) {
  						alert("Fornecedor já cadastrado!");
  						return;
  					}
  				}
  				
  				var g = document.getElementById("novoGrupo");
  				var v = g.options[g.selectedIndex].value;
  				var fornecedor = $("#codigoFornecedor").val();
  				var params = { codigo: fornecedor, nome: texto, grupo: v, acao: "sf" };

  				$.blockUI({
  					message: '<h1>Criando fornecedor</h1>',
  					css: { 
	  		            border: 'none',
	  		          	padding: '15px', 
	  		            backgroundColor: '#000', 
	  		            '-webkit-border-radius': '10px', 
	  		            '-moz-border-radius': '10px', 
	  		            opacity: .5, 
	  		            color: '#fff' } 
  				}); 
  				
  				$.ajax({
  				  type: "POST",
  				  url: "/analiseCredito/Fornecedor",
  				  data: params
  				}).done(function( msg ) {

  					$.unblockUI();

  					var ret = msg.split(":");
  	  				
  	  				var row = "<tr id='tr-" + ret[1] + "-true'>";
  	  				row += "<td width='15'>";
  	  				row += "<img src='imgs/delete.png' border='0' title='Eliminar fornecedor' onclick='onRemove(" + ret[1] + ")' style='cursor: pointer;' />";
  	  				row += "</td>";
  	  				row += "<td width='300'><input type='hidden' name='nome-" + ret[1] + "' id='nome-" + ret[1] + " value='" + texto + "' />" + texto + "</td>";
  	  				row += "<td style='text-align: center;'><input type='checkbox' name='chk" + ret[1] + "' id='chk" + ret[1] + "' checked disabled /></td>";
  	  				row += "<td style='text-align: center;' width='170'>";
  	  				row += "<select id='grp" + ret[1] + "' name='grp" + ret[1] + "'>";
  	  				row += "<option value=''>Selecione...</option>";
  	  				
  	  				var gr = document.getElementById("novoGrupo");
  	  				for (var i=0;i<gr.options.length;i++) {
  	  					var op = gr.options[i];
  	  					row += "<option value='" + op.value + "'";
  	  					if (op.value == v) { row += " checked "; }
  	  					row += ">" + op.text.split("-")[1] + "</option>";
  	  				}
  	  				
  	  				row += "</td>";
  	  				row += "<td style='text-align: center;'>0</td>";
  	  				row += "<td style='text-align: center;' width='180'>";
  	  				row += "<a href='javascript:onSave(" + ret[1] + ")'>Salvar</a>&nbsp;";
  	  				row += "<a href='javascript:onEdit(" + ret[1] + ")'>Documentos</a>";
  	  				row += "</td></tr>";

  	  				$('#tableLista tr:last').after(row);
  	  				
  				    alert("Fornecedor salvo com sucesso");
  				  	home('dialog-form');
  				  	
  				  	fixBackground("tableLista");  				  	
  				  	
  				});  				
  			}
  			
  			function onRemove(id) {
  				if (confirm("Deseja realmente eliminar esse fornecedor?")) {
  	  				var params = { codigo: id, acao: "df" };
  	  				$.blockUI({
  	  					message: '<h1>Eliminando fornecedor</h1>',
  	  					css: { 
  		  		            border: 'none',
  		  		          	padding: '15px', 
  		  		            backgroundColor: '#000', 
  		  		            '-webkit-border-radius': '10px', 
  		  		            '-moz-border-radius': '10px', 
  		  		            opacity: .5, 
  		  		            color: '#fff' } 
  	  				}); 
  	  				
  	  				$.ajax({
  	  				  type: "POST",
  	  				  url: "/analiseCredito/Fornecedor",
  	  				  data: params
  	  				}).done(function( msg ) {
  	  					$.unblockUI();
  	  				    alert("Fornecedor eliminado com sucesso");
  	  				    
  	  				    var tr = document.getElementById("tr-" + id + "-true");
  	  				    tr.id = "tr-" + id + "-false";
  	  				    var img = tr.getElementsByTagName("img");
  	  				    img[0].src = "imgs/active.png";
  	  				  	img[0].title = "Reativar fornecedor";
  	  				  	img[0].onclick = function () { onActive(id);};
  	  				  	
  	  				  	if (!history) { tr.style.display = "none"; }
  	  				  
  	  				  	fixBackground("tableLista");
  	  				  
  	  				  });  				
  	  				
  				}
  			}
  			
  			function onActive(id) {
  				if (confirm("Deseja realmente reativar esse fornecedor?")) {
	  				var params = { codigo: id, acao: "af" };
	
	  				$.blockUI({
	  					message: '<h1>Ativando fornecedor</h1>',
	  					css: { 
		  		            border: 'none',
		  		          	padding: '15px', 
		  		            backgroundColor: '#000', 
		  		            '-webkit-border-radius': '10px', 
		  		            '-moz-border-radius': '10px', 
		  		            opacity: .5, 
		  		            color: '#fff' } 
	  				}); 
	  				
	  				$.ajax({
	  				  type: "POST",
	  				  url: "/analiseCredito/Fornecedor",
	  				  data: params
	  				}).done(function( msg ) {
	  					
	  					$.unblockUI();
	  					
	  				    alert("Fornecedor ativado com sucesso");
	  				    
	  				    var tr = document.getElementById("tr-" + id + "-false");
	  				    tr.id = "tr-" + id + "-true";
	  				    var img = tr.getElementsByTagName("img");
	  				    img[0].src = "imgs/delete.png";
	  				  	img[0].title = "Eliminar fornecedor";
	  				  	img[0].onclick = function () { onRemove(id);};
	  				  	
	  				  	document.getElementById("chk" + id).checked = true;
	  				  	
	  				  	var td = tr.cells[tr.cells.length-1];
	  				  	$(td).append("<a href='javascript:onSave(" + id + ")'>Salvar</a>&nbsp;");
	  				  	$(td).append("<a href='javascript:onEdit(" + id + ")'>Documentos</a>");
	  				  	
	  				  	fixBackground("tableLista");
	  				  	
	  				  });  				
  				}  				
  			}
  			
  			function onHistory() {
				history = !history;
				onSearch();
  			}
  			
  			function onAdd() {
  				$("#listaFornecedor").fadeOut();
  				$("#dialog-form").fadeIn();
  			}
  			
  			function onEdit(id) {
  				var params = { codigo: id, acao: "doc" };

  				$.blockUI({
  					message: '<h1>Buscando documentos</h1>',
  					css: { 
	  		            border: 'none',
	  		          	padding: '15px', 
	  		            backgroundColor: '#000', 
	  		            '-webkit-border-radius': '10px', 
	  		            '-moz-border-radius': '10px', 
	  		            opacity: .5, 
	  		            color: '#fff' } 
  				});
  				
  				$.ajax({
  				  type: "POST",
  				  url: "/analiseCredito/Fornecedor",
  				  data: params
  				}).done(function( msg ) {

  					$.unblockUI();
  	  				$("#dialogDocuments").html(msg);
  	  				$("#listaFornecedor").fadeOut();
  	  				$("#dialogDocuments").fadeIn();
  					$("#formFornecedor").val("" + id);
  				  });  				
  				
  			}
  			
  			function home(id) {
  				$("#" + id).fadeOut();
  				$("#listaFornecedor").fadeIn();
  			}
  			
  			function onSearch() {
  				var texto = $("#pesquisar").val();
  				var table = document.getElementById("tableLista");
  				if (texto == "") {
  	  				for (var i=2;i<table.rows.length;i++) {
  	  					var r = table.rows[i];
  	  					var id = r.id.split("-");
  	  					if (history) { r.style.display = "table-row"; } 
  	  					else if (id[2] == "true" ) { r.style.display = "table-row"; }
  	  					else if (id[2] == "false" ) { r.style.display = "none"; }
  	  				}
  				} else {
  	  				for (var i=2;i<table.rows.length;i++) {
  	  					var r = table.rows[i];
  	  					var id = r.id.split("-");
  	  					var input = r.cells[1].getElementsByTagName('input')[0];
  	  					if (input.value.toLowerCase().indexOf(texto.toLowerCase()) != -1) { 
  	  						if (history) { r.style.display = "table-row"; }
  	  						else if (id[2] == "true" ) { r.style.display = "table-row";  }
  	  						else if (id[2] == "false" ) { r.style.display = "none"; }
  	  					} else { r.style.display = "none"; }
  	  				}
  				}
  			}
  			
  			$(function() {
  				fixBackground("tableLista");
  			});
  			
  			function fixBackground(nome) {
  				var color = true;
  				var table = document.getElementById(nome);
  				for (var i=2;i<table.rows.length;i++) {
  					var r = table.rows[i];
  					var id = r.id.split("-");
  					var c = "#FFFFFF";
  					if (id[2] == "false") { c = "#FAFAD2"; }
  					else {
  						if (color) { c = "#F5F5F5"; }
  						color = !color;
  					}
  					r.style.backgroundColor  = c;
  					
  					if (nome == "tableListDocuments") {
  						i++;
  	  					r = table.rows[i];
  	  					r.style.backgroundColor  = c;
  						i++;
  	  					r = table.rows[i];
  	  					r.style.backgroundColor  = c;
  					}
  					
  				}
  			}
  			 
  		</script>		
		<title></title>

	</head>
	<body>
  		<div id="conteudo">
	  		<table width="50%" border="0">
	   			<tr>
	   				<td><img id="logo" src="/util/images/Logo.gif" border="0" /></td>
	         		<td align="center" class="titRelatotio"><h1>Documentos de fornecedores</h1></td>
	            </tr>
			</table>
		</div>
		<br>
		<div>
			<div id="listaFornecedor">
				<table id="tableLista" border="0" width="750">
					<tr>
						<td colspan=2><a href="javascript:onAdd()">Adicionar fornecedor</a></td>
						<td colspan=3 style="text-align: center;"><input type="text" name="pesquisar" id="pesquisar" />&nbsp;<a href="javascript:onSearch()">Pesquisar</a></td>
						<td style="text-align: center;"><a href="javascript:onHistory()">Ver hist&oacute;rico</a></td>
					</tr>
					<tr>
						<th>&nbsp;</th>
						<th>Fornecedor</th>
						<th>Ativo</th>
						<th>Grupo</th>
						<th>Documentos</th>
						<th>&nbsp;</th>
					</tr>
				<%  for (DocumentDto d : fornecedor) {
						String s = ""; 
						String show = ""; 
						if (d.isActiveVersion()) { 
							s = "checked";
						} else {
							show = "display: none";
						}
						
						%>
					<tr id="tr-<%=d.getDocumentId()%>-<%=d.isActiveVersion()%>" style="<%=show%>">
						<td width="15">
				<% 		if (d.isActiveVersion()) {  %>
							<img src="imgs/delete.png" border="0" title="Eliminar fornecedor" onclick="onRemove(<%=d.getDocumentId()%>)" style="cursor: pointer;" />
				<%		} else { %>
							<img src="imgs/active.png" border="0" title="Reativar fornecedor" onclick="onActive(<%=d.getDocumentId()%>)" style="cursor: pointer;" />
				<%		} %>
						</td>
						<td width="300"><input type="hidden" name="nome-<%=d.getDocumentId()%>" id="nome-<%=d.getDocumentId()%>" value="<%=d.getAdditionalComments()%>" /><%=d.getAdditionalComments()%></td>
						<td style="text-align: center;"><input type="checkbox" name="chk<%=d.getDocumentId()%>" id="chk<%=d.getDocumentId()%>" <%=s%> disabled /></td>
						<td style="text-align: center;" width="170">
							<select id="grp<%=d.getDocumentId()%>" name="grp<%=d.getDocumentId()%>">
								<option value="">Selecione...</option>
							<% 	for (Group g : grupo) {
									String sel = "";
									System.out.println("GRUPOS:" + g.getCode() + ":" + d.getDocumentKeyWord());
									if (g.getCode().equalsIgnoreCase(d.getDocumentKeyWord())) { sel = "selected"; } %>
								<option value="<%=g.getCode()%>" <%=sel%>><%=g.getDescription()%></option>
							<%	} %>
							</select>
						</td>
						<td style="text-align: center;"><%=d.getAccessCount()%></td>
						<td style="text-align: center;" width="180">
				<% 		if (d.isActiveVersion()) {  %>
							<a href="javascript:onSave(<%=d.getDocumentId()%>)">Salvar</a>
							<a href="javascript:onEdit(<%=d.getDocumentId()%>)">Documentos</a>
				<%		} %>
						</td>
					</tr>
				<% 	} %>
					
				</table>
			</div>
					
			<div id="dialog-form" style="top: 10; left: 100; display: none">
				<div class="ui-widget-header" style="height: 20px; width: 700px; vertical-align: middle; padding-left: 10px; padding-top: 5px">Adicionar fornecedor</div>
				<div>
					<form>
						<table>
							<tr>
								<td class="tableLabel">Fornecedor:</td>
								<td>
									<input type="text" name="codigoFornecedor" id="codigoFornecedor" class="text ui-widget-content ui-corner-all" size="10" />&nbsp;
									<img src="imgs/find.png" border="0" title="Pesquisar" style="cursor: pointer;" onclick="javascript:openZoomFornecedor()"/>&nbsp;
									<input type="text" name="nomeFornecedor" id="nomeFornecedor" class="text ui-widget-content ui-corner-all" size="40" />
								</td>
							</tr>
							<tr>
								<td class="tableLabel">Grupo:</td>
								<td>
									<select id="novoGrupo" name="novoGrupo" >
									<%  for (Group g : grupo) { %>
										<option value="<%=g.getCode()%>"><%=g.getCode()%>-<%=g.getDescription()%></option>
									<%  } %>
									</select>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<a href="javascript:doSaveForn()">Salvar</a>
									<a href="javascript:home('dialog-form');">Fechar</a>
								</td>
							</tr>
						</table>
				  	</form>
				</div>
			</div>
			
			<div id="dialogDocuments" class="" style="top: 100; left: 100; display: none">
				<div>Visualizar documentos</div>
				<div>
					<div id="docContent"></div>
				</div>
			</div>
		</div>				
	</body>
</html>