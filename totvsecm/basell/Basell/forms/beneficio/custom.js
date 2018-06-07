var listaMes = ["jan/", "fev/", "mar/", "abr/", "mai/", "jun/", "jul/", "ago/", "set/", "out/", "nov/", "dez/"]
var pos = 0;

var form = (function(){
	var today = new Date();
	var current = null;
	var dialeto = "pt";
	return {
		start: function() {
			events.setup();
			console.log("dialeto", dialeto)
			var file = "./beneficio_" + dialeto + ".properties";
			console.log(file)
			
			var rawFile = new XMLHttpRequest();
		    rawFile.open("GET", file, false);
		    rawFile.onreadystatechange = function () {
		        if(rawFile.readyState === 4) {
		            if(rawFile.status === 200 || rawFile.status == 0) {
		                var allText = rawFile.responseText;
		                var lines = allText.split("\n");
		                for (var i=0; i<lines.length; i++) {
		                	var l = lines[i];
		                	var key = l.substring(0, l.indexOf("="));
		                	var text = l.substring(l.indexOf("=")+1);
		                	if (key != "") {
			                	translate.add(key, text);
		                	}
		                } 
		                
		                translate.dotranslate();
		            }
		        }
		    }
		    rawFile.send(null);
		},
		clearfields: function(lista) {
			var t = lista.split(",");
			for (var i=0; i<t.length; i++){
				$("#" + t[i]).val("");
			}
		},
	}
})();


var translate = (function(){
	var string = {};
	return {
		add: function(key, text) {
			string[key] = text;
		},
		dotranslate: function() {
			console.log("dotrans", string)
			$('[data-translate]').each(function() {
				console.log("translate", $(this).data("translate"), string);
				if ($(this).html().indexOf(":") != -1) {
					$(this).html(string[$(this).data("translate")].trim() + ":");
				} else {
					$(this).html(string[$(this).data("translate")].trim());
				}
			})
		}
	}
})();

var zooms = (function(){
	return {
	}
})();

var events = (function(){
	return {
		setup: function() {
		}
	}
})();

function init() {
	form.start();
	if (atividade == 2) {
		$("#btnAddBeneficio").hide();
		var table = document.getElementById("tbItem");
		for (var i=2;i<table.rows.length;i++) {
			var row = table.rows[i];
			$(row).first().find('img').hide();
			var l = row.cells[5].getElementsByTagName("label");
			var r1 = l[0].getElementsByTagName("input");
			var r2 = l[1].getElementsByTagName("input");
			if (!r1[0].checked) {
				$(l[0]).hide();
			}
			if (!r2[0].checked) {
				$(l[1]).hide();
			}
		}
		
		var campoIndex = 1;
		var qteLinhas = table.rows.length - 2;
		while (campoIndex <= qteLinhas) {
			var campoValue = document.getElementById("valorDespesa___" + campoIndex);
			if (campoValue == null) {
				campoIndex = campoIndex + 1;
				qteLinhas = qteLinhas + 1;
			} else {
				setReadOnly(campoValue.id);
				campoIndex = campoIndex + 1;
			}
			if (campoIndex > 1000) {
				break;
			}
		}
		
	}
}

function getPosicaoFilho(id) {
	console.log("id", id)
	return id.substr(id.indexOf("___") + 3); 
}

function incluir(tabela) {
	var index = wdkAddChild(tabela);
	document.getElementById("sequencia___" + index).value = index;
	$('#valorDespesa___' + index).mask("#.###.##0,00", {reverse: true, maxlength: false});
}

function openZoomBeneficio(campo, tipo) {
	var td = campo.parentNode;
	pos = getPosicaoFilho($(campo).parent().find("input").attr("id"));
	window.open("/webdesk/zoom.jsp?datasetId=ds_beneficio&dataFields=nome,Beneficio&resultFields=nome,valorLimite,tipoIntervalo,codigoEvento,periodoAnual,periodoMensalInicial,percentualDependente,periodoMensalFinal&type=" + tipo + "&filterValues=metadata_active,true", "zoomBeneficio" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function setSelectedZoomItem(selectedItem) {
	if (selectedItem.type == "beneficio") {
		document.getElementById("nomeBeneficio___" + pos).value = selectedItem.nome;
		
		var limite = getFloatValue(selectedItem.valorLimite);
		
		var today = new Date();	
		var end = selectedItem.periodoMensalFinal;
		end = end.split("/");
		var endData = new Date(today.getFullYear(), today.getMonth(), end[0]);
		var mes = today.getMonth() + 1;
		if (mes < 10) { mes = "0" + mes; }
		var dia = today.getDate();
		if (dia < 10) { dia = "0" + dia; }
		var a = today.getFullYear();
		if (today <= endData) {
			document.getElementById("dataLimite___" + pos).value = dia + "/" + mes + "/" + today.getFullYear();
		} else {
			endData.setMonth(endData.getMonth() + 1);
			mes = endData.getMonth() + 1;
			if (mes < 10) { mes = "0" + mes; }
			var dia = endData.getDate();
			if (dia < 10) { dia = "0" + dia; }
			a = endData.getFullYear();
			document.getElementById("dataLimite___" + pos).value = dia + "/" + mes + "/" + endData.getFullYear();
		}
		document.getElementById("mesCompetencia___" + pos).value = listaMes[(+mes) - 1] + a;
		
		var limiteUsuario = getLimiteUsuario(usuario, selectedItem.nome);
		if (limiteUsuario != null) {
			var v = getFloatValue(limiteUsuario.saldoAtribuido);
			if (!isNaN(v) && v > 0) {
				limite = v;
			} 
		}
		
		var competencia = document.getElementById("mesCompetencia___" + pos).value;
		if (selectedItem.tipoIntervalo == "1") {
			competencia = "dez/" + today.getFullYear();
		}
		
		$("tipoIntervalo___" + pos).val(selectedItem.tipoIntervalo);
		
		var saldo = getSaldoAtual(usuario, selectedItem.codigoEvento, competencia);
		if (saldo == -1) {
			document.getElementById("totalAprovado___" + pos).value = "0,00";
			document.getElementById("saldoDisponivel___" + pos).value = limite.toFixed(2);
		} else {
			var s = parseFloat(saldo);
			document.getElementById("totalAprovado___" + pos).value = (limite - s).toFixed(2);
			document.getElementById("saldoDisponivel___" + pos).value = saldo.toFixed(2);
		}
		
		document.getElementById("valorLimite___" + pos).value = document.getElementById("saldoDisponivel___" + pos).value;
		
		document.getElementById("codigoEvento___" + pos).value = selectedItem.codigoEvento;
		document.getElementById("periodoAnual___" + pos).value = competencia;
		document.getElementById("periodoMensalInicial___" + pos).value = selectedItem.periodoMensalInicial;
		document.getElementById("periodoMensalFinal___" + pos).value = selectedItem.periodoMensalFinal;
		document.getElementById("percentualDependente___" + pos).value = selectedItem.percentualDependente;
		
		$('#valorReembolso___' + pos).mask("#.###.##0,00", {reverse: true, maxlength: false});
		$('#saldoDisponivel___' + pos).mask("#.###.##0,00", {reverse: true, maxlength: false});
		$('#totalAprovado___' + pos).mask("#.###.##0,00", {reverse: true, maxlength: false});
		$('#valorLimite___' + pos).mask("#.###.##0,00", {reverse: true, maxlength: false});
		
	}
}

function getLimiteUsuario(matricula, beneficio) {
	var c1 = DatasetFactory.createConstraint("matricula", matricula, matricula, ConstraintType.MUST); 
	var c2 = DatasetFactory.createConstraint("nomeBeneficio", beneficio, beneficio, ConstraintType.MUST); 
	var c3 = DatasetFactory.createConstraint("metadata#active", "true", "true", ConstraintType.MUST); 
	var dataset = DatasetFactory.getDataset("ds_saldo_funcionario", null, new Array(c1, c2, c3), null);
	if(dataset.values.length != 0) { 
		var record = dataset.values[dataset.values.length-1];
		var o = new Object();
		o["dataVigenciaInicio"] = eval("record['dataVigenciaInicio']");
		o["dataVigenciaFim"] = eval("record['dataVigenciaFim']");
		o["saldoAtribuido"] = eval("record['saldoAtribuido']");
		return o;
	}
	return null;
}

function getFloatValue(valor) {
	var numero = 0;
	if (valor != "") { numero = valor.replace(".", "").replace(",", "."); }
	return parseFloat(numero);
}

function getSaldoAtual(matricula, evento, mes) {
	var c1 = DatasetFactory.createConstraint("matricula", matricula, matricula, ConstraintType.MUST); 
	var c2 = DatasetFactory.createConstraint("codigoEvento", evento, evento, ConstraintType.MUST); 
	var c3 = DatasetFactory.createConstraint("mes", mes, mes, ConstraintType.MUST); 
	var dataset = DatasetFactory.getDataset("ds_saldo_atual", null, new Array(c1, c2, c3), null);
	if (dataset != null && dataset.values.length > 0) {
		var record = dataset.values[dataset.values.length-1];
		return eval("record['saldo']");
	}
	
	return -1;
	
}

function changeBeneficiario(campo) {
	if (atividade != 2) {
		var p = getPosicaoFilho(campo.id);
		document.getElementById("tipoIntervalo___" + p).value = campo.value;
		calcula(p);
	}
}

function changeDespesa(campo) {
	if (atividade != 2) {
		var p = getPosicaoFilho(campo.id);
		calcula(p);
	}
}

function calcula(posicao) {
	var d = getFloatValue(document.getElementById("valorDespesa___" + posicao).value);
	var s = getFloatValue(document.getElementById("valorLimite___" + posicao).value);
	var r = 0;
	
	if (d != 0) {
		var evento = document.getElementById("codigoEvento___" + posicao).value;
		var mes = document.getElementById("periodoAnual___" + posicao).value;
		var saldo = getSaldoTela(evento, mes); 
		document.getElementById("tipoIntervalo___" + posicao).value;
		if (document.getElementById("tipoIntervalo___" + posicao).value == "1") {
			r = s - d;
			if (r<0) {	r = s; }
			else {
				r = saldo - d;
				if (r<0) {	r = saldo; }
				else { r = d; } 
			}
		} else if (document.getElementById("tipoIntervalo___" + posicao).value == "2") {
			var dp = getFloatValue(document.getElementById("percentualDependente___" + posicao).value);
			d = d * (dp/100); 
			r = s - d;
			if (r<0) {	r = saldo; }
			else {
				r = saldo - d;
				if (r<0) {	r = saldo; }
				else { r = d; } 
			}
		}
		document.getElementById("valorReembolso___" + posicao).value = r.toFixed(2);
		$('#valorReembolso___' + posicao).mask("#.###.##0,00", {reverse: true, maxlength: false});
		
		calculaReembolso();
		calculaSaldo();
		
	}
}

function calculaReembolso() {
	var table = document.getElementById("tbItem");
	var o = new Object();
	for (var i=2;i<table.rows.length;i++) {
		var row = table.rows[i];
		var id = $(row).first().find('input').attr("id");
		var p = getPosicaoFilho(id);
		var d = getFloatValue(document.getElementById("valorReembolso___" + p).value);
		var e = document.getElementById("codigoEvento___" + p).value;
		var m = document.getElementById("periodoAnual___" + p).value;
		if (o[e + "|" + m] == undefined) {
			o[e + "|" + m] = d;
		} else {
			o[e + "|" + m] += d;
		}
		document.getElementById("totalReembolso___" + p).value = o[e + "|" + m].toFixed(2); 
		$('#totalReembolso___' + p).mask("#.###.##0,00", {reverse: true, maxlength: false});
	}
}

function calculaSaldo() {
	var table = document.getElementById("tbItem");
	var o = new Object();
	for (var i=2;i<table.rows.length;i++) {
		var row = table.rows[i];
		var id = $(row).first().find('input').attr("id");
		var p = getPosicaoFilho(id);
		var d = getFloatValue(document.getElementById("valorReembolso___" + p).value);
		var s = getFloatValue(document.getElementById("valorLimite___" + p).value);
		var e = document.getElementById("codigoEvento___" + p).value;
		var m = document.getElementById("periodoAnual___" + p).value;

		if (o[e + "|" + m] == undefined) {
			o[e + "|" + m] = s - d;
		} else {
			o[e + "|" + m] -= d;
		}
		
		document.getElementById("saldoDisponivel___" + p).value = o[e + "|" + m].toFixed(2); 
		$('#saldoDisponivel___' + p).mask("#.###.##0,00", {reverse: true, maxlength: false});
	}
	
	document.getElementById("saldoBeneficio").value = "";
	document.getElementById("listaBeneficio").value = "";
	for (prop in o) {
		if (prop != "toXMLRPC") {
			if (document.getElementById("saldoBeneficio").value == "") {
				document.getElementById("saldoBeneficio").value = o[prop];
				document.getElementById("listaBeneficio").value = prop;
			} else {
				document.getElementById("saldoBeneficio").value += "," + o[prop];
				document.getElementById("listaBeneficio").value += "," + prop;
			}
		}
	}	
}

function getSaldoTela(evento, mes) {
	var table = document.getElementById("tbItem");
	var o = new Object();
	for (var i=2;i<table.rows.length;i++) {
		var row = table.rows[i];
		var id = $(row).first().find('input').attr("id");
		var p = getPosicaoFilho(id);
		var d = getFloatValue(document.getElementById("valorReembolso___" + p).value);
		var s = getFloatValue(document.getElementById("valorLimite___" + p).value);
		var e = document.getElementById("codigoEvento___" + p).value;
		var m = document.getElementById("periodoAnual___" + p).value;
		if (o[e + "|" + m] == undefined) {
			o[e + "|" + m] = s - d;
		} else {
			o[e + "|" + m] -= d;
		}
	}
	
	return o[evento + "|" + mes];
	
}

function setReadOnly(campo) {
	document.getElementById(campo).className = "readonly";
	document.getElementById(campo).readOnly = true;
}
