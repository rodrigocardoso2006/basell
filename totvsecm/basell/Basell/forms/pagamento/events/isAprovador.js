function isAprovador(colaborador) {
	var ROLE = 1;
	
	var c1 = DatasetFactory.createConstraint("workflowColleagueRolePK.colleagueId", colaborador, colaborador, ConstraintType.MUST);
	var c2 = DatasetFactory.createConstraint("workflowColleagueRolePK.roleId", ROLE, ROLE, ConstraintType.MUST);
	var constraints = new Array(c1,c2);
	var aprovador = DatasetFactory.getDataset("workflowColleagueRole", null, constraints, null);
	if (aprovador.rowsCount > 0) {
		return true;
	}
	
	return false;

}