function validateForm(form){
	
	var atividade = parseInt(form.getValue("atividadeAtual"));
	if (atividade == 0 || atividade == 1) {
		if (isEmpty("codigoCliente")) {
			throw "Informe o cliente";
		}
		if (isEmpty("origem_analise")) {
			throw "Informe a origem da analise";
		}
/*		if (isEmpty("classificacao")) {
			throw "Informe a classificação";
		}*/
		if (isEmpty("segmento")) {
			throw "Informe o segmento";
		}
		if (form.getValue("origem_analise") != "4" && isEmpty("limite_solicitado") && isEmpty("limite_concedido")) {
			throw "Informe o Limite Solicitado ou o Limite Concedido";
		}
		if (isEmpty("cod_cond_pagamento")) {
			throw "Informe a condição de pagamento";
		}
/*		if (isEmpty("share_lbi")) {
			throw "Informe a Participação da LBI e da Concorrência";
		}
		if (isEmpty("quantidade_atual") || isEmpty("valor_atual") || isEmpty("quantidade_previsao") || isEmpty("valor_previsao")) {
			throw "Informe os campos referentes às vendas LBI para cliente";
		}
		if (isEmpty("fidelidade_cliente")) {
			throw "Informe a Fidelidade do Cliente";
		}
		if (isEmpty("administracao")) {
			throw "Informe a Administação do Cliente (Familiar, Profisional ou Mista)";
		}
		if (isEmpty("instalacoes")) {
			throw "Informe a instalação do Cliente (Próprias, Alugadas, Financiadas)";
		}
		if (isEmpty("pontualidade")) {
			throw "Informe a pontualidade do Cliente";
		}
		if (isEmpty("principal_cliente") || isEmpty("principal_fornecedor") || isEmpty("principal_cliente2") || isEmpty("principal_fornecedor2") || isEmpty("principal_cliente3") || isEmpty("principal_fornecedor3")) {
			throw "Informe pelo menos um cliente e fornecedor principal";
		}*/
		var n = "";
		if (isAnalistaCredito(getValue("WKUser"))) {
			n = form.getValue("limite_concedido").replace(".",""); 
		} else {
			n = form.getValue("limite_solicitado").replace(".",""); 
		}

		while (n.indexOf(".") != -1) {
			n = n.replace(".","");
		}
		
		n = n.replace(",", ".");
		
		var valor = parseFloat(n);

		var limite = parseFloat(form.getValue("primeira_faixa"));
		for (var i=1;i<13;i++) {
			log.info("i:" + i + ":" + valor + ":" + limite);
            if (i != 7) {
			if (isEmpty("documento" + i) && isEmpty("justificativa" + i)) {
				if (valor <= 50000) {
					if (i<6 || i>12) {
						throw getDocumentMessage(i);
					}
				} else {
					throw getDocumentMessage(i);
				}
			}
            }
		}
		
	}
	
	if (atividade == 2 || (isAnalistaCredito(getValue("WKUser")) && (atividade == 0 || atividade == 1))) {
		if (isEmpty("classeRisco")) {
			throw "Classificação de risco deve ser selecionada";
		}
		if (isEmpty("livre_analise")) {
			throw "Narrativa da analise é obrigatório";
		}
		if (isEmpty("limite_concedido")) {
			throw "Informe o limite concedido para o cliente";
		}
		if (isEmpty("documento13") && isEmpty("justificativa13")) {
				throw getDocumentMessage(13);
		}
	}
			
	
	function isEmpty(campo) {
		return form.getValue(campo) == null || form.getValue(campo) == "";
	}

}