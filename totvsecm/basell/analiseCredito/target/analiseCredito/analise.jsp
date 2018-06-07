<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/estilo.css"/>
		<script type="text/javascript" src="js/custom.js" ></script>
		<title></title>
	</head>
	<body onload="init()">
		<form action="UploadFiles" enctype="multipart/form-data" method="POST" onsubmit="return valida(); ">
			<input type="hidden" name="tipo" id="tipo" value="2">
			<input type="hidden" name="pastaCliente" id="pastaCliente" value="<%= request.getAttribute("folderCustomer") %>">
			<input type="hidden" name="atividade" id="atividade" value="<%= request.getParameter("ativ") %>">
			<input type="hidden" name="codigoCliente" id="codigoCliente" value="<%= request.getAttribute("codeCustomer") %>">
			
			<table border="0">
	            <tr  id="linha13">
		            <td >
	                    <table width="100%">
	                        <tr>
				                <td width="21"><img src="imgs/atencao.png" id="img_doc13" onclick="openAnexo('13');"></td>
				                <td class="tableLabel" width="220">Demonstra&ccedil;&otilde;es Financeiras:</td>
				                <td class="tableCell">
				                	<input type="hidden" name="documento13" id="documento13" value="<%=request.getAttribute("documento13")%>">
									<input type="file" id="file13" name="file13" size=40>
				                </td>
				                <td class="tableCell">
				                	<label>
				                		<input type="checkbox" name="nao_enviado13" id="nao_enviado13" style="border:0px" onClick="nao_enviado('13');">N&atilde;o Enviado
				                	</label>
				                </td>
	                        </tr>
	                        <tr id="linha_justificativa13" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
	                            <td colspan="2" class="tableCell"><input type="text" name="justificativa13" id="justificativa13" size="60" value="<%=request.getAttribute("justificativa13")%>" onblur="changeJustificativa(this)"></td>
	                        </tr>
	                    </table>
	                </td>
	            </tr>
<!--  	            <tr  id="linha14">
		            <td >
	                    <table width="100%">
	                        <tr>
				                <td width="21"><img src="imgs/atencao.png" id="img_doc14" onclick="openAnexo('14');"></td>
				                <td class="tableLabel" width="220">An&aacute;lise Temporal:</td>
				                <td class="tableCell">
				                	<input type="hidden" name="documento14" id="documento14" value="<%=request.getAttribute("documento14")%>">
									<input type="file" id="file14" name="file14" size=40>
				                </td>
				                <td class="tableCell">
				                	<label>
				                		<input type="checkbox" name="nao_enviado14" id="nao_enviado14" style="border:0px" onClick="nao_enviado('14');">N&atilde;o Enviado
				                	</label>
				                </td>
	                        </tr>
	                        <tr id="linha_justificativa14" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
	                            <td colspan="2" class="tableCell"><input type="text" name="justificativa14" id="justificativa14" size="60" value="<%=request.getAttribute("justificativa14")%>" onblur="changeJustificativa(this)"></td>
	                        </tr>
	                    </table>
	                </td>
	            </tr>
	            <tr  id="linha15">
		            <td >
	                    <table width="100%">
	                        <tr>
				                <td width="21"><img src="imgs/atencao.png" id="img_doc15" onclick="openAnexo('15');"></td>
				                <td class="tableLabel" width="220">Vendas e Faturamento:</td>
				                <td class="tableCell">
				                	<input type="hidden" name="documento15" id="documento15" value="<%=request.getAttribute("documento15")%>">
									<input type="file" id="file15" name="file15" size=40>
				                </td>
				                <td class="tableCell">
				                	<label>
				                		<input type="checkbox" name="nao_enviado15" id="nao_enviado15" style="border:0px" onClick="nao_enviado('15');">N&atilde;o Enviado
				                	</label>
				                </td>
	                        </tr>
	                        <tr id="linha_justificativa15" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
	                            <td colspan="2" class="tableCell"><input type="text" name="justificativa15" id="justificativa15" size="60" value="<%=request.getAttribute("justificativa15")%>" onblur="changeJustificativa(this)"></td>
	                        </tr>
	                    </table>
	                </td>
	            </tr>
	            <tr  id="linha16">
		            <td >
	                    <table width="100%">
	                        <tr>
				                <td width="21"><img src="imgs/atencao.png" id="img_doc16" onclick="openAnexo('16');"></td>
				                <td class="tableLabel" width="220">Risco e Cr&eacute;dito:</td>
				                <td class="tableCell">
				                	<input type="hidden" name="documento16" id="documento16" value="<%=request.getAttribute("documento16")%>">
									<input type="file" id="file16" name="file16" size=40>
				                </td>
				                <td class="tableCell">
				                	<label>
				                		<input type="checkbox" name="nao_enviado16" id="nao_enviado16" style="border:0px" onClick="nao_enviado('16');">N&atilde;o Enviado
				                	</label>
				                </td>
	                        </tr>
	                        <tr id="linha_justificativa16" style="display:none">
								<td></td>
								<td class="tableLabel">Justificativa:</td>
	                            <td colspan="2" class="tableCell"><input type="text" name="justificativa16" id="justificativa16" size="60" value="<%=request.getAttribute("justificativa16")%>" onblur="changeJustificativa(this)"></td>
	                        </tr>
	                    </table>
	                </td>
	            </tr>-->
				<tr>
					<td style="text-align: center;" align="center">
						<input type="submit" id="enviar" value="Enviar arquivos" size="30" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>