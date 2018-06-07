function enableFields(form){
	
	var atividade = parseInt(getValue("WKNumState"));
	if (atividade != 2) {
		if (!isAnalistaCredito(getValue("WKUser"))) {
			form.setEnabled("livre_analise", false);
			form.setEnabled("classeRisco", false);
			form.setEnabled("radioClasseRisco", false);
		}
	}

}