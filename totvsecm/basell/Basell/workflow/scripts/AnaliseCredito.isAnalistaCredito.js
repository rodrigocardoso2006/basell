function beforeStateEntry(sequenceId){

	

	if (sequenceId != 1) {

		var processId = getValue("WKNumProces");

		hAPI.setCardValue("numProcesso", processId);

	}

	

}