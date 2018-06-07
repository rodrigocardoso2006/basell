function afterProcessFinish(processId){
	
	var parametros = new java.util.HashMap(); 
	parametros.put("CODIGO_EMITENTE", hAPI.getCardValue("cod_emitente")); 
	parametros.put("NOME_ABREV", hAPI.getCardValue("nome_abrev"));
	
	var d = new Date();
	parametros.put("DATA_CLIENTE", d.getDate() + "/" + (d.getMonth()+1) + "/" + d.getFullYear());
	
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

  var c2 = DatasetFactory.createConstraint("colleagueGroupPK.groupId", "NEC", "NEC", ConstraintType.MUST); 
	var group = DatasetFactory.getDataset("colleagueGroup", null, new Array(c2), null); 

	if (group != null && group.rowsCount > 0) {
		for (var i=0;i<group.rowsCount;i++) {
			destinatarios.add(group.getValue(i, "colleagueGroupPK.colleagueId")); 
		}
	}
	
	parametros.put("subject", "Novo cliente " + hAPI.getCardValue("nome_abrev") + " processo " + getValue("WKNumProces"));
	

	notifier.notify("adm", "terminoCliente", parametros, destinatarios, "text/html"); 

}