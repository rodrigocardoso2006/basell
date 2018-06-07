function validateAvailableStates(iCurrentState, stateList) {
	if (iCurrentState == 4) {
		stateList.clear();
		stateList.add(new java.lang.Integer(8));
		stateList.add(new java.lang.Integer(5));
		stateList.add(new java.lang.Integer(6));
		stateList.add(new java.lang.Integer(7));
		return stateList;
	}
}