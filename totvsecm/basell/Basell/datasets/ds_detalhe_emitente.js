function createDataset(fields, constraints, sortFields) {

	var newDataset = DatasetBuilder.newDataset(); 
	newDataset.addColumn("codEmitente"); 
	newDataset.addColumn("nomeAbrev"); 
	newDataset.addColumn("cgc"); 
	newDataset.addColumn("cgcCob");
	newDataset.addColumn("natureza");
	newDataset.addColumn("nomeEmit");
	newDataset.addColumn("endereco");
	newDataset.addColumn("bairro");
	newDataset.addColumn("cidade");
	newDataset.addColumn("estado");
	newDataset.addColumn("cep");
	newDataset.addColumn("caixaPostal");
	newDataset.addColumn("codCondPag");
	newDataset.addColumn("codTransp");
	newDataset.addColumn("atividade");
	newDataset.addColumn("telefone");
	newDataset.addColumn("ramal");
	newDataset.addColumn("telefax");
	newDataset.addColumn("ramalFax");
	newDataset.addColumn("endCobranca");
	newDataset.addColumn("pais");
	newDataset.addColumn("insEstadual");
	newDataset.addColumn("descricaoGrupo");
	newDataset.addColumn("descricaoGrupoForn");
	newDataset.addColumn("nomeRepresentante");
	newDataset.addColumn("descricaoTransporte");
	newDataset.addColumn("nomeAbrevPortador");
	newDataset.addColumn("modalidadePortador");
	newDataset.addColumn("nomeAbrevPortadorPref");
	newDataset.addColumn("modalidadePortadorPref");
	newDataset.addColumn("nomeBanco");
	newDataset.addColumn("descricaoReceita");
	newDataset.addColumn("descricaoDespesa");
	newDataset.addColumn("descricaoCondPag");
	newDataset.addColumn("codRep");
	newDataset.addColumn("categoria");
	newDataset.addColumn("codGrCli");
	newDataset.addColumn("portador");
	newDataset.addColumn("modalidade");
	newDataset.addColumn("observacoes");
	newDataset.addColumn("nomeMatriz");
	newDataset.addColumn("telefModem");
	newDataset.addColumn("ramalModem");
	newDataset.addColumn("telefFac");
	newDataset.addColumn("ramalFac");
	newDataset.addColumn("emiteBloq");
	newDataset.addColumn("geraAd");
	newDataset.addColumn("portPrefer");
	newDataset.addColumn("modPrefer");
	newDataset.addColumn("paisCob");
	newDataset.addColumn("cepCob");
	newDataset.addColumn("estadoCob");
	newDataset.addColumn("cidadeCob");
	newDataset.addColumn("bairroCob");
	newDataset.addColumn("enderecoCob");
	newDataset.addColumn("cxPostCob");
	newDataset.addColumn("nomeMicReg");
	newDataset.addColumn("nomeTrRed");
	newDataset.addColumn("codBanco");
	newDataset.addColumn("insEstCob");
	newDataset.addColumn("insMunicipal");
	newDataset.addColumn("tpRecPadrao");
	newDataset.addColumn("contribIcms");
	newDataset.addColumn("eMail");
	newDataset.addColumn("homePage");
	newDataset.addColumn("nrDiasAtraso");
	newDataset.addColumn("valorMinimo");
	newDataset.addColumn("codParceiroEdi");
	newDataset.addColumn("agenteRetencao");
	newDataset.addColumn("recebeInfSci");
	newDataset.addColumn("calculaMulta");
	newDataset.addColumn("taxaFinanc");
	newDataset.addColumn("codGrForn");
	newDataset.addColumn("linhaProduto");
	newDataset.addColumn("portadorAp");
	newDataset.addColumn("emissaoPed");
	newDataset.addColumn("emiteEtiq");
	newDataset.addColumn("venFeriado");
	newDataset.addColumn("venDomingo");
	newDataset.addColumn("venSabado");
	newDataset.addColumn("nrDiasTaxa");
	newDataset.addColumn("indRendiment");
	newDataset.addColumn("tpPagto");
	newDataset.addColumn("endereco2");
	newDataset.addColumn("diasComp");
	newDataset.addColumn("flagPag");
	newDataset.addColumn("rendTribut");
	newDataset.addColumn("venctoDiaNaoUtil");
	newDataset.addColumn("identific");
	newDataset.addColumn("numero");
	newDataset.addColumn("numero2");
	newDataset.addColumn("emiteNfe");
	newDataset.addColumn("tributoPis");
	newDataset.addColumn("tributoCofins");
	newDataset.addColumn("controlaValor");
	newDataset.addColumn("optanteCredito");
	newDataset.addColumn("enderecotext");
	newDataset.addColumn("enderecocobtext");
	newDataset.addColumn("agencia");
	newDataset.addColumn("conta");
	
	var service = ServiceManager.getService("ems206");
	var serviceHelper = service.getBean();
	var holder = serviceHelper.createProDataGraphHolder();
	
	var cliente = 1002109;
	if (constraints != null) {
		for (var i=0;i<constraints.length;i++) {
			var c = constraints[i];
			log.info("c:" + c.fieldName + ":" + c.initialValue);
			if (c.fieldName == "cliente") { cliente = parseInt(c.initialValue); }
		}
	}
	
	serviceHelper.getProxy().detalheEmitente(cliente, holder);
	var results = holder.getProDataGraphValue().getProDataObjects("ttEmitente"); 
	var row = results.get(0);
	var newRow = new Array( row.get("cod-emitente"), 
							row.get("nome-abrev"), 
							row.get("cgc"), 
							row.get("cgc-cob"),
							row.get("natureza"),
							row.get("nome-emit"),
							row.get("endereco"),
							row.get("bairro"),
							row.get("cidade"),
							row.get("estado"),
							row.get("cep"),
							row.get("caixa-postal"),
							row.get("cod-cond-pag"),
							row.get("cod-transp"),
							row.get("atividade"),
							row.get("telefone"),
							row.get("ramal"),
							row.get("telefax"),
							row.get("ramal-fax"),
							row.get("end-cobranca"),
							row.get("pais"),
							row.get("ins-estadual"),
							row.get("descricaoGrupo"),
							row.get("descricaoGrupoFo"),
							row.get("nomeRepres"),
							row.get("descricaoTransp"),
							row.get("nomeAbrevPort"),
							row.get("modalidadePort"),
							row.get("nomeAbrevPortPr"),
							row.get("modalidadePortPr"),
							row.get("nomeBanco"),
							row.get("descricaoRec"),
							row.get("descricaoDesp"),
							row.get("descricaoCondPag"),
							row.get("cod-rep"),
							row.get("categoria"),
							row.get("cod-gr-cli"),
							row.get("portador"),
							row.get("modalidade"),
							row.get("observacoes"),
							row.get("nome-matriz"),
							row.get("telef-modem"),
							row.get("ramal-modem"),
							row.get("telef-fac"),
							row.get("ramal-fac"),
							row.get("emite-bloq"),
							row.get("gera-ad"),
							row.get("port-prefer"),
							row.get("mod-prefer"),
							row.get("pais-cob"),
							row.get("cep-cob"),
							row.get("estado-cob"),
							row.get("cidade-cob"),
							row.get("bairro-cob"),
							row.get("endereco-cob"),
							row.get("cx-post-cob"),
							row.get("nome-mic-reg"),
							row.get("nome-tr-red"),
							row.get("cod-banco"),
							row.get("ins-est-cob"),
							row.get("ins-municipal"),
							row.get("tp-rec-padrao"),
							row.get("contrib-icms"),
							row.get("e-mail"),
							row.get("home-page"),
							row.get("nr-dias-atraso"),
							row.get("valor-minimo"),
							row.get("cod-parceiro-edi"),
							row.get("agente-retencao"),
							row.get("recebe-inf-sci"),
							row.get("calcula-multa"),
							row.get("taxa-financ"),
							row.get("cod-gr-forn"),
							row.get("linha-produt"),
							row.get("portador-ap"),
							row.get("emissao-ped"),
							row.get("emite-etiq"),
							row.get("ven-feriado"),
							row.get("ven-domingo"),
							row.get("ven-sabado"),
							row.get("nr-dias-taxa"),
							row.get("ind-rendiment"),
							row.get("tp-pagto"),
							row.get("endereco2"),
							row.get("dias-comp"),
							row.get("flag-pag"),
							row.get("rend-tribut"),
							row.get("vencto-dia-nao-util"),
							row.get("identific"),
							row.get("numeroEndereco"),
							row.get("numeroEndereco2"),
							row.get("emiteNfe"),
							row.get("tributoPis"),
							row.get("tributoCofins"),
							row.get("controlaValor"),
							row.get("optanteCredito"),
							row.get("endereco_text"),
							row.get("endereco-cob-text"),
							row.get("agencia"),
							row.get("conta-corren"));
	
	newDataset.addRow(newRow);
	
	return newDataset;
	
}