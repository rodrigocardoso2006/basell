create table rh_saldo_funcionario (

	matricula varchar(255) primary key, 
	codigoEvento varchar(100), 
	mesCompetencia varchar(50), 
	saldo numeric (16,2)

)

create unique index ix_matricula on rh_saldo_funcionario (matricula)