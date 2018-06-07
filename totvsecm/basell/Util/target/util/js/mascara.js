function mascara(o,f){
    v_obj=o;
    v_fun=f;
    setTimeout("execmascara()",1);
}

function execmascara(){
    v_obj.value=v_fun(v_obj.value);
}

/*Função que Determina as expressões regulares dos objetos*/
function leech(v){
    v=v.replace(/o/gi,"0");
    v=v.replace(/i/gi,"1");
    v=v.replace(/z/gi,"2");
    v=v.replace(/e/gi,"3");
    v=v.replace(/a/gi,"4");
    v=v.replace(/s/gi,"5");
    v=v.replace(/t/gi,"7");
    return v;
}

/*Função que permite apenas numeros*/
function inteiro(v){
	return v.replace(/\D/g,"");
}

/*Função que padroniza telefone (11) 4184-1241*/
function telefone(v){
    v=v.replace(/\D/g,"");                            
    v=v.replace(/^(\d\d)(\d)/g,"($1) $2"); 
    v=v.replace(/(\d{4})(\d)/,"$1-$2");      
    return v;
}

/*Função que padroniza telefone (11) 41841241*/
function telefoneCall(v){
    v=v.replace(/\D/g,"");                            
    v=v.replace(/^(\d\d)(\d)/g,"($1) $2");   
    return v;
}

/*Função que padroniza CPF*/
function cpf(v){
	v=v.replace(/\D/g,"");
	v=v.replace(/(\d{3})(\d)/,"$1.$2");         
	v=v.replace(/(\d{3})(\d)/,"$1.$2");         
	v=v.replace(/(\d{3})(\d{1,2})$/,"$1-$2");
    return v;
}
        
/*Função que padroniza CEP*/
function Cep(v){
    v=v.replace(/D/g,"");                            
    v=v.replace(/^(\d{5})(\d)/,"$1-$2"); 
    return v;
}

/*Função que padroniza CNPJ*/
function cnpj(v){
    v=v.replace(/\D/g,"");                              
    v=v.replace(/^(\d{2})(\d)/,"$1.$2");      
    v=v.replace(/^(\d{2})\.(\d{3})(\d)/,"$1.$2.$3"); 
    v=v.replace(/\.(\d{3})(\d)/,".$1/$2");              
    v=v.replace(/(\d{4})(\d)/,"$1-$2");                        
    return v;
}

/*Função que permite apenas numeros Romanos*/
function romanos(v){
    v=v.toUpperCase();                        
    v=v.replace(/[^IVXLCDM]/g,""); 
    while(v.replace(/^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$/,"")!="") {
        v=v.replace(/.$/,"");
    }
    return v;
}

/*Função que padroniza DATA*/
function data(v){
    v=v.replace(/\D/g,""); 
    v=v.replace(/(\d{2})(\d)/,"$1/$2"); 
    v=v.replace(/(\d{2})(\d)/,"$1/$2"); 
    return v;
}

/*Função que padroniza DATA*/
function hora(v){
    v=v.replace(/\D/g,""); 
    v=v.replace(/(\d{2})(\d)/,"$1:$2");  
    return v;
}

/*Função que padroniza valor monétario*/
function valor(v){
    v=v.replace(/\D/g,"");
    v=v.replace(/(\d{1})(\d{17})$/,"$1.$2"); 
    v=v.replace(/(\d{1})(\d{14})$/,"$1.$2"); 
    v=v.replace(/(\d{1})(\d{11})$/,"$1.$2"); 
    v=v.replace(/(\d{1})(\d{8})$/,"$1.$2"); 
    v=v.replace(/(\d{1})(\d{5})$/,"$1.$2"); 
    v=v.replace(/(\d{1})(\d{1,2})$/,"$1,$2");
    return v;
}

function valor5(v){
    v=v.replace(/\D/g,"");
    v=v.replace(/^([0-9]{3}\.?){3}-[0-9]{5}$/,"$1,$2");
    v=v.replace(/(\d)(\d{5})$/,"$1,$2");
    return v;
}

/*Função que padroniza Area*/
function area(v){
    v=v.replace(/\D/g,""); 
    v=v.replace(/(\d)(\d{2})$/,"$1.$2"); 
    return v;
}