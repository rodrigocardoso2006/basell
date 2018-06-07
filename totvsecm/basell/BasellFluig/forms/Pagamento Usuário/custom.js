var form = (function(){
	var today = new Date();
	var current = null;
	var loading = FLUIGC.loading(window);
	var index = 1;
	return {
		start: function() {
			events.setup();
			if (mode == "VIEW") {
				form.isview();
			}
		},
		isview: function() { 
			$(".zoom-click").hide();
			$(".no-view").hide();
		},
	}
})();

var zooms = (function(){
	return {
		usuario: function() {
			window.open("/webdesk/zoom.jsp?datasetId=colleague&dataFields=colleaguePK.colleagueId,Matricula,colleagueName,Nome&resultFields=colleagueId,colleagueName&type=usuario", "zoom" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
		},
		conta: function(c) {
			var id = $(c).attr("id");
			form.index = id.substr(id.indexOf("___") + 3);
			window.open("/webdesk/zoom.jsp?datasetId=ds_lista_conta_contabil&dataFields=codigo,Código,descricao,Descrição&resultFields=codigo,descricao&type=conta", "zoomConta" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
		},
		centrocusto: function(c) {
			var id = $(c).attr("id");
			form.index = id.substr(id.indexOf("___") + 3);
			window.open("/webdesk/zoom.jsp?datasetId=ds_lista_centro_custo&dataFields=codigo,Código,descricao,Descrição&resultFields=codigo,descricao&type=centrocusto", "zoomConta" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
		}
	}
})();

var events = (function(){
	return {
		setup: function() {
			$(document).on("click", ".zoom-click", function() {
				var ev = $(this).data("event");
				zooms[ev](this);
			});			
			$(".btn-conta").click(function() {
				wdkAddChild("tbConta");	
			});
			$(".btn-centrocusto").click(function() {
				wdkAddChild("tbCentroCusto");	
			});
			$("#processo").change(function() {
				$("descricao").val($("#nomeUsuario").val() + " - " + $(this).find('option:selected').text());  
			});
		}
	}
})();

$(document).ready(function() {
	form.start();
});

function setSelectedZoomItem(selectedItem) {
	var tipo = selectedItem.type;
	if (tipo == "usuario") {
		document.getElementById("codigo").value = selectedItem.colleagueId;
		document.getElementById("nomeUsuario").value = selectedItem.colleagueName;
		$("descricao").val($("#nomeUsuario").val() + " - " + $("#processo").find('option:selected').text());
	} else if (tipo == "conta") {
		document.getElementById("codigoConta___" + form.index).value = selectedItem.codigo;
		document.getElementById("nomeConta___" + form.index).value = selectedItem.descricao;
	} else if (tipo == "centrocusto") {
		document.getElementById("codigoCentroCusto___" + form.index).value = selectedItem.codigo;
		document.getElementById("nomeCentroCusto___" + form.index).value = selectedItem.descricao;
	}
}
