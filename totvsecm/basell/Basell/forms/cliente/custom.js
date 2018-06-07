function openZoomCliente(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_emitente&dataFields=codEmitente,Código,nomeEmit,Nome&resultFields=codEmitente,nomeAbrev&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomGrupoCliente(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_grupo_cliente&dataFields=codGrCli,Código,descricao,Descrição&resultFields=codGrCli,descricao,codTransp,descricaoTransporte,codRep,nomeRepresentante,atividade,categoria,tpRecDesp,descricaoReceita,codPortador,nomeAbrevPortador,modalidadePortador,codCondPag,descricaoCondPag&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomGrupoFornec(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_grupo_fornecedor&dataFields=codGrForn,Código,descricao,Descrição&resultFields=codGrForn,descricao&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomRepresentante(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_representante&dataFields=codRep,Código,nome,Nome&resultFields=codRep,nome&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomTransporte(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_transporte&dataFields=codTransp,Código,nome,Nome&resultFields=codTransp,nome&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomMicroRegiao(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_micro_regiao&dataFields=nomeAbrev,Nome abreviado,nomeRegiao,Região&resultFields=nomeRegiao&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomPortador(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_portador&dataFields=codPortador,Código,nomeAbrev,Nome abreviado,descricaoMod,Modalidade&resultFields=codPortador,nomeAbrev,modalidade&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomInstrucao(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_instrucao&dataFields=codInstr,Código,descricao,Descrição&resultFields=codInstr,descricao&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomDespesa(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_despesa_padrao&dataFields=tpCodigo,Código,descricao,Descrição&resultFields=tpCodigo,descricao&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomReceita(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_receita_padrao&dataFields=tpCodigo,Código,descricao,Descrição&resultFields=tpCodigo,descricao&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomCondicaoPagamento(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_condicao_pagamento&dataFields=codCondPag,Código,descricao,Descrição&resultFields=codCondPag,descricao&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomBanco(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_banco&dataFields=codBanco,Código,nomeBanco,Nome&resultFields=codBanco,nomeBanco&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}
function openZoomCidade(tipo) { 
	window.open("/webdesk/zoom.jsp?datasetId=ds_lista_cidade&dataFields=estado,Estado,cidade,Cidade&resultFields=estado,cidade&type=" + tipo, "zoomForn" , "status , scrollbars=no ,width=600, height=350 , top=0 , left=0");
}


function setSelectedZoomItem(selectedItem) {
	if (selectedItem.type == "cliente") {
		document.getElementById("cod_emitente").value = selectedItem.codEmitente;
		getEmitenteDetalhe(selectedItem.codEmitente);
	} else if (selectedItem.type == "grupoCliente") {
		document.getElementById("cod_grp").value = selectedItem.codGrCli;				
		document.getElementById("des_grp").value = selectedItem.descricao;
		document.getElementById("cod_receita_padrao").value = selectedItem.tpRecDesp;
		document.getElementById("des_receita_padrao").value = selectedItem.descricaoReceita;
		document.getElementById("cod_trans").value = selectedItem.codTransp;
		document.getElementById("des_trans").value = selectedItem.descricaoTransporte;
		document.getElementById("ramo_atividade").value = selectedItem.atividade;
		document.getElementById("categoria").value = selectedItem.categoria;
		document.getElementById("cod_representante").value = selectedItem.codRep;
		document.getElementById("des_representante").value = selectedItem.nomeRepresentante;
		document.getElementById("cod_portador_port").value = selectedItem.codPortador;
		document.getElementById("des_banco_port").value = selectedItem.nomeAbrevPortador;
		document.getElementById("portador_port").value = selectedItem.modalidadePortador;
		document.getElementById("cod_cond_pagamento").value = selectedItem.codCondPag;
		document.getElementById("des_cond_pagamento").value = selectedItem.descricaoCondPag;
	} else if (selectedItem.type == "grupoFornecedor") {
		document.getElementById("cod_grp_forn").value = selectedItem.codGrForn;				
		document.getElementById("des_grp_forn").value = selectedItem.descricao;
	} else if (selectedItem.type == "matriz") {
		document.getElementById("cod_matriz").value = selectedItem.nomeAbrev;				
	} else if (selectedItem.type == "representante") {
		document.getElementById("cod_representante").value = selectedItem.codRep;				
		document.getElementById("des_representante").value = selectedItem.nome;				
	} else if (selectedItem.type == "transporte") {
		document.getElementById("cod_trans").value = selectedItem.codTransp;				
		document.getElementById("des_trans").value = selectedItem.nome;				
	} else if (selectedItem.type == "microRegiao") {
		document.getElementById("micro_regiao").value = selectedItem.nomeRegiao;				
	} else if (selectedItem.type == "redespacho") {
//		document.getElementById("transp_redespacho").value = selectedItem.codTransp;				
		document.getElementById("transp_redespacho").value = selectedItem.nome;				
	} else if (selectedItem.type == "portador") {
		document.getElementById("cod_portador_port").value = selectedItem.codPortador;				
		document.getElementById("des_banco_port").value = selectedItem.nomeAbrev;
		document.getElementById("portador_port").value = selectedItem.modalidade;				
	} else if (selectedItem.type == "portadorPref") {
		document.getElementById("cod_portador_pref").value = selectedItem.codPortador;				
		document.getElementById("des_banco_pref").value = selectedItem.nomeAbrev;
		document.getElementById("portador_pref").value = selectedItem.modalidade;				
	} else if (selectedItem.type == "instrucao") {
		document.getElementById("cod_banco1").value = selectedItem.codInstr;				
		document.getElementById("des_banco1").value = selectedItem.descricao;
	} else if (selectedItem.type == "despesa") {
		document.getElementById("cod_desp_padrao").value = selectedItem.tpCodigo;				
		document.getElementById("des_desp_padrao").value = selectedItem.descricao;
	} else if (selectedItem.type == "receita") {
		document.getElementById("cod_receita_padrao").value = selectedItem.tpCodigo;				
		document.getElementById("des_receita_padrao").value = selectedItem.descricao;
	} else if (selectedItem.type == "condicaoPagamento") {
		document.getElementById("cod_cond_pagamento").value = selectedItem.codCondPag;				
		document.getElementById("des_cond_pagamento").value = selectedItem.descricao;
	} else if (selectedItem.type == "banco") {
		document.getElementById("cod_banco_default").value = selectedItem.codBanco;				
		document.getElementById("des_banco_default").value = selectedItem.nomeBanco;
	} else if (selectedItem.type == "cidade") {
		document.getElementById("cidade").value = selectedItem.cidade;				
		document.getElementById("uf").value = selectedItem.estado;
	} else if (selectedItem.type == "clienteCob") {
		document.getElementById("cod_cliente_cobranca").value = selectedItem.codEmitente;
		getEmitenteCobranca(selectedItem.codEmitente);
	} else if (selectedItem.type == "cidadeCob") {
		document.getElementById("cidade_cobranca").value = selectedItem.cidade;				
		document.getElementById("uf_cobranca").value = selectedItem.estado;
	}
}

function getEmitenteDetalhe(emitente) {
	var c1 = DatasetFactory.createConstraint("cliente", emitente, emitente, ConstraintType.MUST);
	var constraints = new Array(c1); 
	var dataset = DatasetFactory.getDataset("ds_detalhe_emitente", null, constraints, null);
	if(dataset.values.length != 0) {
		for(var i=0;i<dataset.values.length; i++) {
			var record = dataset.values[i];
			console.log(record)
			document.getElementById("nome_abrev").value = eval("record['nomeAbrev']");
			document.getElementById("cnpj").value = eval("record['cgc']");
			document.getElementById("cnpj_cobranca").value = eval("record['cgcCob']");
			document.getElementById("natureza").value = eval("record['natureza']");
			document.getElementById("nome").value = eval("record['nomeEmit']");
			document.getElementById("endereco").value = eval("record['endereco']");
			document.getElementById("bairro").value = eval("record['bairro']");
			document.getElementById("cidade").value = eval("record['cidade']");
			document.getElementById("uf").value = eval("record['estado']");
			document.getElementById("cep").value = eval("record['cep']");
			document.getElementById("cx_postal").value = eval("record['caixaPostal']");
			document.getElementById("cod_cond_pagamento").value = eval("record['codCondPag']");
			document.getElementById("cod_trans").value = eval("record['codTransp']");
			document.getElementById("ramo_atividade").value = eval("record['atividade']");
			document.getElementById("telefone1").value = eval("record['telefone']");
			document.getElementById("ramal1").value = eval("record['ramal']");
			document.getElementById("telefax").value = eval("record['telefax']");
			document.getElementById("telefax_ramal").value = eval("record['ramalFax']");
			document.getElementById("cod_cliente_cobranca").value = eval("record['endCobranca']");
			document.getElementById("pais").value = eval("record['pais']");
			document.getElementById("cod_representante").value = eval("record['codRep']");
			document.getElementById("categoria").value = eval("record['categoria']");
			document.getElementById("cod_portador_port").value = eval("record['portador']");
			document.getElementById("portador_port").value = eval("record['modalidade']");
			document.getElementById("livre").value = eval("record['observacoes']");
			document.getElementById("cod_matriz").value = eval("record['nomeMatriz']");
			document.getElementById("telefone_modem").value = eval("record['telefModem']");
			document.getElementById("ramal_modem").value = eval("record['ramalModem']");
			document.getElementById("telefax2").value = eval("record['telefFac']");
			document.getElementById("telefax_ramal2").value = eval("record['ramalFac']");
			document.getElementById("cod_portador_pref").value = eval("record['portPrefer']");
			document.getElementById("portador_pref").value = eval("record['modPrefer']");
			document.getElementById("pais_cobranca").value = eval("record['paisCob']");
			document.getElementById("cep_cobranca").value = eval("record['cepCob']");
			document.getElementById("uf_cobranca").value = eval("record['estadoCob']");
			document.getElementById("cidade_cobranca").value = eval("record['cidadeCob']");
			document.getElementById("bairro_cobranca").value = eval("record['bairroCob']");
			document.getElementById("endereco_cobranca").value = eval("record['enderecoCob']");
			document.getElementById("cx_postal_cobranca").value = eval("record['cxPostCob']");
			document.getElementById("micro_regiao").value = eval("record['nomeMicReg']");
			document.getElementById("transp_redespacho").value = eval("record['nomeTrRed']");
			document.getElementById("cod_banco_default").value = eval("record['codBanco']");
			document.getElementById("cod_desp_padrao").value = eval("record['tpRecPadrao']");
			document.getElementById("des_receita_padrao").value = eval("record['descricaoReceita']");
			document.getElementById("email").value = eval("record['eMail']");
			document.getElementById("home_page").value = eval("record['homePage']");
			document.getElementById("dias_atraso").value = eval("record['nrDiasAtraso']");
			document.getElementById("dias_taxa").value = eval("record['nrDiasTaxa']");
			document.getElementById("valor_minimo").value = eval("record['valorMinimo']");
			document.getElementById("parceiro_edi").value = eval("record['codParceiroEdi']");
			document.getElementById("des_representante").value = eval("record['nomeRepresentante']");
			document.getElementById("des_trans").value = eval("record['descricaoTransporte']");
			document.getElementById("des_banco_port").value = eval("record['nomeAbrevPortador']");
			document.getElementById("portador_port").value = eval("record['modalidadePortador']");
			document.getElementById("des_banco_pref").value = eval("record['nomeAbrevPortadorPref']");
			document.getElementById("portador_pref").value = eval("record['modalidadePortadorPref']");
			document.getElementById("des_banco_default").value = eval("record['nomeBanco']");
			document.getElementById("des_desp_padrao").value = eval("record['descricaoDespesa']");
			document.getElementById("des_cond_pagamento").value = eval("record['descricaoCondPag']");
			
			document.getElementById("complenderecoentrega").value = eval("record['enderecotext']");
			document.getElementById("complenderecocobranca").value = eval("record['enderecocobtext']");
			
			var agencia = eval("record['agencia']");
			document.getElementById("agencia").value = agencia.substring(0, agencia.length - 1);
			document.getElementById("digitoagencia").value = agencia.substring(agencia.length - 1);

			var conta = eval("record['conta']");
			document.getElementById("conta_corrente").value = conta.substring(0, conta.length - 1);
			document.getElementById("digitoconta").value = conta.substring(conta.length - 1);
						
			
			document.getElementById("numero_1").value = eval("record['numero']");
			document.getElementById("numero_2").value = eval("record['numero2']");
			
			document.getElementById("cod_grp").value = eval("record['codGrCli']");				
			document.getElementById("des_grp").value = eval("record['descricaoGrupo']");
			document.getElementById("cod_grp_forn").value = eval("record['codGrForn']");
			document.getElementById("des_grp_forn").value = eval("record['descricaoGrupoForn']");
			
			document.getElementById("emite_bloqueto").checked = eval("record['emiteBloq']") == true;				
			document.getElementById("gera_aviso_debito").checked = eval("record['geraAd']") == true;				
			document.getElementById("agente_retencao").checked = eval("record['agenteRetencao']") == true;				
			document.getElementById("recebe_info_sci").checked = eval("record['recebeInfSci']") == true;				
			document.getElementById("calcula_multa").checked = eval("record['calculaMulta']") == true;
			document.getElementById("emite_nfe").checked = eval("record['emiteNfe']") == true;				
			document.getElementById("controla_vl_max").checked = eval("record['controlaValor']") == true;				
			document.getElementById("opt_cred_pre").checked = eval("record['optanteCredito']") == true;				
			document.getElementById("contribuinte_icms").value = eval("record['contribIcms']") == true;
			
			if (eval("record['flagPag']") == 1) {
				document.getElementById("fiscal_situacao_ok").checked = true;
			} else if (eval("record['flagPag']") == 2) {
				document.getElementById("fiscal_situacao_suspenso").checked = true;
			} else {
				document.getElementById("fiscal_situacao_ok").checked = false;
				document.getElementById("fiscal_situacao_suspenso").checked = false;
			}
			
			if (eval("record['tributoPis']") == 1) {
				document.getElementById("trib_pis_trib").checked = true;
			} else if (eval("record['tributoPis']") == 2) {
				document.getElementById("trib_pis_isento").checked = true;
			} else {
				document.getElementById("trib_pis_trib").checked = false;
				document.getElementById("trib_pis_isento").checked = false;
			}
			
			if (eval("record['tributoCofins']") == 1) {
				document.getElementById("trib_cofins_trib").checked = true;
			} else if (eval("record['tributoCofins']") == 2) {
				document.getElementById("trib_cofins_isento").checked = true;
			} else {
				document.getElementById("trib_cofins_trib").checked = false;
				document.getElementById("trib_cofins_isento").checked = false;
			}

			if (eval("record['insEstadual']").toUpperCase() == "ISENTO") {
				document.getElementById("insc_est_isento").checked = true;				
			} else {
				document.getElementById("insc_est").value = eval("record['insEstadual']");
			}
			if (eval("record['insEstCob']").toUpperCase() == "ISENTO") {
				document.getElementById("insc_est_cobranca_isento").checked = true;				
			} else {
				document.getElementById("insc_est_cobranca").value = eval("record['insEstCob']");
			}
			if (eval("record['insMunicipal']").toUpperCase() == "ISENTO") {
				document.getElementById("insc_est_cobranca_isento").checked = true;				
			} else {
				document.getElementById("insc_mun").value = eval("record['insMunicipal']");
			}
			setReadOnly("nome_abrev");

			if (eval("record['identific']") == "1") {
				document.getElementById("cliente").checked = true;
			} else if (eval("record['identific']") == "2") {
				document.getElementById("fornecedor").checked = true;
			} else {
				document.getElementById("ambos").checked = true;
			}
			
		}
	}
}

function getEmitenteCobranca(emitente) {
	var c1 = DatasetFactory.createConstraint("cliente", emitente, emitente, ConstraintType.MUST);
	var constraints = new Array(c1); 
	var dataset = DatasetFactory.getDataset("ds_detalhe_emitente", null, constraints, null);
	if(dataset.values.length != 0) {
		for(var i=0;i<dataset.values.length; i++) {
			var record = dataset.values[i];
			document.getElementById("des_cliente_cobranca").value = eval("record['nomeEmit']");
			document.getElementById("cnpj_cobranca").value = eval("record['cgc']");
			document.getElementById("pais_cobranca").value = eval("record['pais']");
			document.getElementById("cep_cobranca").value = eval("record['cep']");
			document.getElementById("uf_cobranca").value = eval("record['estado']");
			document.getElementById("cidade_cobranca").value = eval("record['cidade']");
			document.getElementById("bairro_cobranca").value = eval("record['bairro']");
			document.getElementById("endereco_cobranca").value = eval("record['endereco']");
			document.getElementById("cx_postal_cobranca").value = eval("record['caixaPostal']");
			if (eval("record['insEstadual']").toUpperCase() == "ISENTO") {
				document.getElementById("insc_est_cobranca_isento").checked = true;				
			} else {
				document.getElementById("insc_est_cobranca").value = eval("record['insEstadual']");
			}
		}
	}
}

function changeNatureza(value){
	if(value=="3"){
		document.getElementById("cidade").readOnly=false;
		document.getElementById("cidade").className="";
		document.getElementById("cidade_cobranca").readOnly=false;
		document.getElementById("cidade_cobranca").className="";
		document.getElementById("uf").value="EX";
		document.getElementById("uf").style.display="none";
		document.getElementById("agencia").value="000000";
		document.getElementById("agencia").style.display="none";
		document.getElementById("conta_corrente").value="0000000000";
		document.getElementById("conta_corrente").style.display="none";
		document.getElementById("cnpj").value="0000000000000000000";
		document.getElementById("cnpj").style.display="none";
	}else{
		setReadOnly("cidade");
		setReadOnly("cidade_cobranca");
		document.getElementById("cidade").value="";
		document.getElementById("uf").value="AC";
		document.getElementById("uf").style.display="inline";
		document.getElementById("agencia").style.display="inline";
		document.getElementById("conta_corrente").style.display="inline";
		document.getElementById("cnpj").style.display="inline";
	}

}

function FormataCEP(campo, teclapres){
	var tecla = teclapres.keyCode;
	var vr = new String(campo.value);
	vr = vr.replace(".", "");
	vr = vr.replace("/", "");
	vr = vr.replace("-", "");
	tam = vr.length + 1;
	if (tecla != 9) {
		if (tam == 6)
			campo.value = vr.substr(0, 5) + '-';
	}
}
function clearEmitente() {
    document.getElementById("cod_emitente").value = "0";
    document.getElementById("nome_abrev").value = "";
    document.getElementById("nome_abrev").readOnly  = false;
    document.getElementById("nome_abrev").setAttribute("class","");
}

function checkMail(mail){
	var er = new RegExp(/^[A-Za-z0-9_\-\.]+@[A-Za-z0-9_\-\.]{2,}\.[A-Za-z0-9]{2,}(\.[A-Za-z0-9])?/);        
	if(typeof(mail) == "string"){                
		if(er.test(mail)){ return true; }        
	}else if(typeof(mail) == "object"){                
		if(er.test(mail.value)){                                         
			return true;                                 
		}        
	}else{                
		return false;                
	}
}

function formatAgencia(v) {
	v=v.replace(/\D/g,"");
    v=v.replace(/(\d{6})(\d)/,"$1-$2");                        
	return v;
}

function formatConta(v) {
	v=v.replace(/\D/g,"");
    v=v.replace(/(\d{9})(\d)/,"$1-$2");                        
	return v;
}

function formatCpfCnpj(pCpfCnpj, pUseSepar, pIsCnpj)
{
	if (pIsCnpj==null) pIsCnpj = false;
	if (pUseSepar==null) pUseSepar = true;
	var maxDigitos = pIsCnpj? NUM_DIGITOS_CNPJ: NUM_DIGITOS_CPF;
	var numero = unformatNumber(pCpfCnpj);

	numero = numero.lpad(maxDigitos, '0');

	if (!pUseSepar) return numero;

	if (pIsCnpj)
	{
		reCnpj = /(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})$/;
		numero = numero.replace(reCnpj, "$1.$2.$3/$4-$5");
	}
	else
	{
		reCpf  = /(\d{3})(\d{3})(\d{3})(\d{2})$/;
		numero = numero.replace(reCpf, "$1.$2.$3-$4");
	}
	return numero;
} //formatCpfCnpj

function changeCpfCnpj(c) {
	var f = document.getElementById('natureza').value;  
	if (f == "1") {
		c.maxLength = 14;
		mascara(c,cpf);
	} else if (f == "2") {
		c.maxLength = 18;
		mascara(c,cnpj);
	} else {
		c.maxLength = 25;
	}
}

function validateEmail(campo) {
	var email = campo.value;
	if (!isEmail(email)) {
		alert("E-mail inválido");
		campo.focus();
	}
} 

function isEmail(email) { 
    var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);
} 

function setReadOnly(campo) {
	document.getElementById(campo).className = "readonly";
	document.getElementById(campo).readOnly = true;
}

function setMatriz(campo) {
	if (campo.checked) {
		document.getElementById("btnMatriz").style.display = "none";
		document.getElementById("cod_matriz").value = document.getElementById("nome_abrev").value;
		document.getElementById("cod_matriz").className = "";
		document.getElementById("cod_matriz").readOnly = false;
	} else {
		document.getElementById("btnMatriz").style.display = "inline";
		setReadOnly("cod_matriz");
	}	
}

function checkInscEstadual(theField) {
	
	var e = document.getElementById("uf");
	var estado = e.options[e.selectedIndex].value;
	
    var inscEst = theField.value;
    
    if (inscEst != "") {
        var dig8 = "/BA*/RJ*";
        var dig9 = "/AL*/AP*/AM*/CE*/ES*/GO*/MA*/MS*/PA*/PB*/PI*/RN*/RR*/SC*/SE*/TO*";
        var dig10 ="/PR*/RS*";
        var dig11 ="/MT*";
        var dig12 ="/SP*";
        var dig13 ="/AC*/MG*/DF*";
        var dig14 ="/PE*/RO*";
        
        if (dig8.indexOf("/"+estado+"*") != -1) {
            inscEst=inscEst.substr(0,8);
            tam=8;
        } else if (dig9.indexOf("/"+estado+"*") != -1) {
            inscEst=inscEst.substr(0,9);
            tam=9;
        } else if (dig10.indexOf("/"+estado+"*") != -1) {
            inscEst=inscEst.substr(0,10);
            tam=10;
        } else if (dig11.indexOf("/"+estado+"*") != -1) {
            inscEst=inscEst.substr(0,11);
            tam=11;
        } else if (dig12.indexOf("/"+estado+"*") != -1) {
            inscEst=inscEst.substr(0,12);
            tam=12;
        } else if (dig13.indexOf("/"+estado+"*") != -1) {
            inscEst=inscEst.substr(0,13);
            tam=13;
        } else if (dig14.indexOf("/"+estado+"*") != -1) {
            inscEst=inscEst.substr(0,14);
            tam=14;
        } else {
            inscEst="";
            inscEstadual.disabled = true;
            tam=0;
        }
    }
    if (inscEst!="") {
        if (estado=="AC") {
            inscEst=strzero(inscEst,13);
            primDigito=0;
            seguDigito=0;
            pesos="43298765432";
            soma=0;
            for(var i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            pesos="543298765432";
            soma=0;
            for(var i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            seguDigito=11-(soma%11);
            if (seguDigito>9)
                seguDigito=0;
                
            if ((parseInt(inscEst.substr(11,1))!=primDigito) || (parseInt(inscEst.substr(12,1))!=seguDigito)) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        } else if (estado=="AL") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            soma=soma*10;
            primDigito=soma%11;
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="AP") {
            inscEst=strzero(inscEst,9);
            if (inscEst.substr(0,2) != "03") {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else {
                if (parseFloat(inscEst.substr(0,8))<3017000) {
                    p=5;
                    d=0;
                }
                else if (parseFloat(inscEst.substr(0,8))<3019022) {
                    p=9;
                    d=1;
                }
                else {
                    p=0;
                    d=0;    
                }
                primDigito=0;
                pesos="98765432";
                soma=p;
                for(i=0;i<pesos.length;i++) {
                    soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
                }
                primDigito=11-(soma%11);
                if (primDigito==10)
                    primDigito=0;
                else if (primDigito==11)
                    primDigito=d;
                if (parseInt(inscEst.substr(8,1))!=primDigito) {
                    alert("Insc. Estadual inválida");
                    theField.select();
                    theField.focus();
                }
                else
                    theField.value=inscEst;
            }
        }
        else if (estado=="AM") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            if (soma<11)
                primDigito=11-soma;
            else {
                primDigito=soma%11;
                if (primDigito<2)
                    primDigito=0;
                else
                    primDigito=11-primDigito;
            }
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="BA") {
            inscEst=strzero(inscEst,8);
            primDigito=0;
            seguDigito=0;
            if ((parseInt(inscEst.substr(0,1))<6) || (parseInt(inscEst.substr(0,1))==8))
                modulo=10;
            else
                modulo=11;
            pesos="765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            seguDigito=modulo-(soma%modulo);
            if (seguDigito>9)
                seguDigito=0;
            var inscEstAux=inscEst;
            inscEst=inscEst.substr(0,6) + "" + inscEst.substr(7,1) + "" + inscEst.substr(6,1);
            pesos="8765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=modulo-(soma%modulo);
            if (primDigito>9)
                primDigito=0;
            inscEst=inscEst.substr(0,6) + "" + inscEst.substr(7,1) + "" + inscEst.substr(6,1);
            if ((parseInt(inscEst.substr(6,1))!=primDigito) || (parseInt(inscEst.substr(7,1))!=seguDigito)) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="CE") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="DF") {
            inscEst=strzero(inscEst,13);
            if (inscEst.substr(0,2) != "07") {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else {
                primDigito=0;
                seguDigito=0;
                pesos="43298765432";
                soma=0;
                for(i=0;i<pesos.length;i++) {
                    soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
                }
                primDigito=11-(soma%11);
                if (primDigito>9)
                    primDigito=0;
                pesos="543298765432";
                soma=0;
                for(i=0;i<pesos.length;i++) {
                    soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
                }
                seguDigito=11-(soma%11);
                if (seguDigito>9)
                    seguDigito=0;
                    
                if ((parseInt(inscEst.substr(11,1))!=primDigito) || (parseInt(inscEst.substr(12,1))!=seguDigito)) {
                    alert("Insc. Estadual inválida");
                    theField.select();
                    theField.focus();
                }
                else
                    theField.value=inscEst;
            }
        }
        else if (estado=="ES") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="GO") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (inscEst.substr(0,8)=="11094402") {
                if ((parseInt(inscEst.substr(8,1))!="0") && (parseInt(inscEst.substr(8,1))!="1")) {
                    alert("Insc. Estadual inválida");
                    theField.select();
                    theField.focus();
                }
            }
            else {
                if (primDigito==11)
                    primDigito=0;
                else if (primDigito==10) {
                    if ((parseFloat(inscEst.substr(0,8))>=10103105) && (parseFloat(inscEst.substr(0,8))<=10119997))
                        primDigito=1;
                    else
                        primDigito=0;
                }
                if (parseInt(inscEst.substr(8,1))!=primDigito) {
                    alert("Insc. Estadual inválida");
                    theField.select();
                    theField.focus();
                }
                else
                    theField.value=inscEst;
            }
        }
        else if (estado=="MA") {
            inscEst=strzero(inscEst,9);
            if (inscEst.substr(0,2) != "12") {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else {
                primDigito=0;
                pesos="98765432";
                soma=0;
                for(i=0;i<pesos.length;i++) {
                    soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
                }
                primDigito=11-(soma%11);
                if (primDigito>9)
                    primDigito=0;
                if (parseInt(inscEst.substr(8,1))!=primDigito) {
                    alert("Insc. Estadual inválida");
                    theField.select();
                    theField.focus();
                }
                else
                    theField.value=inscEst;
            }
        }
        else if (estado=="MT") {
            inscEst=strzero(inscEst,11);
            primDigito=0;
            pesos="3298765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(10,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="MS") {
            inscEst=strzero(inscEst,9);
            if (inscEst.substr(0,2) != "28") {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else {
                primDigito=0;
                pesos="98765432";
                soma=0;
                for(i=0;i<pesos.length;i++) {
                    soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
                }
                primDigito=11-(soma%11);
                if (primDigito>9)
                    primDigito=0;
                if (parseInt(inscEst.substr(8,1))!=primDigito) {
                    alert("Insc. Estadual inválida");
                    theField.select();
                    theField.focus();
                }
                else
                    theField.value=inscEst;
            }
        }
        else if (estado=="MG") {
            inscEst=strzero(inscEst,13);
            inscEst=inscEst.substr(0,3)+"0"+inscEst.substr(3);
            primDigito=0;
            seguDigito=0;
            pesos="121212121212";
            soma=0;
            resultado=0;
            for(i=0;i<pesos.length;i++) {
                resultado=parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1));
                resultado=resultado+"";
                for(j=0;j<resultado.length;j++) {
                    soma=soma+(parseInt(resultado.substr(j,1)));
                }
            }
            somaAux=soma+"";
            primDigito=parseInt((parseInt(somaAux.substr(0,1))+1)+"0")-soma;
            if (primDigito>9)
                primDigito=0;
            inscEst=inscEst.substr(0,3)+inscEst.substr(4);
            pesos="321098765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                mult=parseInt(pesos.substr(i,1));
                if ((i>1) && (i<4))
                    mult=parseInt(pesos.substr(i,1))+10;
                soma=soma+(parseInt(inscEst.substr(i,1))*mult);
            }
            seguDigito=11-(soma%11);
            if (seguDigito>9)
                seguDigito=0;
                
            if ((parseInt(inscEst.substr(11,1))!=primDigito) || (parseInt(inscEst.substr(12,1))!=seguDigito)) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        
        

        else if (estado=="PA") {
            inscEst=strzero(inscEst,9);
            if (inscEst.substr(0,2) != "15") {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else {
                primDigito=0;
                pesos="98765432";
                soma=0;
                for(i=0;i<pesos.length;i++) {
                    soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
                }
                primDigito=11-(soma%11);
                if (primDigito>9)
                    primDigito=0;
                if (parseInt(inscEst.substr(8,1))!=primDigito) {
                    alert("Insc. Estadual inválida");
                    theField.select();
                    theField.focus();
                }
                else
                    theField.value=inscEst;
            }
        }
        else if (estado=="PB") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="PR") {
            inscEst=strzero(inscEst,10);
            primDigito=0;
            seguDigito=0;
            pesos="32765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            pesos="432765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            seguDigito=11-(soma%11);
            if (seguDigito>9)
                seguDigito=0;
                
            if ((parseInt(inscEst.substr(8,1))!=primDigito) || (parseInt(inscEst.substr(9,1))!=seguDigito)) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="PE") {
            inscEst=strzero(inscEst,14);
            primDigito=0;
            pesos="5432198765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=primDigito-10;
            if (parseInt(inscEst.substr(13,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="PI") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="RJ") {
            inscEst=strzero(inscEst,8);
            primDigito=0;
            pesos="2765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(7,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="RN") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            soma=soma*10;
            primDigito=soma%11;
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="RS") {
            inscEst=strzero(inscEst,10);
            primDigito=0;
            pesos="298765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(9,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="RO") {
            inscEst=strzero(inscEst,14);
            primDigito=0;
            pesos="6543298765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito-=10;
            if (parseInt(inscEst.substr(13,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="RR") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="12345678";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            soma=soma*10;
            primDigito=soma%9;
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="SC") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            soma=soma*10;
            primDigito=soma%11;
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="SP") {
            inscEst=strzero(inscEst,12);
            primDigito=0;
            seguDigito=0;
            pesos="13456780";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                mult=parseInt(pesos.substr(i,1));
                if (i==7)
                    mult=10;
                soma=soma+(parseInt(inscEst.substr(i,1))*mult);
            }
            primDigito=soma%11;
            if (primDigito>9)
                primDigito=0;
            pesos="32098765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                mult=parseInt(pesos.substr(i,1));
                if (i==2)
                    mult=10;
                soma=soma+(parseInt(inscEst.substr(i,1))*mult);
            }
            seguDigito=soma%11;
            if (seguDigito>9)
                seguDigito=0;
                
            if ((parseInt(inscEst.substr(8,1))!=primDigito) || (parseInt(inscEst.substr(11,1))!=seguDigito)) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="SE") {
            inscEst=strzero(inscEst,9);
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            soma=soma*10;
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
        else if (estado=="TO") {
            inscEst=strzero(inscEst,9); // 11 Se tiver 2 algarismos
            primDigito=0;
            pesos="98765432";
            soma=0;
            for(i=0;i<pesos.length;i++) {
                soma=soma+(parseInt(inscEst.substr(i,1))*parseInt(pesos.substr(i,1)));
            }
            primDigito=11-(soma%11);
            if (primDigito>9)
                primDigito=0;
            if (parseInt(inscEst.substr(8,1))!=primDigito) {
                alert("Insc. Estadual inválida");
                theField.select();
                theField.focus();
            }
            else
                theField.value=inscEst;
        }
    }
}

function strzero(valor, tamanho) {
	if (valor.length < tamanho) {
		for (var i=valor.length;i<tamanho;i++) {
			valor += "0";
		}
	}
	return valor;
}

var completezero = function(campo) {
	
	var size = +($(campo).data("size"));
	var value = $(campo).val();
	
	for (var i=value.length;i<size;i++) {
		value = "0" + value;
	}
	
	$(campo).val(value);
	
	console.log(campo)
	
};