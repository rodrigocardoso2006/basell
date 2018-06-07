<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<link rel="stylesheet" href="js/jquery-ui/css/cupertino/jquery-ui.custom.css" />
		<link rel="stylesheet" type="text/css" href="css/estilo.css"/>
		<script src="js/jquery-ui/js/jquery.js"></script>
		<script src="js/jquery-ui/js/jquery-ui.custom.js"></script>
  		<script>
  			$(function() {
    			$( "#accordion").accordion({
    				  beforeActivate: function(event, ui) {
    					  
//    					  for (var x in ui.newHeader) {
 //   						  alert(x + ":" + ui.newHeader[x]);
  //  					  }
    				  }
    			});
  			});
  		</script>		
		<title></title>
	</head>
	<body>
  		<div id="conteudo">
	  		<table width="50%" border="0">
	   			<tr>
	   				<td><img id="logo" src="/util/images/Logo.gif" border="0" /></td>
	         		<td align="center" class="titRelatotio"><h1>Adicionar Documentos de fornecedores</h1></td>
	            </tr>
			</table>
		</div>
		<br>
		<form method="POST" onsubmit="return valida(); ">
			<table border="0" width="100%">
				<tr>
					<td align="center" style="text-align: center"><label>Pesquisar por:</label> <input type="text" size="20" id="pesquisar" name="pesquisar" /><img src="imgs/find.png" border="0" title="Pesquisar" /><img id="loadingSearch" src="imgs/ajax-tool.gif" style="display: none" /></td>
					<td><a href=""><img src="imgs/history.png" border="0" title="Ver hist&oacute;rico" /></a></td>
				</tr>
			</table>
		</form>
	</body>
</html>