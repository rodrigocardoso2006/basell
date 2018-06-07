function enableFields(form){
	
	var atividade = parseInt(getValue("WKNumState"));
	if (atividade != 0 && atividade != 1 && atividade != 3 && form.getFormMode() != "ADD") {
		form.setEnabled("tipoPagamento",false);
	}

}