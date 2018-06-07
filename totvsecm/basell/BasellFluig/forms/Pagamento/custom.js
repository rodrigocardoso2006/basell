var form = (function(){
	var today = new Date();
	var current = null;
	var loading = FLUIGC.loading(window);
	var index = 1;
	return {
		start: function() {
			form.current = form.getcurrent();
			form.current();
			events.setup();
		},
		clearfields: function(lista) {
			var t = lista.split(",");
			for (var i=0; i<t.length; i++){
				$("#" + t[i]).val("");
			}
		},
		getcurrent: function() {
			if (mode == "VIEW") { return form.isview; }
			else if (atividade == 0 || atividade == 4) { return form.issolicitante; }
			else if (atividade == 5) { return form.isaprovacaogestor; }
			else if (atividade == 16) { return form.ismapacotacao; }
			else if (atividade == 51) { return form.isaprovavaomapa; }
			else if (atividade == 19) { return form.isrecomendacao; }
			else if (atividade == 25) { return form.isencaminharminuta; }
			else if (atividade == 30) { return form.iselaborarcontrato; }
			else if (atividade == 32) { return form.isvalidarminuta; }
			else if (atividade == 37) { return form.isenviarcontrato; }
			else if (atividade == 42) { return form.isimprimir; }
			else if (atividade == 63) { return form.isprepararpasta; }
			else if (atividade == 65) { return form.isaprovacaodiretor; }
			else if (atividade == 69) { return form.isanalisepasta; }
			else if (atividade == 73) { return form.isfinalizacao; }
			return form.isview;
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


var pos;
function calculaTotal() {
//	var n1 = convertToFloat("#valor3");
//	var n2 = convertToFloat("#valorJuros");
//	$('#valorTotal').val((parseFloat(n1)+parseFloat(n2)).toFixed(2));
}

function getURLParameter(name) {
	return decodeURIComponent((new RegExp('[?|&]' + name + '=' + '([^&;]+?)(&|#|;|$)').exec(location.search)||[,""])[1].replace(/\+/g, '%20'))||null;
}

function somaTotalTipo2() {
	var index = 1;
	var linhas = parseInt(document.getElementById("qtdeTipo2").value);
	var total = 0;
	while (index <= linhas) {
		var campoValue = document.getElementById("valorTipo2___" + index);
		if (campoValue == null) {
			index = index + 1;
			linhas = linhas + 1;
		} else {
			if  (campoValue.value != "") {
				var valorc = convertToFloat(campoValue.id);
				total += valorc;
			}
			index = index + 1;
		}
	}
	$('#valor2').val(valor("" + total.toFixed(2)));
}

function somaTotalTipo4() {
	var index = 1;
	var linhas = parseInt(document.getElementById("qtdeTipo4").value);
	var total = 0;
	while (index <= linhas) {
		var campoValue = document.getElementById("valorTipo4___" + index);
		if (campoValue == null) {
			index = index + 1;
			linhas = linhas + 1;
		} else {
			if  (campoValue.value != "") {
				var valorc = convertToFloat(campoValue.id);
				total += valorc;
			}
			index = index + 1;
		}
	}
	$('#valor4').val(valor("" + total.toFixed(2)));
}

function incluir(tabela, total) {
	var index = wdkAddChild(tabela);	
    var t = document.getElementById(tabela).tBodies[0];
    document.getElementById(total).value = t.rows.length - 2;
}

function changePagamento(campo) {
	document.getElementById('tipo1').style.display = "none";			
	document.getElementById('tipo2').style.display = "none";
	document.getElementById('tipo3').style.display = "none";
	document.getElementById('tipo4').style.display = "none";
	var t = campo.options[campo.options.selectedIndex].value;
	var d = "1";
	if (!isAprovador()) {
		document.getElementById('segAprovador').style.display = "block";
	}
	if (t == 4) {
		d = "2";
	} else if (t == 5 || t == 6 || t == 7) {
		d = "3";
	} else if (t == 8 || t == 9) {
		d = "4";
		document.getElementById('aprovador_h').value = "";
		document.getElementById('aprovador').value = "";
		document.getElementById('segAprovador').style.display = "none";
	} 
	document.getElementById('tipo' + d).style.display = "block";			
	document.getElementById('tipo').value = d;			
}


function openZoom(tipo) {
	var campo = document.getElementById("tipoPagamento");
	var t = campo.options[campo.options.selectedIndex].value;
	
	var role = 1;
	if (t == 4 || t == 5 || t == 6 || t == 7) {
		role = 3;
	} else if (t == 8) {
		role = 11;
	}
	if (tipo == "segundo") { role = 1; }	
	window.open("/webdesk/zoom.jsp?datasetId=ds_papel_colaborador&dataFields=colleagueId,Matricula,colleagueName,Nome&resultFields=colleagueId,colleagueName&type=" + tipo + "&filterValues=roleId," + role, "zoom" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function openZoomFornecedor(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_emitente&dataFields=codEmitente,C�digo,nomeEmit,Nome&resultFields=codEmitente,nomeEmit&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function openZoomConta(campo, tipo) {
	var td = campo.parentNode;
	pos = getPosicaoFilho(td.childNodes[0].id);
	var campo = document.getElementById("tipoPagamento");
	var p = campo.options[campo.options.selectedIndex].value; 
	window.open("/webdesk/zoom.jsp?datasetId=ds_usuario_conta&dataFields=conta,C�digo,descricaoConta,Descri��o&resultFields=conta,descricaoConta&type=" + tipo + "&filterValues=processo," + p + ",usuario," + usuario, "zoomConta" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function openZoomCentroCusto(campo, tipo) { 
	var td = campo.parentNode;
	pos = getPosicaoFilho(td.childNodes[0].id);
	var campo = document.getElementById("tipoPagamento");
	var p = campo.options[campo.options.selectedIndex].value; 
	window.open("/webdesk/zoom.jsp?datasetId=ds_usuario_centro_custo&dataFields=centroCusto,C�digo,descricaoCentroCusto,Descri��o&resultFields=centroCusto,descricaoCentroCusto&type=" + tipo + "&filterValues=processo," + p + ",usuario," + usuario, "zoomConta" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function openZoomConta3(tipo) {
	var campo = document.getElementById("tipoPagamento");
	var p = campo.options[campo.options.selectedIndex].value; 
	window.open("/webdesk/zoom.jsp?datasetId=ds_usuario_conta&dataFields=conta,C�digo,descricaoConta,Descri��o&resultFields=conta,descricaoConta&type=" + tipo + "&filterValues=processo," + p + ",usuario," + usuario, "zoomConta" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function openZoomCentroCusto3(tipo) { 
	var campo = document.getElementById("tipoPagamento");
	var p = campo.options[campo.options.selectedIndex].value; 
	window.open("/webdesk/zoom.jsp?datasetId=ds_usuario_centro_custo&dataFields=centroCusto,C�digo,descricaoCentroCusto,Descri��o&resultFields=centroCusto,descricaoCentroCusto&type=" + tipo + "&filterValues=processo," + p + ",usuario," + usuario, "zoomConta" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function setSelectedZoomItem(selectedItem) {
	if (selectedItem.type == "primeiro") {
		document.getElementById("aprovadorPri_h").value = selectedItem.colleagueId;
		document.getElementById("aprovadorPri").value = selectedItem.colleagueName;
	} else if (selectedItem.type == "segundo") {
		document.getElementById("aprovador_h").value = selectedItem.colleagueId;
		document.getElementById("aprovador").value = selectedItem.colleagueName;
	} else if (selectedItem.type == "fornecedor") {
		document.getElementById("fornecedor_h").value = selectedItem.codEmitente;
		document.getElementById("fornecedor").value = selectedItem.nomeEmit;
	} else if (selectedItem.type == "conta2") {
		document.getElementById("codigoContaTipo2___" + pos).value = selectedItem.conta;
		document.getElementById("nomeContaTipo2___" + pos).value = selectedItem.descricaoConta;
	} else if (selectedItem.type == "centrocusto2") {
		document.getElementById("codigoCCTipo2___" + pos).value = selectedItem.centroCusto;
		document.getElementById("nomeCCTipo2___" + pos).value = selectedItem.descricaoCentroCusto;
	} else if (selectedItem.type == "conta3") {
		document.getElementById("conta3").value = selectedItem.conta;
		document.getElementById("ContaT").value = selectedItem.descricaoConta;
	} else if (selectedItem.type == "centrocusto3") {
		document.getElementById("CentroCusto_h").value = selectedItem.centroCusto;
		document.getElementById("CentroCustoT").value = selectedItem.descricaoCentroCusto;
	} else if (selectedItem.type == "conta4") {
		document.getElementById("codigoContaTipo4___" + pos).value = selectedItem.conta;
		document.getElementById("nomeContaTipo4___" + pos).value = selectedItem.descricaoConta;
	} else if (selectedItem.type == "centrocusto4") {
		document.getElementById("centroCusto4").value = selectedItem.centroCusto;
		document.getElementById("descricaoCentroCusto4").value = selectedItem.descricaoCentroCusto;
	}
}

function hiddenButtons() {
	var imagens = document.getElementsByTagName("img");  
	for (var i = 0; i < imagens.length; i++) {
		if (imagens[i].id != "logo") {
			imagens[i].style.display = "none";
		}
	}
	document.getElementById("btAddTipo2").style.display = "none";
	document.getElementById("btAddTipo4").style.display = "none";
	
}

function enableFields(atividade) {
	setReadOnly("serie");
	setReadOnly("periodo1");
	setReadOnly("valor1");
	setReadOnly("descricao1");
	setReadOnly("ndoc2");
	setReadOnly("periodo2");
	setReadOnly("valor2");
	setReadOnly("descricao2");
	setReadOnly("ndoc3");
	setReadOnly("ndoc3");
	setReadOnly("periodo3");
	setReadOnly("valor3");
	setReadOnly("descricao3");
	setReadOnly("periodo4");
	setReadOnly("valor4");
	setReadOnly("descricao4");

	var campoIndex = 1;
	var qteLinhas = parseInt(document.getElementById("qtdeTipo2").value);
	while (campoIndex <= qteLinhas) {
		var campoValue = document.getElementById("valorTipo2___" + campoIndex);
		if (campoValue == null) {
			campoIndex = campoIndex + 1;
			qteLinhas = qteLinhas + 1;
		} else {
			setReadOnly(campoValue.id);
			campoIndex = campoIndex + 1;
		}
	}
	
	campoIndex = 1;
	qteLinhas = parseInt(document.getElementById("qtdeTipo4").value);
	while (campoIndex <= qteLinhas) {
		var campoValue = document.getElementById("valorTipo4___" + campoIndex);
		if (campoValue == null) {
			campoIndex = campoIndex + 1;
			qteLinhas = qteLinhas + 1;
		} else {
			setReadOnly(campoValue.id);
			campoIndex = campoIndex + 1;
		}
	}
	
}

function setReadOnly(campo) {
	document.getElementById(campo).className = "readonly";
	document.getElementById(campo).readOnly = true;
}

function getPosicaoFilho(id) {
	return id.substr(id.indexOf("___") + 3); 
}

function convertToFloat(campo) {
	var valor = document.getElementById(campo).value;
	var numero = 0;
	if (valor != "") { 
		numero = valor.replaceAll('.', '');
		numero = numero.replace(",", "."); 
	}
	return parseFloat(numero);
}

function nationalDays(date) {
	var m = date.getMonth() + 1, d = date.getDate(), y = date.getFullYear();
	for (var i=0;i<holidays.length;i++) {
		var h = holidays[i];
		if (h != "") {
			var dateHoliday = h.split("-");
			if (dateHoliday[2] == 0 && dateHoliday[0] == m && dateHoliday[1] == d) {
				return [false];
			} else if (dateHoliday[2] == y && dateHoliday[0] == m && dateHoliday[1] == d) {
				return [false];
			}
		}
	}
	return [true];
}
function noWeekendsOrHolidays(date) {
	var noWeekend = jQuery.datepicker.noWeekends(date);
	return noWeekend[0] ? nationalDays(date) : noWeekend;
}

String.prototype.replaceAll = function(search, replace)
{
/*    while (this.indexOf(search) != -1) {
    	this.replace(search, replace);
    }*/
    
    return this.replace(new RegExp('[' + search + ']', 'g'), replace);;
};

function tipoDelete2(oElement){ 
	fnWdkRemoveChild(oElement);
    var t = document.getElementById("tbTipo2").tBodies[0];
    document.getElementById("qtdeTipo2").value = t.rows.length - 2;
	somaTotalTipo2();
}

function tipoDelete4(oElement){ 
	fnWdkRemoveChild(oElement);
    var t = document.getElementById("tbTipo4").tBodies[0];
    document.getElementById("qtdeTipo4").value = t.rows.length - 2;
	somaTotalTipo4();
}
