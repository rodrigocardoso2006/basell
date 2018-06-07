function convertToFloat(campo) {
}

function getDateString(data) {
	var d = new Date();
	return formataTempo(d.getDate()) + "/" + formataTempo(d.getMonth()+1) + "/" + d.getFullYear();  
}

function formataTempo(valor) {
	if (valor<10) { return "0" + valor; }
	return valor;
}

var myfunctions = (function(){
	var index = 1;
	return {
		data: function(id, options) {
			
			if (options == null || options == undefined) {
				options = {
					language: "pt-br",
					showToday: true,
				};
			}

			var i = $("#" + id);
			
			var div = i.parent().html();
			var html = '<div class="input-group date" id="date_' + id + '">' + div + '<span class="input-group-addon"><span class="fluigicon fluigicon-calendar"></span></span></div>';

			i.parent().html(html);

			return FLUIGC.calendar("#" + id, options);

		},
		numero: function(id, decimals, negatives) {
			$("#" + id).priceFormat({
				clearPrefix: true,
				prefix: '',
			    centsSeparator: ',',
			    thousandsSeparator: '.',
			    centsLimit: decimals,
			    allowNegative: negatives
			});
		},
		moeda: function(id, decimals, negatives) {
			$("#" + id).priceFormat({
				prefix: "R$ ",
			    centsSeparator: ',',
			    thousandsSeparator: '.',
			    centsLimit: decimals,
			    allowNegative: negatives
			});
		},
		percentual: function(id, decimals, negatives) {
			tdifunctions.loadJs(3);
			$("#" + id).priceFormat({
				clearPrefix: true,
				prefix: '',
				suffix: '%',
			    centsSeparator: ',',
			    thousandsSeparator: '.',
			    centsLimit: decimals,
			    allowNegative: negatives
			});
		},
		telefone: function(id){
			$("#" + id).mask("(99) 9999-9999?9");
			$("#" + id).focusout(function(){
			    var phone, element;
			    element = $(this);
			    element.unmask();
			    phone = element.val().replace(/\D/g, '');
			    if(phone.length > 10) {
			        element.mask("(99) 99999-999?9");
			    } else {
			        element.mask("(99) 9999-9999?9");
			    }
			}).trigger('focusout');
		},
		tofloat: function(id) {
			var valor = $("#" + campo).val();
			var numero = 0;
			if (valor != "") { numero = valor.replace(/\./g,'').replace(",", "."); }
			return parseFloat(numero);
		},
		required: function(id) {
			$("label[for=" + id + "]").addClass("required");
		},
		unrequired: function(id) {
			$("label[for=" + id + "]").removeClass("required");
		},
		indexson: function(id) {
			return id.substr(id.indexOf("___") + 3); 
		},
		getindex: function() {
			return myfunctions.index;
		},
		setupdata: function() {
			$("form :input").each(function(){
				if ($(this).data("required") == true) {
					var label = $("label[for='"+ $(this).attr('name')+"']");
					label.addClass("required");
				}
				else if ($(this).data("type") == "date") {
					var f = "";
					if ($(this).data("date-format") != undefined) { f = $(this).data("date-format"); }
					myfunctions.data($(this).attr("id"), f);
				}
				else if ($(this).data("type") == "telefone") { tdifunctions.setTelefone($(this).attr("id")); }
				else if ($(this).data("type") == "inteiro") {
					var d = 2;
					if ($(this).data("decimals") != undefined) { d = +($(this).data("decimals")); }
					var n = false;
					if ($(this).data("negative") != undefined) { n = $(this).data("negative"); }
					myfunctions.numero($(this).attr("id"), d, n);
				} else if ($(this).data("type") == "moeda") {
					var d = 2;
					if ($(this).data("decimals") != undefined) { d = +($(this).data("decimals")); }
					var n = false;
					if ($(this).data("negative") != undefined) { n = $(this).data("negative"); }
					myfunctions.moeda($(this).attr("id"), d, n);
				} else if ($(this).data("type") == "percentual") {
					var d = 2;
					if ($(this).data("decimals") != undefined) { d = +($(this).data("decimals")); }
					var n = false;
					if ($(this).data("negative") != undefined) { n = $(this).data("negative"); }
					myfunctions.percentual($(this).attr("id"), d, n);
				}
			});
		},
		showerror: function(msg) {
			FLUIGC.toast({ title: 'Erro:', message: msg, type: 'error' });
		},
		showwarning: function(msg) {
			FLUIGC.toast({ title: 'Aviso:', message: msg, type: 'warning' });
		},
		showinfo: function(msg) {
			FLUIGC.toast({ title: 'Informa&ccedil;&atilde;o:', message: msg, type: 'info' });
		}

	};
})();

$(document).ready(function() {
	myfunctions.setupdata();
});

