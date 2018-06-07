function isAnalistaCredito(colaborador){
	
	var ROLE = 7;
	
	var c1 = DatasetFactory.createConstraint("workflowColleagueRolePK.colleagueId", colaborador, colaborador, ConstraintType.MUST);
	var c2 = DatasetFactory.createConstraint("workflowColleagueRolePK.roleId", ROLE, ROLE, ConstraintType.MUST);
	var constraints = new Array(c1,c2);
	log.info("isAnalistaCredito:" + colaborador);
	log.info("isAnalistaCredito:" + ROLE);
	var aprovador = DatasetFactory.getDataset("workflowColleagueRole", null, constraints, null);
	log.info("isAnalistaCredito:" + aprovador.rowsCount);
	if (aprovador.rowsCount > 0) {
		return true;
	}
	
	return false;


}