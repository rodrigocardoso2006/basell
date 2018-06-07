function displayFields(form,customHTML){
	
	var atividade = parseInt(getValue("WKNumState"));
	
	customHTML.append('<script>');
	customHTML.append('    var atividade = ' + atividade + ';');
	customHTML.append('    var usuario = "' + getValue("WKUser") + '";');
	customHTML.append('    var mode = "' + form.getFormMode() + '";');
	customHTML.append('    var analistaCredito = ' + isAnalistaCredito(getValue("WKUser")) + ';');
	customHTML.append('</script>');	
	
	var c1 = DatasetFactory.createConstraint("colleaguePK.colleagueId", getValue("WKUser"), getValue("WKUser"), ConstraintType.MUST);
	var colaborador = DatasetFactory.getDataset("colleague", null, [c1], null);
	if (colaborador != null && colaborador.rowsCount > 0) {
		customHTML.append('<script>');
		customHTML.append('    var dialeto = "' + colaborador.getValue(0, "defaultLanguage" ) + '";');
		customHTML.append('</script>');	
	}
	
	if (atividade == 0 || atividade == 1) {
		var c1 = DatasetFactory.createConstraint("metadata#active", "true", "true", ConstraintType.MUST);
		var constraints = new Array(c1);
		var parametros = DatasetFactory.getDataset("ds_parametros_limite_credito", null, constraints, null);
		if (parametros != null && parametros.rowsCount > 0) {
			form.setValue('dataParametro', parametros.getValue(0, "data_padrao"));
			form.setValue('primeira_faixa', convertToFloat(parametros.getValue(0, "primeira_faixa")));	
			form.setValue('segunda_faixa', convertToFloat(parametros.getValue(0, "segunda_faixa")));
		}

		var dataAbertura = new Date();
		form.setValue('dataProcesso', dataAbertura.getDate() + '/' + (dataAbertura.getMonth()+1) + '/' + dataAbertura.getFullYear());
		
	    if (form.getValue('dt_analise') == "") {
		    var today = new Date();
		    today.setDate(today.getDate()+365);
			form.setValue('dt_analise', (today.getDate() < 10 ? "0" +  today.getDate() :  today.getDate()) + '/' + ((today.getMonth()+1) < 10 ? "0" + (today.getMonth()+1) : (today.getMonth()+1)) + '/' + today.getFullYear());
	    }
		
		
	}
	
	var titulo = new Date();
	form.setValue('fimTitulo', titulo.getDate() + '/' + (titulo.getMonth()+1) + '/' + titulo.getFullYear());
	titulo.setMonth(titulo.getMonth() - 6);
	form.setValue('inicioTitulo', titulo.getDate() + '/' + (titulo.getMonth()+1) + '/' + titulo.getFullYear());
	
	function convertToFloat(valor){
		var numero = 0;
		log.info("convertToFloat:" + valor);
		valor = valor.replace(".", "");
		if (valor != "") { numero = valor.substring(3,valor.length()-3)+"."+valor.substring(valor.length()-2); }
		log.info("convertToFloat:" + numero);
		return parseFloat(numero);
	}	
}