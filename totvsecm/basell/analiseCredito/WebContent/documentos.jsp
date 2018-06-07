<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/estilo.css"/>
		<script type="text/javascript" src="js/custom.js" ></script>
		<title></title>
	</head>
	<body onload="init()">
		<form action="UploadFiles" enctype="multipart/form-data" method="POST" onsubmit="return valida(); ">
			<input type="hidden" name="tipo" id="tipo" value="1">
			<input type="hidden" name="pastaCliente" id="pastaCliente" value="<%= request.getAttribute("folderCustomer") %>">
			<input type="hidden" name="codigoCliente" id="codigoCliente" value="<%= request.getAttribute("codeCustomer") %>">
			<input type="hidden" name="atividade" id="atividade" value="<%= request.getParameter("ativ") %>">
			
			<table border="0">
				<tr id="linha1">
					<td>
						<table width="757" border="0">
							<tr>
								<td width=21><img src="imgs/atencao.png" id="img_doc1" onclick="openAnexo('1');"></td>
								<td class="tableLabel" width="220"><label>Rela&ccedil;&atilde;o 12 &Uacute;ltimos Faturamentos:</label></td>
								<td>
									<input type="hidden" name="documento1" id="documento1" value="<%=request.getAttribute("documento1")%>">
									<input type="file" id="file1" name="file1" size=40>
								</td>
								<td class="tableCell">
									<label for="nao_enviado1" style="padding-bottom: 4px">
										<input type="checkbox" name="nao_enviado1" id="nao_enviado1" style="border:0px" onClick="nao_enviado('1');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa1" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2"><input type="text" name="justificativa1" id="justificativa1" size="60" value="<%=request.getAttribute("justificativa1")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr id="linha2">
					<td>
						<table  width="100%">
							<tr>
								<td width="21"><img src="imgs/atencao.png" id="img_doc2" onclick="openAnexo('2');"></td>
								<td class="tableLabel" width="220">Ficha Cadastral:</td>
								<td class="tableCell">
									<input type="hidden" name="documento2" id="documento2" value="<%=request.getAttribute("documento2")%>">
									<input type="file" id="file2" name="file2" size=40>
								</td>
								<td class="tableCell">
									<label for="nao_enviado2">
										<input type="checkbox" name="nao_enviado2" id="nao_enviado2" style="border:0px" onClick="nao_enviado('2');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa2" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa2" id="justificativa2" size="60" value="<%=request.getAttribute("justificativa2")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr id="linha3">
					<td >
						<table width="100%">
							<tr>
								<td  width="21"><img src="imgs/atencao.png" id="img_doc3" onclick="openAnexo('3');"></td>
								<td class="tableLabel" width="220">Contrato Social:</td>
								<td class="tableCell">
									<input type="hidden" name="documento3" id="documento3" value="<%=request.getAttribute("documento3")%>">
									<input type="file" id="file3" name="file3" size=40>
								</td>
								<td class="tableCell">
									<label>
										<input type="checkbox" name="nao_enviado3" id="nao_enviado3" style="border:0px" onClick="nao_enviado('3');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa3" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa3" id="justificativa3" size="60" value="<%=request.getAttribute("justificativa3")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr id="linha4">
					<td>
						<table width="100%">
							<tr>
								<td  width="21"><img src="imgs/atencao.png" id="img_doc4" onclick="openAnexo('4');"></td>
								<td class="tableLabel" width="220">&Uacute;ltima Altera&ccedil;&atilde;o Contrato Social:</td>
								<td class="tableCell">
									<input type="hidden" name="documento4" id="documento4" value="<%=request.getAttribute("documento4")%>">
									<input type="file" id="file4" name="file4" size=40>
								</td>
								<td class="tableCell">
									<label>
										<input type="checkbox" name="nao_enviado4" id="nao_enviado4" style="border:0px" onClick="nao_enviado('4');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa4" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa4" id="justificativa4" size="60" value="<%=request.getAttribute("justificativa4")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr  id="linha5">
					<td >
						<table width="100%">
							<tr>
								<td width="21"><img src="imgs/atencao.png" id="img_doc5" onclick="openAnexo('5');"></td>
								<td class="tableLabel" width="220"><label>Certid&atilde;o Negativa Serasa:</label></td>
								<td class="tableCell">
									<input type="hidden" name="documento5" id="documento5" value="<%=request.getAttribute("documento5")%>">
									<input type="file" id="file5" name="file5" size=40>
								</td>
								<td class="tableCell">
									<label>
										<input type="checkbox" name="nao_enviado5" id="nao_enviado5" style="border:0px" onClick="nao_enviado('5');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa5" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa5" id="justificativa5" size="60" value="<%=request.getAttribute("justificativa5")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr  id="linha6">
					<td>
						<table width="100%">
							<tr>
								<td  width="21"><img src="imgs/atencao.png" id="img_doc6" onclick="openAnexo('6');"></td>
								<td class="tableLabel" width="220">Balancete do Ano Corrente:</td>
								<td class="tableCell">
									<input type="hidden" name="documento6" id="documento6" value="<%=request.getAttribute("documento6")%>">
									<input type="file" id="file6" name="file6" size=40>
								</td>
								<td class="tableCell">
									<label>
										<input type="checkbox" name="nao_enviado6" id="nao_enviado6" style="border:0px" onClick="nao_enviado('6');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa6" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa6" id="justificativa6" size="60" value="<%=request.getAttribute("justificativa6")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
<!-- 				<tr  id="linha7">
					<td >
						<table width="100%">
							<tr>
								<td width="21"><img src="imgs/atencao.png" id="img_doc7" onclick="openAnexo('7');"></td>
								<td class="tableLabel" width="220">Balan&ccedil;o dos 3 &Uacute;ltimos Exerc&iacute;cios:</td>
								<td class="tableCell">
									<input type="hidden" name="documento7" id="documento7" value="<%=request.getAttribute("documento7")%>">
									<input type="file" id="file7" name="file7" size=40>
								</td>
								<td class="tableCell">
									<label>
										<input type="checkbox" name="nao_enviado7" id="nao_enviado7" style="border:0px" onClick="nao_enviado('7');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa7" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa7" id="justificativa7" size="60" value="<%=request.getAttribute("justificativa7")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr> -->
				<tr  id="linha8">
					<td >
						<table width="100%">
							<tr>
								<td  width="21"><img src="imgs/atencao.png" id="img_doc8" onclick="openAnexo('8');"></td>
								<td class="tableLabel" width="220">Balan&ccedil;o Exerc&iacute;cio Atual -1:</td>
								<td class="tableCell">
									<input type="hidden" name="documento8" id="documento8" value="<%=request.getAttribute("documento8")%>">
									<input type="file" id="file8" name="file8" size=40>
								</td>
								<td class="tableCell">
									<label>
										<input type="checkbox" name="nao_enviado8" id="nao_enviado8" style="border:0px" onClick="nao_enviado('8');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa8" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa8" id="justificativa8" size="60" value="<%=request.getAttribute("justificativa8")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr  id="linha9">
					<td >
						<table width="100%">
							<tr>
								<td  width="21"><img src="imgs/atencao.png" id="img_doc9" onclick="openAnexo('9');"></td>
								<td class="tableLabel" width="220">Balan&ccedil;o Exerc&iacute;cio Atual -2:</td>
								<td class="tableCell">
									<input type="hidden" name="documento9" id="documento9" value="<%=request.getAttribute("documento9")%>">
									<input type="file" id="file9" name="file9" size=40>
								</td>
								<td class="tableCell">
									<label>
										<input type="checkbox" name="nao_enviado9" id="nao_enviado9" style="border:0px" onClick="nao_enviado('9');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa9" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa9" id="justificativa9" size="60" value="<%=request.getAttribute("justificativa9")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr  id="linha10">
					<td >
						<table width="100%">
							<tr>
								<td  width="21"><img src="imgs/atencao.png" id="img_doc10" onclick="openAnexo('10');"></td>
								<td class="tableLabel" width="220">Balan&ccedil;o Exerc&iacute;cio Atual -3:</td>
								<td class="tableCell">
									<input type="hidden" name="documento10" id="documento10" value="<%=request.getAttribute("documento10")%>">
									<input type="file" id="file10" name="file10" size=40>
								</td>
								<td class="tableCell">
									<label>
										<input type="checkbox" name="nao_enviado10" id="nao_enviado10" style="border:0px" onClick="nao_enviado('10');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa10" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa10" id="justificativa10" size="60" value="<%=request.getAttribute("justificativa10")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr  id="linha11">
					<td >
						<table width="100%">
							<tr>
								<td width="21"><img src="imgs/atencao.png" id="img_doc11" onclick="openAnexo('11');"></td>
								<td class="tableLabel" width="220">Rela&ccedil;&atilde;o de Bens da Empresa:</td>
								<td class="tableCell">
									<input type="hidden" name="documento11" id="documento11" value="<%=request.getAttribute("documento11")%>">
									<input type="file" id="file11" name="file11" size=40>
								</td>
								<td class="tableCell">
									<label>
										<input type="checkbox" name="nao_enviado11" id="nao_enviado11" style="border:0px" onClick="nao_enviado('11');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa11" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa11" id="justificativa11" size="60" value="<%=request.getAttribute("justificativa11")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr  id="linha12">
					<td >
						<table width="100%">
							<tr>
								<td  width="21"><img src="imgs/atencao.png" id="img_doc12" onclick="openAnexo('12');"></td>
								<td class="tableLabel" width="220">Rela&ccedil;&atilde;o das ap&oacute;lices de Seguro:</td>
								<td class="tableCell">
									<input type="hidden" name="documento12" id="documento12" value="<%=request.getAttribute("documento12")%>">
									<input type="file" id="file12" name="file12" size=40>
								</td>
								<td class="tableCell">
									<label>
										<input type="checkbox" name="nao_enviado12" id="nao_enviado12" style="border:0px" onClick="nao_enviado('12');">N&atilde;o Enviado
									</label>
								</td>
							</tr>
							<tr id="linha_justificativa12" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
								<td colspan="2" class="tableCell"><input type="text" name="justificativa12" id="justificativa12" size="60" value="<%=request.getAttribute("justificativa12")%>" onblur="changeJustificativa(this)"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td style="text-align: center;" align="center">
						<input type="submit" id="enviar" value="Enviar arquivos" size="30" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>