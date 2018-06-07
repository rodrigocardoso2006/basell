function displayFields(form,customHTML){

	var atividade = parseInt(getValue("WKNumState"));
	var mode      = form.getFormMode();
	
	customHTML.append("<script>");
	customHTML.append("    var atividade = " + atividade + ";");
	customHTML.append("    var mode = '" + mode + "';");
	customHTML.append("    var usuario = '" + getValue("WKUser") + "';");
	customHTML.append("    var ismobile = " + form.getMobile() + ";");
	customHTML.append("</script>");
	
}
