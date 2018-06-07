function mascaraData(campoData){
	var data = campoData.value;
	if (data.length == 2){
		data = data + '/';
		campoData.value = data;
		return true;                            
	}              
	if (data.length == 5){                  
		data = data + '/';                  
		campoData.value = data;                  
		return true;              
	}         
}

function somente_numero(campo){   
	var digits="0123456789";   
	var campo_temp;   
	for (var i=0;i<campo.value.length;i++){   
		campo_temp=campo.value.substring(i,i+1);   
		if (digits.indexOf(campo_temp)==-1){   
			campo.value = campo.value.substring(0,i);   
		}   
	}   
}   

