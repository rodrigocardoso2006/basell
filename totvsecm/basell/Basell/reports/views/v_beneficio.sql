create view v_beneficio as
SELECT        v.NR_FICHA, v.matricula, v.matriculaRh, v.centroCusto, MAX(CAST(CASE WHEN cod_campo LIKE 'beneficiario___%' THEN cod_valor END AS varchar(MAX))) 
                         AS beneficiario, MAX(CAST(CASE WHEN cod_campo LIKE 'codigoEvento___%' THEN cod_valor END AS varchar(MAX))) AS evento, 
                         MAX(CAST(CASE WHEN cod_campo LIKE 'dataLimite___%' THEN cod_valor END AS varchar(MAX))) AS dataLimite, 
                         MAX(CAST(CASE WHEN cod_campo LIKE 'mesCompetencia___%' THEN cod_valor END AS varchar(MAX))) AS mes, 
                         MAX(CAST(CASE WHEN cod_campo LIKE 'nomeBeneficio___%' THEN cod_valor END AS varchar(MAX))) AS beneficio, 
                         MAX(CAST(CASE WHEN cod_campo LIKE 'valorReembolso___%' THEN cod_valor END AS varchar(MAX))) AS valor,
                         MAX(CAST(CASE WHEN cod_campo LIKE 'tipoIntervalo___%' THEN cod_valor END AS varchar(MAX))) AS tipoIntervalo
FROM            dbo.v_beneficio_principal AS v INNER JOIN
                         dbo.FICHA AS f ON v.NR_FICHA = f.NR_FICHA
WHERE        (f.COD_EMPRESA = 1) AND (f.COD_CAMPO LIKE 'beneficiario___%' OR
                         f.COD_CAMPO LIKE 'codigoEvento___%' OR
                         f.COD_CAMPO LIKE 'dataLimite___%' OR
                         f.COD_CAMPO LIKE 'mesCompetencia___%' OR
                         f.COD_CAMPO LIKE 'nomeBeneficio___%' OR
                         f.COD_CAMPO LIKE 'valorReembolso___%' OR
                         f.COD_CAMPO LIKE 'tipoIntervalo___%' )
GROUP BY v.NR_FICHA, v.matricula, v.matriculaRh, v.centroCusto, SUBSTRING(f.COD_CAMPO, CHARINDEX('___', f.COD_CAMPO) + 3, 2)