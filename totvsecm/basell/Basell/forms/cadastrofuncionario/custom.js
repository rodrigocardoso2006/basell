function openZoom(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=colleague&dataFields=colleaguePK.colleagueId,Matricula,colleagueName,Nome&resultFields=colleagueId,colleagueName&type=" + tipo, "zoom" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function setSelectedZoomItem(selectedItem) {
	if (selectedItem.type == "usuario") {
		document.getElementById("matricula").value = selectedItem.colleagueId;
		document.getElementById("nome").value = selectedItem.colleagueName;
	} 
}

