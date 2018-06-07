function nao_enviado(camponr){
	if(document.getElementById("nao_enviado" + camponr).checked){
		document.getElementById("linha_justificativa" + camponr).style.display="table-row";
		document.getElementById("documento" + camponr).value = "nao";
		parent.document.getElementById("documento" + camponr).value = "nao";
	}else{
		document.getElementById("linha_justificativa" + camponr).style.display="none";
		parent.document.getElementById("justificativa" + camponr).value = "";
		parent.document.getElementById("documento" + camponr).value = "";
	}
}

function changeLimite(show) {
	var valor = "none";
	if (show) { valor = "table-row"; }
	for (var i=6;i<13;i++) {
		if (document.getElementById("linha" + i) != undefined) {
			document.getElementById("linha" + i).style.display = valor;
		}
	}
}

function init() {
	
	var atividade = parent.getAtividade();
	setDocuments();
	window.parent.altera_limite();
	if (isNaN(atividade) || atividade == 0 || atividade == 1 || atividade == 2) {
		for (var i=0;i<17;i++) {
			if (document.getElementById("documento" + i) && document.getElementById("documento" + i).value != "" && document.getElementById("documento" + i).value != "null") {
				parent.document.getElementById("documento" + i).value = document.getElementById("documento" + i).value; 
				parent.document.getElementById("justificativa" + i).value = document.getElementById("justificativa" + i).value; 
				if (document.getElementById("documento" + i).value == "nao") {
					document.getElementById("linha_justificativa" + i).style.display="table-row";
					document.getElementById("nao_enviado" + i).checked = true;
				} else {
					document.getElementById("img_doc" + i).src = "imgs/pdf.png";
					document.getElementById("img_doc" + i).style.cursor = "pointer"; 
				}
			}
			if (document.getElementById("justificativa" + i) && document.getElementById("justificativa" + i).value == "null") {
				document.getElementById("justificativa" + i).value = "";
			}
		}
		parent.document.getElementById("pastaCliente").value = document.getElementById("pastaCliente").value; 
	}
	if (atividade != 2) {
		
		if (document.getElementById("documento13")) {
			document.getElementById("file13").disabled = true;
			document.getElementById("nao_enviado13").disabled = true;
			document.getElementById("justificativa13").disabled = true;
			document.getElementById("enviar").disabled = true;
		}
	}
}

function setDocuments() {
	for (var i=1;i<17;i++) {
		if (document.getElementById("documento" + i)) {
			if (parent.document.getElementById("documento" + i).value != "" && parent.document.getElementById("documento" + i).value != "null") {
				var doc = parent.document.getElementById("documento" + i).value;
				if (doc == "nao") {
					document.getElementById("linha_justificativa" + i).style.display="table-row";
					document.getElementById("nao_enviado" + i).checked = true;
					document.getElementById("justificativa" + i).value = parent.document.getElementById("justificativa" + i).value;
				} else {
					document.getElementById("img_doc" + i).src = "imgs/pdf.png";
					document.getElementById("img_doc" + i).style.cursor = "pointer";
					document.getElementById("documento" + i).value = doc;
				}
			}
//			document.getElementById("file" + i).disabled = true;
//			document.getElementById("nao_enviado" + i).disabled = true;
//			document.getElementById("justificativa" + i).readOnly = true;				
//			document.getElementById("justificativa" + i).className = "readonly";				
		}
	}
//	document.getElementById("enviar").style.display = "none";
	document.getElementById("codigoCliente").value = parent.document.getElementById("codigoCliente").value;
}

function openAnexo(sequencia) {
	var d = document.getElementById("documento" + sequencia).value;
	if (d != "" && d != "null") {
		window.open("/webdesk/documentviewer?WDNrDocto=" + d + "&WDNrVersao=1000", "Documento", "zoomDocumento", "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
	}
}

function changeJustificativa(campo) {
	parent.document.getElementById(campo.id).value = document.getElementById(campo.id).value;
}