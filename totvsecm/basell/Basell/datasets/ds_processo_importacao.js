function createDataset(fields, constraints, sortFields) {
	
	var service = ServiceManager.getService("ems206");
	var serviceHelper = service.getBean();
	var holder = serviceHelper.createProDataGraphHolder();
	
	serviceHelper.getProxy().processoImportacao(holder);
	var results = holder.getProDataGraphValue().getProDataObjects("ttProcesso"); 
	var newDataset = DatasetBuilder.newDataset();
	newDataset.addColumn("nrprocimp");
	newDataset.addColumn("numpedido");
	newDataset.addColumn("narrativa");

	for(var pos = 0; pos < results.size(); pos++) {
		var row = results.get(pos);
		var newRow = new Array(row.get("nrprocimp"),
				               row.get("numpedido"),
				               row.get("narrativa"));
		newDataset.addRow(newRow);
	}
	
	return newDataset;	
}