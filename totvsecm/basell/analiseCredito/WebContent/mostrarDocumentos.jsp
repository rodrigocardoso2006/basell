<%@page import="br.com.basell.entity.DocumentExtent"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.basell.entity.DocumentType"%>
<%@page import="com.datasul.technology.webdesk.dm.ws.DocumentDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<script src="js/jquery-ui/js/jquery.form.js"></script>
	<script>
		var historyDoc = false;
		var options = { 
			    success: function(responseText, statusText, xhr, $form) {
			    	var c = responseText.split("-");
  					$.unblockUI();
			    	if (c[0] == "erro") {
			        	alert("Erro:" + c[1]);
			    	} else {
			    		if ($("#acao").val() == "modify") {
			    			alert("Documento alterado com sucesso!");
			    			var fornecedor = $("#formFornecedor").val();
			    			onEdit(fornecedor);
			    		} else if ($("#acao").val() == "delete") {
			    			alert("Documento eliminado com sucesso!");
			    			onDeleteDocument();
			    		} else {
			    			alert("Documento adicionado com sucesso!");
			    			onNewDocument();
			    		}
			    		$('#dialogAddDocument').fadeOut();
			    		$('#divListDocuments').fadeIn();
			    	}
			    } 
			}; 
		$(function() {
			$('#dataEntrega').datepicker({showOn: "button",
								   	   buttonImage: "/util/images/calendar_day.png",
								       buttonImageOnly: true,
									   changeYear: true
			});
			
			$('#dataVenc').datepicker({showOn: "button",
								   	   buttonImage: "/util/images/calendar_day.png",
								       buttonImageOnly: true,
									   changeYear: true
			});

			fixBackground("tableListDocuments")
			
		});
		
		function onNewDocument() {
			var fornecedor = $("#formFornecedor").val();
			var tr = document.getElementById("tr-" + fornecedor + "-true");
			if (tr != null) {
				var valor = parseInt(tr.cells[4].innerHTML);
				valor++;
				tr.cells[4].innerHTML = valor;
			}
			
			onEdit(fornecedor);
			
		}
		
		function onDeleteDocument() {
			var fornecedor = $("#formFornecedor").val();
			var tr = document.getElementById("tr-" + fornecedor + "-true");
			if (tr != null) {
				var valor = parseInt(tr.cells[4].innerHTML);
				valor--;
				tr.cells[4].innerHTML = valor;
			}
			
			onEdit(fornecedor);
			
		}

		
		function fechar() {
			$('#dialogAddDocument').fadeOut();
			$('#divListDocuments').fadeIn();			
		}
		
		function salvar() {
			
			var m = "<h1>Criando documento</h1>";
			if ($("#acao").val() == "modify") {
				m = "<h1>Alterando documento</h1>";
			}
			
			$.blockUI({
 					message: m,
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
  				
        	$('#formDocument').ajaxForm(options).submit();			        	
		}
		
		function changeTipo() {
			
			var tipo = $("#codeTipoDoc").val();
			for (var i=0;i<tipoDocumento.length;i++) {
				var x = tipoDocumento[i];
				if (x.code == tipo) {
					if (x.provisory) { document.getElementById("trProvisorio").style.display = "table-row"; }
					else { document.getElementById("trProvisorio").style.display = "none"; } 
					if (x.renovation) { document.getElementById("trRenovacao").style.display = "table-row"; }
					else { document.getElementById("trRenovacao").style.display = "none"; } 
					if (x.pending) { document.getElementById("trPendente").style.display = "table-row"; }
					else { document.getElementById("trPendente").style.display = "none"; } 
				}
			}
			
		}
		
		function validateSave() {
			
	       	var descricao = $("#descricao").val();
	       	if (descricao == "") {
	    	   	alert("Descrição deve ser informada");
	    	   	return false;
	       	}
	       	
	       	var check = $("#chProvisorio").is(":checked");
	       	var narrativa = $("#narrativaProvisorio").val();
	       	if (check && narrativa == "") {
	       		alert("Narrativa do documento provisório deve ser informada");
	       		return false;
	       	}
	       	
	       	check = $("#chRenovacao").is(":checked");
	       	narrativa = $("#narrativaRenovacao").val();
	       	if (check && narrativa == "") {
	            alert("Narrativa do documento de renovação deve ser informada");
	       		return false;
	       	}
	       	
	       	check = $("#chPendente").is(":checked");
	       	narrativa = $("#narrativaPendente").val();
	       	if (check && narrativa == "") {
	            alert("Narrativa do documento pendente deve ser informada");
	       		return false;
	       	}

	       	return true;
	       	
		}
		
		function modifyDocument(doc,version) {
			var d = getDocumentByNumber(doc);
			if (d != null) {
				$("#formFornecedor").val(d.fornecedorId);
				$("#acao").val("modify");
				$("#document").val(d.numero);
				$("#version").val(version);
				$("#descricao").val(d.descricao);

				$('#ch-Provisorio').prop('checked', d.provisorio);
				$('#ch-Renovacao').prop('checked', d.renovacao);
				$('#ch-Pendente').prop('checked', d.pendente);
				
				change(document.getElementById("ch-Provisorio"));
				change(document.getElementById("ch-Renovacao"));
				change(document.getElementById("ch-Pendente"));
				
				if (d.descProvisorio != "null") { $("#narrativa-Provisorio").val(d.descProvisorio); }
				if (d.descRenovacao != "null") { $("#narrativa-Renovacao").val(d.descRenovacao); }
				if (d.descPendente != "null") { $("#narrativa-Pendente").val(d.descPendente); }
				
				$('#extra').prop('checked', d.extra);
				$('#expira').prop('checked', !d.expira);
				
				doValidate(document.getElementById("expira"));
				
				$("#dataEntrega").val(d.dataCriacao);
				if (d.expira) {  $("#dataVenc").val(d.dataExpiracao); }
				else { $("#dataVenc").val(""); }
				
				$("#codeTipoDoc option").each(function(){
					if ($(this).val() == d.palavra) {
						$(this).attr("selected","selected");  
					}
				});
				
				changeTipo(document.getElementById("codeTipoDoc"));
				
				$("#tituloDoc").html("Modificar documento");
	        	$("#dialogAddDocument").fadeIn();
	        	$("#divListDocuments").fadeOut();
			}
		} 

		function removeDocument(doc,version) {
			$("#acao").val("delete");
			$("#document").val(doc);
			$("#version").val(version);

			$.blockUI({
					message: '<h1>Eliminando documento</h1>',
					css: { 
		            border: 'none',
		          	padding: '15px', 
		            backgroundColor: '#000', 
		            '-webkit-border-radius': '10px', 
		            '-moz-border-radius': '10px', 
		            opacity: .5, 
		            color: '#fff' } 
			}); 
        	$('#formDocument').ajaxForm(options).submit();			        	
		}
		
		function doValidate(campo) {
			document.getElementById("dataVenc").disabled = campo.checked;
			if (campo.checked) { 
				$('#dataVenc').datepicker('disable');
				var f = document.getElementById("dataVenc");
				f.readOnly = false;
				f.style.backgroundColor = "#F8F8FF";
			} else {
				$('#dataVenc').datepicker('enable');
				var f = document.getElementById("dataVenc");
				f.readOnly = true;
				f.style.backgroundColor = "#FFFFFF";
			}
		}
		
		function change(campo) {
			var id = campo.id;
			var c = id.split("-");
			if (campo.checked) { 
				var f = document.getElementById("narrativa-" + c[1]);
				f.readOnly = false;
				f.style.backgroundColor = "#FFFFFF";
			} else {
				var f = document.getElementById("narrativa-" + c[1]);
				f.readOnly = true;
				f.style.backgroundColor = "#F8F8FF";
			}
		}
		
		function addDocument() {
			$("#acao").val("add");
			$("#document").val("0");
			$("#version").val("1000");
			$("#tituloDoc").html("Adicionar novo documento");
			
        	$("#dialogAddDocument").fadeIn();
        	$("#divListDocuments").fadeOut();
		}
		
		function onHistoryDoc() {
			historyDoc = !historyDoc;
			var table = document.getElementById("tableListDocuments");
			for (var i=2;i<table.rows.length;i++) {
				var r = table.rows[i];
				var id = r.id.split("-");
				if (historyDoc) { 
					r.style.display = "table-row";
					i++;
					r = table.rows[i];
					r.style.display = "table-row";
					i++;
					r = table.rows[i];
					r.style.display = "table-row";
				} 
				else if (id[2] == "true" ) { 
					r.style.display = "table-row"; 
					i++;
					r = table.rows[i];
					r.style.display = "table-row";
					i++;
					r = table.rows[i];
					r.style.display = "table-row";
				}
				else if (id[2] == "false" ) { 
					r.style.display = "none"; 
					i++;
					r = table.rows[i];
					r.style.display = "none";
					i++;
					r = table.rows[i];
					r.style.display = "none";
				}
			}
			fixBackground("tableListDocuments");
		}
		
	</script>

<% ArrayList<DocumentExtent> documentos = (ArrayList<DocumentExtent>) request.getAttribute("documentos"); %>
<% ArrayList<DocumentType> tipo = (ArrayList<DocumentType>) request.getAttribute("tipos"); %>

<% System.out.println("DOCS:" + documentos.size()); %>

	<script>
		var tipoDocumento = new Array();
<%  
	System.out.println("DocumentType:" + tipo.size());
	for (DocumentType d : tipo) { %>
		tipoDocumento.push({code: "<%=d.getCode()%>", description: "<%=d.getDescription()%>", provisory: <%=d.getProvisory()%>, renovation: <%=d.getRenovation()%>, pending: <%=d.getPending()%>, mandatory: <%=d.getMandatory()%> });
<%  }
	for (DocumentExtent doc : documentos) { 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("DESC:" + doc.getDocumentId() + ":" + doc.getExpirationDate() + ":" + doc.isExpires()); %>
		addDocumento(<%=doc.getDocumentId()%>, <%=doc.getParentDocumentId()%>, "<%=doc.getDocumentDescription()%>", "<%=doc.getAdditionalComments()%>", "<%=doc.getVersionDescription()%>", <%=doc.isActiveVersion()%>, "<%=sdf.format(doc.getCreateDate().toGregorianCalendar().getTime())%>", <%=doc.getVersion()%>, "<%=sdf.format(doc.getExpirationDate().toGregorianCalendar().getTime())%>", "<%=doc.getDatePending()%>", "<%=doc.getDateProvisory()%>", "<%=doc.getDateRenovation()%>", "<%=doc.getNotificationPending()%>", "<%=doc.getNotificationProvisory()%>", "<%=doc.getNotificationRenovation()%>", <%=doc.getPending()%>, <%=doc.getProvisory()%>, <%=doc.getRenovation()%>, <%=doc.isExpires()%>, <%=doc.getExtra()%>);
<%  } %>
	</script>
	
	<br>
	<div id="divListDocuments">
		<table id="tableListDocuments" border="0" rowspacing="2" style="width: 900px;">
			<tr>
				<td colspan=2><a href="javascript:home('dialogDocuments');">Voltar</a></td>
				<td colspan=2><a href="javascript:addDocument()">Adicionar documento</a></td>
				<td style="text-align: right;"><a href="javascript:onHistoryDoc();">Ver historico</a></td>
			</tr>
			<tr>
				<td colspan=5>
					<div class="ui-widget-header" style="height: 20px; width: 900px; vertical-align: middle; padding-left: 10px; padding-top: 5px">Documentos</div>
				</td>
			</tr>
			<%  for (DocumentExtent doc : documentos) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String d = sdf.format(doc.getCreateDate().toGregorianCalendar().getTime());
					String v = "Sem validade";
					System.out.println("EXXXXX:" + doc.getDocumentId() + ":" + doc.isActiveVersion() + ":" + doc.isExpires());
					if (doc.isExpires() && doc.getExpirationDate() != null) { v = sdf.format(doc.getExpirationDate().toGregorianCalendar().getTime()); }
					String show = ""; 
					if (!doc.isActiveVersion()) { 
						show = "display: none";
					}
					
			%>
				<tr id="tr-<%=doc.getDocumentId()%>-<%=doc.isActiveVersion()%>" style="<%=show%>">
					<td rowspan="3" width="15px">
			<% 		if (doc.isActiveVersion()) { %>					
						<img title="Modificar documento" src="imgs/modify.png" style="cursor: pointer;" onclick="javascript:modifyDocument(<%=doc.getDocumentId()%>, <%=doc.getVersion()%>)" /><br>
						<img title="Eliminar documento" src="imgs/document_delete.png" style="cursor: pointer;" onclick="javascript:removeDocument(<%=doc.getDocumentId()%>, <%=doc.getVersion()%>)" />
			<% 		} %>					
					</td>
					<td align="right" width="15%" style="font-weight: bold;">Documento:</td>
					<td colspan="2"><a href="/webdesk/documentviewer?WDNrDocto=<%=doc.getDocumentId()%>&WDNrVersao=<%=doc.getVersion()%>" target="_blank"><%=doc.getDocumentDescription()%></a></td>
					<td>
			<% 		if (doc.getExtra() != null && doc.getExtra()) { %>
						<font color="red">Documento extra</font>					
			<% 		} %>					
					</td>
				</tr>
				<tr style="<%=show%>">
					<td align="right" width="15%" style="font-weight: bold;">Descri&ccedil;&atilde;o:</td>
					<td colspan="3"><%=doc.getDocumentDescription()%></td>
				</tr>
				<tr style="<%=show%>">
					<td align="right" width="15%" style="font-weight: bold;">Data entrega:</td>
					<td><%=d%></td>
					<td align="right" width="15%" style="font-weight: bold;">Data vencimento:</td>
					<td><%=v%></td>
				</tr>
			<%  } %>
		</table>
	</div>
	<div id="dialogAddDocument" style="display: none">
		<div id="tituloDoc" class="ui-widget-header" style="height: 20px; width: 900px; vertical-align: middle; padding-left: 10px; padding-top: 5px">Adicionar novo documento</div>
		<div>
			<form id="formDocument" method="post" enctype="multipart/form-data" action="UploadFornecedor">
				<input type="hidden" name="formFornecedor" id="formFornecedor" />
				<input type="hidden" name="acao" id="acao" />
				<input type="hidden" name="document" id="document" />
				<input type="hidden" name="version" id="version" />
				<input id="obrigatorio" name="obrigatorio" type="hidden" />
				<table border="0" width="900px">
					<tr>
						<td class="tableLabel">Tipo documento:</td>
						<td colspan="3">
							<select id="codeTipoDoc" name="codeTipoDoc" onchange="changeTipo(this)" onclick="changeTipo(this)">
							<%  for (DocumentType d : tipo) { %>
								<option value="<%=d.getCode()%>">(<%=d.getCode()%>)<%=d.getDescription()%></option>
							<%  } %>
							</select>
							<script>
								changeTipo();
							</script>
						</td>
					</tr>
	        		<tr>
	        			<td width="15%" class="tableLabel" align="right">Descri&ccedil;&atilde;o documento:</td>
	        			<td width="85%" colspan="3">
	        				<input type="text" name="descricao" id="descricao" value="" size="30" />
	        			</td>
	        		</tr>
	        		<tr>
	        			<td width="15%" class="tableLabel" align="right">Condi&ccedil;&otilde;es:</td>
	        			<td width="85%" colspan="3">
	        				<table>
	        					<tr id="trProvisorio" style="display:none">
				        			<td>
				        				<label><input type="checkbox" name="ch-Provisorio" id="ch-Provisorio" value="1" onclick="change(this)" />Provis&oacute;rio</label>
				        				<input type="text" name="narrativa-Provisorio" id="narrativa-Provisorio" readonly style="background-color: #F8F8FF" size="40" />
				        			</td>
	        					</tr>
				        		<tr id="trRenovacao" style="display:none">
				        			<td>
				        				<label><input type="checkbox" name="ch-Renovacao" id="ch-Renovacao" value="1" onclick="change(this)" />Renova&ccedil;&atilde;o</label>
				        				<input type="text" name="narrativa-Renovacao" id="narrativa-Renovacao" size="40" readonly style="background-color: #F8F8FF" />
				        			</td>
				        		</tr>
				        		<tr id="trPendente" style="display:none">
				        			<td>
				        				<label><input type="checkbox" name="ch-Pendente" id="ch-Pendente" value="1" onclick="change(this)" />Pendente</label>
				        				<input type="text" name="narrativa-Pendente" id="narrativa-Pendente" size="40" readonly style="background-color: #F8F8FF" />
				        			</td>
				        		</tr>
	        				</table>
	        			</td>
	        		</tr>
	        		<tr>
	        			<td width="35%" class="tableLabel" align="right">Data entrega:</td>
	        			<td width="15%">
	        				<input id="dataEntrega" name="dataEntrega" type="text" size="12" />
	        			</td>
	        			<td width="15%" class="tableLabel" align="right">Data vencimento:</td>
	        			<td width="35%">
	        				<input id="dataVenc" name="dataVenc" type="text" size="12" value="" />&nbsp;&nbsp;
	        				<label><input type="checkbox" name="expira" onclick="javascript:doValidate(this);" id="expira" value="on" />Sem validade?</label>
	        			</td>
	        		</tr>
	        		<tr>
	        			<td width="15%" class="tableLabel" align="right">Upload documento:</td>
	        			<td width="85%" colspan="3">
	        				<input name="file" id="file" type="file" size="40"/>&nbsp;&nbsp;
	        				<label><input type="checkbox" name="extra" id="extra" value="on" />Extra?</label>
	        			</td>
	        		</tr>
	        		<tr>
	        			<td width="15%" align="right">&nbsp;</td>
	        			<td width="85%" colspan="3"><a href="javascript:salvar()">Salvar</a>&nbsp;<a href="javascript:fechar()">Fechar</a></td>
	        		</tr>
				</table>
		  	</form>
		</div>
	</div>		
	
	