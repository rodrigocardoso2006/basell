function beforeStateEntry(sequenceId){
	if (sequenceId == 8) {
		inserirClienteEms();
		throw "Criacao";
	}
}