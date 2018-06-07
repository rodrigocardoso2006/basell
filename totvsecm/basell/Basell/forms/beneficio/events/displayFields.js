function displayFields(form,customHTML){
	var atividade = parseInt(getValue("WKNumState"));
	
	customHTML.append('<script>');
	customHTML.append('    var atividade = ' + atividade + ';');
	customHTML.append('    var usuario = "' + getValue("WKUser") + '";');
	customHTML.append('</script>');	
	
	if (atividade == 0 || atividade == 1) {
		var dataAbertura = new Date();
		form.setValue('mes', (dataAbertura.getMonth()+1));
		form.setValue('ano', dataAbertura.getFullYear());
		
		var c1 = DatasetFactory.createConstraint("matricula", getValue("WKUser"), getValue("WKUser"), ConstraintType.MUST);
		var c2 = DatasetFactory.createConstraint("metadata#active", "true", "true", ConstraintType.MUST);
		var constraints = new Array(c1, c2);
		var colaborador = DatasetFactory.getDataset("ds_funcionario", null, constraints, null);
		log.info("teste:" + colaborador);
		log.info("teste:" + colaborador.rowsCount);
		form.setValue('matricula', getValue("WKUser"));
		if (colaborador != null && colaborador.rowsCount > 0) {
			form.setValue('nome', colaborador.getValue(0,"nome"));
			form.setValue('matriculaRh', colaborador.getValue(0,"matriculaRh"));	
			form.setValue('centroCusto', colaborador.getValue(0,"centroCusto"));
		}
		
	}
		
}