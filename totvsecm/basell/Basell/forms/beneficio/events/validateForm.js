function validateForm(form){
	
	var atividade = parseInt(getValue("WKNumState"));
	if (atividade == 0 || atividade == 1) {
		if (isEmpty("listaBeneficio")) {
			throw "Informe ao menos um beneficio para aprovação";
		}
		
		var user = getValue("WKUser");
		var lista = form.getValue("listaBeneficio");
		var saldo = form.getValue("saldoBeneficio");
		
		lista = lista.split(",");
		saldo = saldo.split(",");
		
		var size = lista.length;
		var have = true;
		for (var x=1;x<=size;x++) {
			var v = form.getValue("valorReembolso___" + x);
			log.info("validateForm:" + v + ":" + i + ":" + size);
			if (v == null) {
				size++;
			} else {
				while (v.indexOf(".") != -1) {
					v = v.replace(".", "");
				}
				log.info("validateForm:" + v);
				v = v.replace(",", ".");
				v = parseFloat(v);
				log.info("validateForm:" + v);
				if (v > 0) {
					have = false;
					break;
				}
			}
			if (size > 100) { break; }
			log.info("FIM");
		}
		if (have) {
			throw "Não há saldo disponivel para essa solicitação";
		}
		log.info('service');
		var service = ServiceManager.getServiceInstance("Basell");
		log.info('servi loc');
		var locator = service.instantiate("br.com.basell.BasellServiceServiceLocator");
		log.info('service soap');
		var soap = locator.getBasellServicePort();
		log.info('service ok');

		for (var i=0;i<lista.length;i++) {
			log.info("lista[i]:" + lista[i]);
			var nome = new String(lista[i]);
			nome = nome.split("\|");
			log.info("nome[0]:" + nome[0] + ":" + nome[1]);
			var s = parseFloat(saldo[i]);
			log.info('gravar:' + user + ':' + s);
			soap.gravaSaldo(user, nome[0], nome[1], s);		
log.info('ok')
		}
	}
	
	function isEmpty(campo) {
		return form.getValue(campo) == "" || form.getValue(campo) == null; 
	}
}