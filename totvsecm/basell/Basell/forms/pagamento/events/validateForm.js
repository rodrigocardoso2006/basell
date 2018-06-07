function validateForm(form){

	var atividade = parseInt(getValue("WKNumState"));
	var usuario = getValue("WKUser");
	
	if (isNaN(atividade)) {
		atividade = parseInt(form.getValue("atividadeAtual"));
		usuario = form.getValue("usuarioAtual");
	}
  if (atividade == 1 || atividade == 0) {
	if (form.getValue("fornecedor_h") == "" || form.getValue("fornecedor_h") == null) {
		throw "Informe o fornecedor";
	}
	if (form.getValue("aprovadorPri_h") == "" || form.getValue("aprovadorPri_h") == null) {
		throw "Informe o usuário aprovador";
	}
	
	if (form.getValue("tipoPagamento") == "" || form.getValue("tipoPagamento") == null) {
		throw "Informe o tipo de pagamento";
	}

	if (isAprovador(usuario) == false && (atividade == 0 || atividade == 1 || atividade == 3)) {
		if (form.getValue("tipoPagamento") != "8" && form.getValue("tipoPagamento") != "9") {
			if (form.getValue("aprovador_h") == "" || form.getValue("aprovador_h") == null) {
				throw "Informe o segundo aprovador";
			}
		}
		if (form.getValue("aprovador_h") == form.getValue("aprovadorPri_h")) {
			throw "O primeiro e o segundo aprovadores são o mesmo usuário";
		}
	}

	if (isAprovador(usuario) && form.getValue("aprovadorPri_h") == usuario) {
		throw "Usuário aprovador não pode ser igual ao solicitante";
	}
	
	var c1 = DatasetFactory.createConstraint("processo", form.getValue("tipoPagamento"), form.getValue("tipoPagamento"), ConstraintType.MUST);
	var c2 = DatasetFactory.createConstraint("metadata#active", "true", "true", ConstraintType.MUST);
	var constraints = new Array(c1,c2);
	var config = DatasetFactory.getDataset("ds_configuracao_pagamento", null, constraints, null);
	if (config.rowsCount > 0) {
		var dias = parseInt(config.getValue(0, "vencimento"));
		var venc = "01/01/0001";
		if (form.getValue("tipoPagamento")  == "1" || form.getValue("tipoPagamento")  == "2" || form.getValue("tipoPagamento")  == "3") {
			venc = form.getValue("periodo1");
		} else if (form.getValue("tipoPagamento") == "4") {
			venc = form.getValue("periodo2");
		} else if (form.getValue("tipoPagamento") == "5" || form.getValue("tipoPagamento") == "6" || form.getValue("tipoPagamento")  == "7") {
			venc = form.getValue("periodo3");
		}  else if (form.getValue("tipoPagamento") == "8" || form.getValue("tipoPagamento") == "9") {
			venc = form.getValue("periodo4");
		}
		venc = venc.split("/");
		var dataTela = new Date(venc[1]+"/"+venc[0]+"/"+venc[2]); 
		var dataMax = new Date(new Date().getTime() + dias*24*60*60*1000);
		
		log.info("DATAS:" + dias + ":" + dataTela + ":" + dataMax);
		
		if (dataTela<dataMax) {
			throw "A data de vencimento não pode ser inferior a " + dataMax.getDate() + "/" + (dataMax.getMonth()+1) + "/" + dataMax.getFullYear();				
		}
	}
	
	if (form.getValue("tipoPagamento") == "1" || form.getValue("tipoPagamento") == "2" || form.getValue("tipoPagamento") == "3") {
		if (form.getValue("periodo1") == "" || form.getValue("periodo1") == null) {
			throw "Informe a data de vencimento";
		}
		if (form.getValue("valor1") == "" || form.getValue("valor1") == null) {
			throw "Informe o valor";
		}
		if (form.getValue("descricao1") == "" || form.getValue("descricao1") == null) {
			throw "Informe a descrição";
		}
	}
	if (form.getValue("tipoPagamento") == "4") {
		if (form.getValue("periodo2") == "" || form.getValue("periodo2") == null) {
			throw "Informe a data de vencimento";
		}
		if (form.getValue("valor2") == "" || form.getValue("valor2") == null) {
			throw "Informe o valor";
		}
		if (form.getValue("descricao2") == "" || form.getValue("descricao2") == null) {
			throw "Informe a descrição";
		}
		if (parseInt(form.getValue("qtdeTipo2")) == NaN || parseInt(form.getValue("qtdeTipo2")) <= 0) {
			throw "Adicione ao menos uma conta contábil";
		}
		var campoIndex = 1;
		var qteLinhas = parseInt(form.getValue("qtdeTipo2"));
		while (campoIndex <= qteLinhas) {
			var campoValue = form.getValue("codigoContaTipo2___" + campoIndex);
			if (campoValue == null) {
				campoIndex = campoIndex + 1;
				qteLinhas = qteLinhas + 1;
			} else {
				if (campoValue == '') {
					throw "Selecione uma conta contábil";
				} 
				if (form.getValue("codigoCCTipo2___" + campoIndex) == "" || form.getValue("codigoCCTipo2___" + campoIndex) == null) {
					throw "Selecione um centro de custo";
				}
				campoIndex = campoIndex + 1;
			}
		}
	}
	if (form.getValue("tipoPagamento") == "5" || form.getValue("tipoPagamento") == "6" || form.getValue("tipoPagamento") == "7") {
		if (form.getValue("periodo3") == "" || form.getValue("periodo3") == null) {
			throw "Informe a data de vencimento";
		}
		if (form.getValue("valor3") == "" || form.getValue("valor3") == null) {
			throw "Informe o valor";
		}
		if (form.getValue("descricao3") == "" || form.getValue("descricao3") == null) {
			throw "Informe a descrição";
		}
		if (form.getValue("conta3") == "" || form.getValue("conta3") == null) {
			throw "Informe a conta contábil";
		}
		if (form.getValue("CentroCusto_h") == "" || form.getValue("CentroCusto_h") == null) {
			throw "Informe o centro de custo";
		}
	}
	if (form.getValue("tipoPagamento") == "8" || form.getValue("tipoPagamento") == "9") {
		if (form.getValue("periodo4") == "" || form.getValue("periodo4") == null) {
			throw "Informe a data de vencimento";
		}
		if (form.getValue("valor4") == "" || form.getValue("valor4") == null) {
			throw "Informe o valor";
		}
		if (form.getValue("descricao4") == "" || form.getValue("descricao4") == null) {
			throw "Informe a descrição";
		}
		if (form.getValue("centroCusto4") == "" || form.getValue("centroCusto4") == null) {
			throw "Informe o centro de custo";
		}
		var campoIndex = 1;
		var qteLinhas = parseInt(form.getValue("qtdeTipo4"));
		while (campoIndex <= qteLinhas) {
			var campoValue = form.getValue("codigoContaTipo4___" + campoIndex);
			if (campoValue == null) {
				campoIndex = campoIndex + 1;
				qteLinhas = qteLinhas + 1;
			} else {
				if (campoValue == '') {
					throw "Selecione uma conta contábil";
				} 
				campoIndex = campoIndex + 1;
			}
		}
	}
  }
}
