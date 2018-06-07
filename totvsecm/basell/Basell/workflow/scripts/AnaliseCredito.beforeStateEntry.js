function beforeStateEntry(sequenceId){

// wagner.silvestre@lyondellbasell.com	

	if (sequenceId != 1) {

		var processId = getValue("WKNumProces");

		hAPI.setCardValue("numProcesso", processId);

	}

	if (sequenceId == 2) {
		
		var parametros = new java.util.HashMap(); 
		parametros.put("CODIGO_EMITENTE", hAPI.getCardValue("codigoCliente")); 
		parametros.put("NOME_EMITENTE", hAPI.getCardValue("nomeEmitente"));
		parametros.put("SOLICITACAO", getValue("WKNumProces"));
		parametros.put("DATA_LIMITE",  hAPI.getCardValue("dt_analise"));
		parametros.put("CLASSE", hAPI.getCardValue("classeRisco"));
		
		var desc = "Baixo";
		if (hAPI.getCardValue("radioClasseRisco") == "B") {
			desc = "Médio/Baixo";
		} else if (hAPI.getCardValue("radioClasseRisco") == "C") {
			desc = "Médio/Alto";
		} else if (hAPI.getCardValue("radioClasseRisco") == "D") {
			desc = "Alto";
		} else if (hAPI.getCardValue("radioClasseRisco") == "E") {
			desc = "Extremo";
		}
		parametros.put("CLASSE_DESCRICAO", desc);

		parametros.put("subject", "Analise de Credito em aprovação para " + hAPI.getCardValue("nomeAbreviado"));

		var destinatarios = new java.util.ArrayList();
		var c2 = DatasetFactory.createConstraint("colleagueGroupPK.groupId", "CAC", "CAC", ConstraintType.MUST); 
		var group = DatasetFactory.getDataset("colleagueGroup", null, new Array(c2), null); 
		if (group != null && group.rowsCount > 0) {
			for (var i=0;i<group.rowsCount;i++) {
				destinatarios.add(group.getValue(i, "colleagueGroupPK.colleagueId")); 
			}
		}

		notifier.notify("adm", "aprovacaoAnaliseCredito", parametros, destinatarios, "text/html"); 
		
	}
	

}