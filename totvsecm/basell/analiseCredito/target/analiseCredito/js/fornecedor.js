function openZoomFornecedor() {
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_emitente&dataFields=codEmitente,Código,nomeAbrev,Nome Abrev,nomeEmit,Nome&resultFields=codEmitente,nomeEmit,nomeAbrev&type=cliente", "zoomCliente" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function setSelectedZoomItem(selectedItem) {
	if (selectedItem.type == "cliente") {
		document.getElementById("codigoFornecedor").value = selectedItem.codEmitente;
		document.getElementById("nomeFornecedor").value = selectedItem.nomeAbrev;
	}
}

function addFornecedor() {
	
	var fornecedor = $("#codigoFornecedor").val();
	var nome = $("#nomeFornecedor").val();
	var grupo = $("#novoGrupo").val();
	
	var params = { acao: "sf", codigo: fornecedor, nome: nome, grupo: grupo };
	
	$.ajax({
		type: "POST",
		url: "/analiseCredito/Fornecedor",
		data: params
	}).done(function( msg ) {
		alert( "Data Saved: " + msg );
	});
}

function changeTipo(campo) {
	var t = $("#" + campo).val();
	for (var i=0;i<tipoDocumento.length;i++) {
		var tp = tipoDocumento[i];
		alert(t + ":" + tp.code);
		if (t == tp.code) {
			if (tp.provisory) { document.getElementById("trProvisorio").style,display = "inline"; } 
			else { document.getElementById("trProvisorio").style,display = "none"; }

			if (tp.renovation) { document.getElementById("trRenovacao").style,display = "inline"; } 
			else { document.getElementById("trRenovacao").style,display = "none"; }

			if (tp.pending) { document.getElementById("trPendente").style,display = "inline"; } 
			else { document.getElementById("trPendente").style,display = "none"; }
			
			$("#obrigatorio").val(tp.mandatory);
		}
	}
}