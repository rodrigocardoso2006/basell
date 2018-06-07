function beforeStateEntry(sequenceId){

	log.info(" beforeStateEntry:" + sequenceId);
	
	if (sequenceId == 3) {
		var user = hAPI.getCardValue("matricula");
		var lista = hAPI.getCardValue("listaBeneficio");
		var saldo = hAPI.getCardValue("saldoBeneficio");
		
		lista = lista.split(",");
		saldo = saldo.split(",");
		
		var service = ServiceManager.getServiceInstance("Basell");
		var locator = service.instantiate("br.com.basell.BasellServiceServiceLocator");
		var soap = locator.getBasellServicePort();

		for (var i=0;i<lista.length;i++) {
			log.info("lista[i]:" + lista[i]);
			var nome = new String(lista[i]);
			nome = nome.split("\|");
			log.info("nome[0]:" + nome[0] + ":" + nome[1]);
			var s = parseFloat(saldo[i]);
			
			soap.adicionaSaldo(user, nome[0], nome[1], s);		
		}
	}
		
	log.info("AFTER:" + sequenceId);
	
	if (sequenceId == 4) {

		try{ 
			var parametros = new java.util.HashMap();
			
			var itens = retornoItens(getValue("WKNumProces"));

			log.info("AFTER:" + getValue("WKNumProces"));
			log.info("AFTER:" + itens);
			log.info("AFTER:" + itens.rowsCount);
			
			parametros.put("NUMERO_PROCESSO", getValue("WKNumProces"));
			
			var html = "";
			for (var i=0;i<itens.rowsCount;i++) {
				html += "Beneficio:<b>" + itens.getValue(i, "beneficio") + "</b><br>";
				html += "Valor:<b>" + itens.getValue(i, "valor") + "</b><br>";
				html += "Mes referencia:<b>" + itens.getValue(i, "mes") + "</b><br><br><br>";
			}
			parametros.put("HTML", html);

			parametros.put("subject", "Aprovacao reembolso de beneficios");
			
			var destinatarios = new java.util.ArrayList();
			destinatarios.add(hAPI.getCardValue("matricula")); 

			notifier.notify("adm", "rhBeneficio", parametros, destinatarios, "text/html"); 
		} catch(e) { 
			log.info("ERROR");
			log.info(e); 
		}	
	}

}