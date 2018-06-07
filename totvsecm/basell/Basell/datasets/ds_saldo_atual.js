function createDataset(fields, constraints, sortFields) {

	var newDataset = DatasetBuilder.newDataset(); 
	newDataset.addColumn("matricula");
	newDataset.addColumn("mes");
	newDataset.addColumn("saldo");
	
	var matricula = "adm";
	var evento = "Farmacia";
	var mes = "Farmacia";
	
    if (constraints != null && constraints.length > 0){
    	matricula = constraints[0].initialValue; 
    	evento = constraints[1].initialValue; 
    	mes = constraints[2].initialValue; 
    }
    
	var service = ServiceManager.getServiceInstance("Basell");
	var locator = service.instantiate("br.com.basell.BasellServiceServiceLocator");
	var soap = locator.getBasellServicePort();

	log.info("SOAP:" + soap + ":" + matricula + ":" + evento + ":" + mes);
	
    var saldo = soap.getSaldoDisponivel(matricula, evento, mes);
	
	newDataset.addRow(new Array(matricula, mes, saldo));
	
	return newDataset;
	
}