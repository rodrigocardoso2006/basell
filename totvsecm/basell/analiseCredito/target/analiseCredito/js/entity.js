var listFornecedores = new Array();
var listDocumentos = new Array();
var listTipos = new Array();
var listGrupos = new Array();

function addFornecedor(numero, descricao, ativo, quantidade, grupo, comentario) {
	var o = {};
	o["fornecedorId"] = numero;
	o["descricao"] = descricao;
	o["ativo"] = ativo;
	o["quantidade"] = quantidade;
	o["grupo"] = grupo;
	o["comentario"] = comentario;
	listFornecedores.push(o);
}

function addDocumento(numero, fornecedorId, descricao, comentario, palavra, ativo, dataCriacao, versao, dataExpiracao, dataPendente, dataProvisorio, dataRenovacao, descPendente, descProvisorio, descRenovacao, pendente, provisorio, renovacao, expira, extra) {
	var o = new Object();
	o["numero"] = numero;
	o["fornecedorId"] = fornecedorId;
	o["descricao"] = descricao;
	o["ativo"] = ativo;
	o["comentario"] = comentario;
	o["palavra"] = palavra;
	o["dataCriacao"] = dataCriacao;
	o["versao"] = versao;
	o["dataExpiracao"] = dataExpiracao;
	o["dataPendente"] = dataPendente;
	o["dataProvisorio"] = dataProvisorio;
	o["descPendente"] = descPendente;
	o["descProvisorio"] = descProvisorio;
	o["descRenovacao"] = descRenovacao;
	o["pendente"] = pendente;
	o["provisorio"] = provisorio;
	o["renovacao"] = renovacao;
	o["expira"] = expira;
	o["extra"] = extra;
	listDocumentos.push(o);
}

function addTipo(codigo, descricao) {
	var o = {};
	o["codigo"] = codigo;
	o["descricao"] = descricao;
	listTipos.push(o);
}

function addGrupo(codigo, descricao) {
	var o = {};
	o["codigo"] = codigo;
	o["descricao"] = descricao;
	listGrupos.push(o);
}

function getFornecedorAtivo() {
	var l = new Array();
	for (var i=0;i<listFornecedores.length;i++) {
		var o = listFornecedores[i];
		if (o.ativo) { l.push(o); }
	}
	return l;
}

function getDocumentByNumber(doc) {
	for (var i=0;i<listDocumentos.length;i++) {
		var o = listDocumentos[i];
		if (o.numero == doc) { return o; }
	}
	return null;
}