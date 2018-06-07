function afterProcessFinish(processId){
	try{ 
		var parametros = new java.util.HashMap();
		
		parametros.put("NUMERO_PROCESSO", getValue("WKNumProces"));
		
		var texto = "";
		if (hAPI.getCardValue("classificacao") == hAPI.getCardValue("reclassificacao")) { texto = "ele foi classificado como " + getDescription(hAPI.getCardValue("classificacao")) + ", conforme destrito na abertura."; }
		else { texto = "ele foi reclassificado para " + getDescription(hAPI.getCardValue("reclassificacao")) + " na analise de segurança."; }
		
		parametros.put("TEXTO", texto);
		
		parametros.put("subject", "Conclusao do processo de AAI");
		
		var destinatarios = new java.util.ArrayList();
		destinatarios.add(hAPI.getCardValue("cod_func")); 
		notifier.notify("adm", "terminoFluxoAai", parametros, destinatarios, "text/html"); 
	} catch(e) { 
		log.info(e); 
	}
	
	function getDescription(codigo) {
		if (codigo == "ai") { return "AI - Ato inseguro"; }
		else if (codigo == "fp") { return "FP - Fator pessoal de insegurança"; }
		else if (codigo == "ci") { return "CI - Condição insegura"; }
		else if (codigo == "as") { return "AS - Ato seguro"; }
		else if (codigo == "sg") { return "SG - Sugestão"; }
		else if (codigo == "sw") { return "SW - Safety Walk"; }
		
		return "NM - Near Miss";
	}

}