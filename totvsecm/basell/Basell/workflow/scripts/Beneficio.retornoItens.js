function retornoItens(PROCESSO){
	var DATASET = DatasetBuilder.newDataset();
	DATASET.addColumn("beneficio");
	DATASET.addColumn("valor");
	DATASET.addColumn("mes");
	
	var MAPA = new java.util.HashMap();
	MAPA = hAPI.getCardData(parseInt(PROCESSO));
	var IT = MAPA.keySet().iterator();
	var INDICE_ITEM = 0;
	
	var BENEFICIO = new java.util.HashMap();
	var VALOR = new java.util.HashMap();
	var MES = new java.util.HashMap();
	
	while (IT.hasNext()) {
		var ID = IT.next();

log.info("ITENS:" + ID);
		
		if (ID.match(/nomeBeneficio___/)) {
			log.info("IT MAPA:" + ID + ":" + ID.substring(16) + ":" + MAPA.get(ID));
			BENEFICIO.put(ID.substring(16), MAPA.get(ID));
			try {
				if (parseInt(ID.substring(16)) > INDICE_ITEM)
					INDICE_ITEM = parseInt(ID.substring(16));
			}
			catch(e) {
				log.info("Nao foi possivel formatar os itens da solicitacao! " + e.message);
			}
		}
		else if(ID.match(/valorReembolso___/)) {
			log.info("IT MAPA:" + ID + ":" + ID.substring(17) + ":" + MAPA.get(ID));
			VALOR.put(ID.substring(17),MAPA.get(ID));
		}
		else if(ID.match(/mesCompetencia___/)) {
			log.info("IT MAPA:" + ID + ":" + ID.substring(17) + ":" + MAPA.get(ID));
			MES.put(ID.substring(17),MAPA.get(ID));
		}
	}
	
	for (var i = 0; i <= INDICE_ITEM; i++) {
		if (BENEFICIO.containsKey(i.toString())) {
			log.info("ITEM: " + BENEFICIO.get(i.toString()));
			
			var b = new java.lang.String(BENEFICIO.get(i.toString()));
			var v = new java.lang.String(VALOR.get(i.toString()));
			var m = new java.lang.String(MES.get(i.toString()));
				
			log.info("V:" + b + ":" + v + ":" + m);
				
				DATASET.addRow(new Array(
					b,
					v,
					m
				));
		}
	}

	log.info("Retornou Itens");
	return DATASET;
}