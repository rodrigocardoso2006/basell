var form = (function(){
	var today = new Date();
	var current = null;
	return {
		start: function() {
			console.log("dialeto", dialeto)
			var file = "./analisecredito_" + dialeto + ".properties";
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
		}
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
					$(this).html(string[$(this).data("translate")] + ":");
				} else {
					$(this).html(string[$(this).data("translate")]);
				}
			})
			var interval = setInterval(function(){ 
				if ($(document.getElementById("ifDocumentos").contentWindow.document).find("label").length > 0) {
					clearInterval(interval);
					
					$(document.getElementById("ifDocumentos").contentWindow.document).find("label").each(function(index) {
						if ($(this).find("input").length != 0) {
							$(this).find("input")[0].nextSibling.nodeValue = string["nao_enviado"];
						} else {
							if ($(this).html().indexOf(":") != -1) {
								$(this).html(string["linha" + index] + ":");
							} else {
								$(this).html(string["linha" + index]);
							}					
						}
					});
					
					$(document.getElementById("ifDocumentos").contentWindow.document).find(".tableLabel").each(function(index) {
						if (string["td" + index] != undefined) {
							$(this).html(string["td" + index] + ":");
						} else if (index % 2 == 1) {
							$(this).html(string["justificativa"] + ":");
						}
					});
					
					$(document.getElementById("ifDocumentos").contentWindow.document).find("#enviar").val(string["enviararquivos"]);
					
				}
			}, 1000);
			
		}
	}
})();

function init() {
	
	console.log("idioma", dialeto);
	
	if (isNaN(atividade)) {
		atividade = parseInt(document.getElementById("atividadeAtual").value);
		analistaCredito = document.getElementById("analistaCredito").value == "true";
		usuario = document.getElementById("usuarioAtual").value;
	} else {
		document.getElementById("atividadeAtual").value = atividade;
		document.getElementById("analistaCredito").value = analistaCredito;
		document.getElementById("usuarioAtual").value = usuario;
	}
	
    if (analistaCredito == true) {
        document.getElementById("limite_concedido").readOnly = false;
        document.getElementById("limite_solicitado").readOnly = true;
        document.getElementById("limite_solicitado").className = "readonly";
        document.getElementById("novo_cliente").disabled = true;
        document.getElementById("alteracao_limite").disabled = true;
        document.getElementById("renovacao_anual").disabled = false;
        document.getElementById("zera_limite").disabled = false;
        document.getElementById("reducao_limite").disabled = false;
        atividade = 2;
    } else {
        document.getElementById("limite_concedido").readOnly = true;
        document.getElementById("limite_concedido").className = "readonly";
        document.getElementById("limite_solicitado").readOnly = false;
        document.getElementById("novo_cliente").disabled = false;
        document.getElementById("alteracao_limite").disabled = false;
        document.getElementById("renovacao_anual").disabled = false;
        document.getElementById("zera_limite").disabled = true;
        document.getElementById("reducao_limite").disabled = true;
    }
	
    if (mode != "VIEW") {
	    mCal = new dhtmlxCalendarObject('dt_analise', true, {
	        isYearEditable: true
	    });
	    mCal.setYearsRange(2000, 2500);
	    mCal.setDateFormat("%d/%m/%Y");
	    
/*	    it = new dhtmlxCalendarObject('inicioTitulo', true, {
	        isYearEditable: true
	    });
	    it.setYearsRange(2000, 2500);
	    it.setDateFormat("%d/%m/%Y");
	        
	    ft = new dhtmlxCalendarObject('fimTitulo', true, {
	        isYearEditable: true
	    });
	    ft.setYearsRange(2000, 2500);
	    ft.setDateFormat("%d/%m/%Y");
	*/	
		if (document.getElementById("novo_cliente").checked || document.getElementById("alteracao_limite").checked || document.getElementById("renovacao_anual").checked) {
            document.getElementById("justificativa").readOnly = false;
            document.getElementById("justificativa").className = "";
		}
    }
    
    var a = atividade;
	if (mode == "VIEW") { a = 2; }
	
	document.getElementById("ifDocumentos").src = "/analiseCredito/documentos.jsp?matr=" + usuario + "&ativ=" + atividade;
	
	if (atividade == 0 || atividade == 1) { 
		//aplicaFiltro();
	}
	
	if ((atividade == 0 || atividade == 1) && analistaCredito) {
		a = 2;
	}
	
	document.getElementById("ifAnalise").src = "/analiseCredito/analise.jsp?matr=" + usuario + "&ativ=" + a;
	
	form.start();
	
	console.log($(document.getElementById("ifDocumentos").contentWindow.document).find("label"))
}

function getAtividade() {
	return atividade;
}

function openZoomCliente(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_emitente&dataFields=codEmitente,C�digo,nomeEmit,Nome&resultFields=codEmitente,nomeEmit,nomeAbrev,limiteCredito,taxaFinanc,condicaoPagamento,descricaoPagamento&type=" + tipo + "&filterValues=matriz,true", "zoomCliente" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomCondicaoPagamento(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_condicao_pagamento&dataFields=codCondPag,C�digo,descricao,Descri��o&resultFields=codCondPag,descricao&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}

function setSelectedZoomItem(selectedItem) {
	if (selectedItem.type == "cliente") {
		document.getElementById("codigoCliente").value = selectedItem.codEmitente;
		document.getElementById("nomeAbreviado").value = selectedItem.nomeAbrev;
		document.getElementById("nomeEmitente").value = selectedItem.nomeEmit;
		document.getElementById("ind_cre_cli").value = selectedItem.limiteCredito;
		document.getElementById("dias_taxa").value = selectedItem.taxaFinanc;
		document.getElementById("cod_cond_pagamento").value = selectedItem.condicaoPagamento;
		document.getElementById("des_cond_pagamento").value = selectedItem.descricaoPagamento;
		
		onSelectedCliente(selectedItem.codEmitente);
		
	} else if (selectedItem.type == "condicaoPagamento") {
		document.getElementById("cod_cond_pagamento").value = selectedItem.codCondPag;				
		document.getElementById("des_cond_pagamento").value = selectedItem.descricao;
	}
}

function openProcesso(processo) {
	if (processo != "") {
		window.open("/webdesk/workflowdetail.jsp?processInstanceId=" + processo + "&processId=AnaliseCredito", "detalheProcesso" , "status , scrollbars=yes,width=600, height=350 , top=0 , left=0, resizable=yes");
	}
}

function onSelectedCliente(cliente) {
	
	var c1 = DatasetFactory.createConstraint("codigoCliente", cliente, cliente, ConstraintType.MUST); 
	var c2 = DatasetFactory.createConstraint("metadata#active", "true", "true", ConstraintType.MUST); 
	var dataset = DatasetFactory.getDataset("ds_analise_de_credito", null, new Array(c1, c2), null);
	
	if(dataset.values.length != 0) { 
		var record = dataset.values[dataset.values.length-1];

	    selectRadio("classificacao", eval("record['classificacao']"));
	    selectRadio("segmento", eval("record['segmento']"));
	    selectRadio("fidelidade_cliente", eval("record['fidelidade_cliente']"));
	    selectRadio("administracao", eval("record['administracao']"));
	    selectRadio("instalacoes", eval("record['instalacoes']"));
	    selectRadio("pontualidade", eval("record['pontualidade']"));
	    
	    document.getElementById("share_lbi").value = eval("record['share_lbi']");
	    document.getElementById("share_concorrente").value = eval("record['share_concorrente']");
	    document.getElementById("livre").value = eval("record['livre']");
	    document.getElementById("livre_analise").value = eval("record['livre_analise']");
	    document.getElementById("pastaCliente").value = eval("record['pastaCliente']");
        document.getElementById('principal_cliente').value= eval("record['principal_cliente']");
        document.getElementById('principal_cliente2').value= eval("record['principal_cliente2']");
        document.getElementById('principal_cliente3').value= eval("record['principal_cliente3']");
        
        document.getElementById('principal_fornecedor').value= eval("record['principal_fornecedor']");
        document.getElementById('principal_fornecedor2').value= eval("record['principal_fornecedor2']");
        document.getElementById('principal_fornecedor3').value= eval("record['principal_fornecedor3']");
        
        for(var i=1; i<17; i++) {
            document.getElementById('documento'+i).value = eval("record['documento" + i + "']");
            document.getElementById('justificativa'+i).value = eval("record['justificativa" + i + "']");
        }
        
		document.getElementById("ifDocumentos").contentWindow.setDocuments();
		document.getElementById("ifAnalise").contentWindow.setDocuments();

		clearTabela("tabelaHistorico");
		for (var i=0;i<dataset.values.length;i++) {
			var record = dataset.values[i];
			var c3 = DatasetFactory.createConstraint("workflowProcessPK.processInstanceId", eval("record['numProcesso']"), eval("record['numProcesso']"), ConstraintType.MUST); 
			var c4 = DatasetFactory.createConstraint("active", "false", "false", ConstraintType.MUST); 
			var wkf = DatasetFactory.getDataset("workflowProcess", null, new Array(c3, c4), null);
			if (wkf != null && wkf.values != null && wkf.values.length > 0) {
				var index = wdkAddChild('tabelaHistorico');
				document.getElementById("hSolicitado___" + index).value = "R$ " + eval("record['limite_solicitado']");
				document.getElementById("hConcedido___" + index).value = "R$ " + eval("record['limite_concedido']");
				document.getElementById("hProcesso___" + index).value = eval("record['numProcesso']");
				document.getElementById("hData___" + index).value = eval("record['dataProcesso']");
			}
		}
		document.getElementById("qtdetabelaHistorico").value = document.getElementById("tabelaHistorico").rows.length - 2;
		clearDelete("tabelaHistorico");
	}
	
	clearTabela("tabelaFilial");
	var c3 = DatasetFactory.createConstraint("cliente", document.getElementById("nomeAbreviado").value, document.getElementById("nomeAbreviado").value, ConstraintType.MUST); 
	var filiais = DatasetFactory.getDataset("ds_emitente_por_matriz", null, new Array(c3), null);
	if(filiais.values.length != 0) { 
		for (var i=0;i<filiais.values.length;i++) {
			var record = filiais.values[i];
			var index = wdkAddChild('tabelaFilial');
			document.getElementById("fCodigo___" + index).value = eval("record['codEmitente']");
			document.getElementById("fNome___" + index).value = eval("record['nomeAbrev']");
		}
		clearDelete("tabelaFilial");
	}
}

function clearTabela(tabela) {
	var t = document.getElementById(tabela);
	for (var i=2;i<t.rows.length;i++) {
		var r = t.rows[i];
		var c = r.cells[1];
		fnWdkRemoveChild(c);
i--;
	}
}


function clearDelete(tabela) {
	var t = document.getElementById(tabela);
	for (var i=0;i<t.rows.length;i++) {
		var r = t.rows[i];
		var c = r.cells[0];
		c.style.display = "none";
	}
	
}

function aplicaFiltro() {
	var c1 = DatasetFactory.createConstraint("cliente", document.getElementById("nomeAbreviado").value, document.getElementById("nomeAbreviado").value, ConstraintType.MUST);
	var c2 = DatasetFactory.createConstraint("dataInicial", document.getElementById("inicioTitulo").value, document.getElementById("inicioTitulo").value, ConstraintType.MUST);
	var c3 = DatasetFactory.createConstraint("dataFinal", document.getElementById("fimTitulo").value, document.getElementById("fimTitulo").value, ConstraintType.MUST);
	var c4 = DatasetFactory.createConstraint("diasAtraso", document.getElementById("atrasoTitulo").value, document.getElementById("atrasoTitulo").value, ConstraintType.MUST);
	var c5 = DatasetFactory.createConstraint("valorTitulo", document.getElementById("valorTitulo").value, document.getElementById("valorTitulo").value, ConstraintType.MUST);
	var dataset = DatasetFactory.getDataset("ds_titulos_cliente", null, new Array(c1, c2, c3, c4, c5), null);
	
	if(dataset != null && dataset.values.length != 0) { 
		clearTabela("tbFinanceiro");
		for (var i=0;i<dataset.values.length;i++) {
			var record = dataset.values[i];
			var index = wdkAddChild('tbFinanceiro');
			document.getElementById("fSequencia___" + index).value = (i+1);
			document.getElementById("fDocto___" + index).value = eval("record['numeroDocumento']");
			document.getElementById("fPar___" + index).value = eval("record['parcela']");
			document.getElementById("fEmissao___" + index).value = eval("record['dataEmissao']");
			document.getElementById("fVenc___" + index).value = eval("record['dataVencimento']");
			document.getElementById("fPagto___" + index).value = eval("record['dataPagamento']");
                        var v = eval("record['valor']");
			document.getElementById("fValor___" + index).value = valor(new String(v));
			document.getElementById("fAtraso___" + index).value = eval("record['qtdeDias']");
		}
		document.getElementById("qtdetbFinanceiro").value = document.getElementById("tbFinanceiro").rows.length - 2;
		
		var record = dataset.values[0];
		document.getElementById("atrasoMedioTitulo").value = eval("record['mediaDias']");
		document.getElementById("valorMedioTitulo").value = eval("record['mediaValor']");
	}
	clearDelete("tbFinanceiro");
}

function altera_limite(){
	if(document.getElementById('limite_concedido').value==""){
		show_docs(document.getElementById('limite_solicitado').value);
	}else{
		show_docs(document.getElementById('limite_concedido').value);
	}
	
}

function convertToFloatLocal(valor) {
	var numero = 0;
	if (valor != "") {
		numero = valor.replace('.', '');
		while (numero.indexOf(".") != -1) {
			numero = numero.replace('.', '');
		}
		numero = numero.replace(",", "."); 
	}
	return parseFloat(numero);
}

function show_docs(valor){
	valor=convertToFloatLocal(valor);
	compara = 50000;

	if(valor != 0){
		if (valor <= compara){
			document.getElementById("ifDocumentos").contentWindow.changeLimite(false);
		}else{
			document.getElementById("ifDocumentos").contentWindow.changeLimite(true);
		}
	}
}

function selectRadio(radio, valor) {
	var inputs = document.getElementsByName(radio);
    for (var i=0; i < inputs.length; i++) {
        if(inputs[i].value == valor.toString()) {
        	inputs[i].checked = true;
        }
    }	
}

function changeOrigem(campo) {
    if (campo.value == '4' || campo.value == '5') {
        document.getElementById("justificativa").readOnly = false;
        document.getElementById("justificativa").className = "";
        if (campo.value == "4") {
            document.getElementById("limite_solicitado").value = "0,00";
        }
    } else {
        document.getElementById("justificativa").readOnly = true;
        document.getElementById("justificativa").className = "readonly";
    }
}
