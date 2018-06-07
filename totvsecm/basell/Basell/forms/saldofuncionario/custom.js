function openZoom(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_funcionario&dataFields=matricula,Matricula,nome,Nome&resultFields=matricula,nome,matriculaRh&type=" + tipo, "zoom" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function openZoomBeneficio(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_beneficio&dataFields=nome,Beneficio&resultFields=nome,codigoEvento&type=" + tipo, "zoom" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function setSelectedZoomItem(selectedItem) {
	if (selectedItem.type == "usuario") {
		document.getElementById("matricula").value = selectedItem.matricula;
		document.getElementById("nome").value = selectedItem.nome;
		document.getElementById("matriculaRh").value = selectedItem.matriculaRh;
	} else if (selectedItem.type == "beneficio") {
		document.getElementById("nomeBeneficio").value = selectedItem.nome;
		document.getElementById("codigoEvento").value = selectedItem.codigoEvento;
	}
}

