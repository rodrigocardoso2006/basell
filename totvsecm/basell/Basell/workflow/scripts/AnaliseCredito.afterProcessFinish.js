function afterProcessFinish(processId){

	

	var service = ServiceManager.getService("ems206");

	var serviceHelper = service.getBean();

log.info("VALOR:" + hAPI.getCardValue("limite_concedido"));	

log.info("NOME:" + hAPI.getCardValue("nomeAbreviado"));
log.info("DATA:" + hAPI.getCardValue("dt_analise"));

log.info("SERV:" + serviceHelper);

log.info("SERV:" + serviceHelper.getProxy());

	try{ 
	serviceHelper.getProxy().limiteCreditoCliente(hAPI.getCardValue("nomeAbreviado"), hAPI.getCardValue("dt_analise"), hAPI.getCardValue("limite_concedido"));

	log.info("OK");

		var parametros = new java.util.HashMap(); 

		parametros.put("CODIGO_EMITENTE", hAPI.getCardValue("codigoCliente")); 

		parametros.put("NOME_EMITENTE", hAPI.getCardValue("nomeEmitente"));

		parametros.put("LIMITE_SOLICITADO", "R$ " + hAPI.getCardValue("limite_solicitado"));

		parametros.put("LIMITE_CONCEDIDO", "R$ " + hAPI.getCardValue("limite_concedido"));

		

		parametros.put("subject", "Analise de Credito finalizada para " + hAPI.getCardValue("nomeAbreviado"));

		

		var c1 = DatasetFactory.createConstraint("processTaskPK.processInstanceId", getValue("WKNumProces"), getValue("WKNumProces"), ConstraintType.MUST); 

		var task = DatasetFactory.getDataset("processTask", null, new Array(c1), null); 

		var destinatarios = new java.util.ArrayList();

		

		if (task != null && task.rowsCount > 0) {

			for (var i=0;i<task.rowsCount;i++) {

				if (task.getValue(i, "processTaskPK.colleagueId") != "System:Auto" && task.getValue(i, "processTaskPK.colleagueId") != "") {

					log.info("EMAIL:" + task.getValue(i, "processTaskPK.colleagueId"));

					destinatarios.add(task.getValue(i, "processTaskPK.colleagueId")); 

				}  

			}

		}

		

		var c2 = DatasetFactory.createConstraint("colleagueGroupPK.groupId", "EAC", "EAC", ConstraintType.MUST); 

		var group = DatasetFactory.getDataset("colleagueGroup", null, new Array(c2), null); 

		if (group != null && group.rowsCount > 0) {

			for (var i=0;i<group.rowsCount;i++) {

				destinatarios.add(group.getValue(i, "colleagueGroupPK.colleagueId")); 

			}

		}

		var c3 = DatasetFactory.createConstraint("cliente", hAPI.getCardValue("codigoCliente"), hAPI.getCardValue("codigoCliente"), ConstraintType.MUST); 

		var cliente = DatasetFactory.getDataset("ds_detalhe_cliente", null, new Array(c3), null); 

		if (cliente != null && cliente.rowsCount > 0) {

			var repres = cliente.getValue(0, "codRep");



			var c4 = DatasetFactory.createConstraint("colleaguePK.colleagueId", repres, repres, ConstraintType.MUST); 

			var colleague = DatasetFactory.getDataset("colleague", null, new Array(c4), null); 

			if (colleague != null && colleague.rowsCount > 0) {

				destinatarios.add(colleague.getValue(0, "colleaguePK.colleagueId")); 

			}

		}

		notifier.notify("adm", "terminoAnaliseCredito", parametros, destinatarios, "text/html"); 

		

	} catch(e) { 
        log.info("ERROR");
		log.info(e); 
	}	
}