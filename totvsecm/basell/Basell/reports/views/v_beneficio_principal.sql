create view v_beneficio_principal as
SELECT        NR_FICHA, MAX(CAST(CASE WHEN cod_campo = 'matricula' THEN cod_valor END AS varchar(MAX))) AS matricula, 
                         MAX(CAST(CASE WHEN cod_campo = 'matriculaRh' THEN cod_valor END AS varchar(MAX))) AS matriculaRh, 
                         MAX(CAST(CASE WHEN cod_campo = 'centroCusto' THEN cod_valor END AS varchar(MAX))) AS centroCusto
FROM            FICHA f, DOCUMENTO d
WHERE        f.COD_EMPRESA = 1 AND f.NR_FICHARIO = 1688 AND d.COD_EMPRESA = f.COD_EMPRESA and d.NR_DOCUMENTO = f.NR_FICHA and d.NR_VERSAO = f.NR_VERSAO and d.VERSAO_ATIVA = 1
GROUP BY NR_FICHA;