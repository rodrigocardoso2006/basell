function beforeStateEntry(sequenceId){
	
	var atividade = parseInt(getValue('WKNumState'));
	if (sequenceId != 1) {
		hAPI.setCardValue("numero", getValue('WKNumProces'));
	}
	if (sequenceId == 3 && atividade == 2 && hAPI.getCardValue("reclassificacao") == "nm" ) {
		
		try{ 
			var parametros = new java.util.HashMap(); 
			parametros.put("NUMERO_PROCESSO", getValue("WKNumProces")); 
			parametros.put("RECLASSIFICACAO", "NM - Near Miss");
			parametros.put("ATOS", hAPI,getCardValue("atos"));
			parametros.put("PROVIDENCIAS", hAPI,getCardValue("providencias"));
			parametros.put("OBSERVACAO", hAPI,getCardValue("observacoes_ssca"));
			
			parametros.put("subject", "Reclassificacao do processo de AAI");
			
			var destinatarios = new java.util.ArrayList();
			destinatarios.add(hAPI,getCardValue("cod_func")); 
			notifier.notify("adm", "fluxoAai", parametros, destinatarios, "text/html"); 
		} catch(e) { 
			log.info(e); 
		}	
	}

}