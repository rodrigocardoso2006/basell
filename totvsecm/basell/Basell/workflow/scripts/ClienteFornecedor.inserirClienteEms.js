function inserirClienteEms(){

	var service = ServiceManager.getService("ems206");
	var serviceHelper = service.getBean();

	var mapa = hAPI.getCardData(parseInt(getValue("WKNumProces")));

	var dataset = retornaCliente(mapa);
	var inputTT = serviceHelper.toProDataGraph(dataset);

	log.info("mapa:" + mapa);
	log.info("retorno:" + dataset);
	log.info("inputTT:" + inputTT);
	log.info("nome:" + dataset.getValue(0, "nome_abrev"));
	
	var retorno = serviceHelper.createBooleanHolder(); 

	var codigo = serviceHelper.createIntHolder(); 
	serviceHelper.getProxy().insereEmitente(inputTT, retorno, codigo);
	
	if (retorno.getBooleanValue()) {
		throw "Erro ao criar o cliente no EMS, verifique os logs do sistema";
	}
	
	hAPI.setCardValue("cod_emitente", codigo.getIntValue());



}