function createDataset(fields, constraints, sortFields) {
	
	var service = ServiceManager.getService("ems206");
	var serviceHelper = service.getBean();
	var holder = serviceHelper.createProDataGraphHolder();
	
	var onlyMatriz = false;
	if (constraints != null) {
		for (var i=0;i<constraints.length;i++) {
			var c = constraints[i];
			log.info("c:" + c.fieldName + ":" + c.initialValue);
			if (c.fieldName == "matriz") { onlyMatriz = true; }
		}
	}
	
	
	serviceHelper.getProxy().cliente(onlyMatriz, holder);
	var results = holder.getProDataGraphValue().getProDataObjects("ttCliente"); 
	var newDataset = DatasetBuilder.newDataset();
	newDataset.addColumn("codEmitente");
	newDataset.addColumn("nomeEmit");
	newDataset.addColumn("nomeAbrev");
	newDataset.addColumn("limiteCredito");
	newDataset.addColumn("taxaFinanc");
	newDataset.addColumn("condicaoPagamento");
	newDataset.addColumn("descricaoPagamento");
	newDataset.addColumn("estado");
	newDataset.addColumn("icms");
	newDataset.addColumn("indice");
	newDataset.addColumn("dataLimite");
	newDataset.addColumn("dataUltimaVenda");

	for(var pos = 0; pos < results.size(); pos++) {
		var row = results.get(pos);
		var newRow = new Array(row.get("codEmitente"), 
				               row.get("nomeEmit"), 
				               row.get("nomeAbrev"), 
				               row.get("limiteCredito"), 
				               row.get("taxaFinanc"), 
				               row.get("condicaoPagamento"), 
				               row.get("descricaoPagamento"), 
				               row.get("estado"), 
				               row.get("icms"), 
				               row.get("indice"), 
				               row.get("dataLimite"), 
				               row.get("dataUltimaVenda"));
		newDataset.addRow(newRow);
	}
	
	return newDataset;	
}