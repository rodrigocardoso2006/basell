function displayFields(form,customHTML) {
	var atividade = parseInt(getValue("WKNumState"));
	var usuario = getValue("WKUser");
	
	customHTML.append('<script>');
	customHTML.append('    var atividade = ' + atividade + ';');
	customHTML.append('    var usuario = "' + usuario + '";');
	customHTML.append('    var mode = "' + form.getFormMode() + '";');
	customHTML.append('</script>');
	
	if (isNaN(atividade)) { 
		atividade = parseInt(form.getValue("atividadeAtual")); 
		usuario = form.getValue("usuarioAtual"); 
	}
	
	log.info("display:" + atividade + ":" + usuario);
	
	if (atividade == 0 || atividade == 1 || atividade == 3) {
		customHTML.append('<script>');
		customHTML.append('    var holidays = [' + getHolidays() + '];');
		customHTML.append('    function isAprovador() {');
		if (getValue("WKUser") == null) {
			customHTML.append('        return false;');
		} else {
			customHTML.append('        return ' + isAprovador(usuario) + ';');
		}
		customHTML.append('    }');
		customHTML.append('</script>');
		
		var empresa = DatasetFactory.getDataset("ds_empresa", null, null, null);
		if (empresa != null && empresa.rowsCount > 0) {
			form.setValue("empresa_h", parseInt(empresa.getValue(0,"codigo")));
			form.setValue("empresa", empresa.getValue(0,"nome"));
		}
		var estab = DatasetFactory.getDataset("ds_estabelecimento", null, null, null);
		if (estab != null && estab.rowsCount > 0) {
			form.setValue("Estabelecimento_h", estab.getValue(0,"codigo"));
			form.setValue("estabelecimento", estab.getValue(0,"nome"));
		}
	}
  if (form.getValue("numSolicitacao") != null && form.getValue("numSolicitacao") != "") {
		log.info("SOLIC>" + form.getValue("numSolicitacao"));
		customHTML.append('<a href="print.htm?id=' + form.getValue("numSolicitacao") + '" target="_blank">Imprimir</a>');
	}
	
	form.setHidePrintLink(true);	
}

function getHolidays() {
	var holidays = DatasetFactory.getDataset("globalCalendar", null, null, null);
	var lista = "";
	if (holidays.rowsCount > 0) {
		for(var i=0;i<holidays.rowsCount; i++) { 
			var d = holidays.getValue(i, "holidayDay"); 
			var m = holidays.getValue(i, "holidayMonth"); 
			var y = holidays.getValue(i, "holidayYear");
			lista += "'" + m + "-" + d + "-" + y + "',";
		}		
	}
	return lista + "''";
}
