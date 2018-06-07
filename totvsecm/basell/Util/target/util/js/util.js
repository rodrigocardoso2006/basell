function convertToFloat(campo) {
	var valor = document.getElementById(campo).value;
	var numero = 0;
	if (valor != "") { numero = valor.replace(".", "").replace(",", "."); }
	return parseFloat(numero);
}

function getDateString(data) {
	var d = new Date();
	return formataTempo(d.getDate()) + "/" + formataTempo(d.getMonth()+1) + "/" + d.getFullYear();  
}

function formataTempo(valor) {
	if (valor<10) { return "0" + valor; }
	return valor;
}