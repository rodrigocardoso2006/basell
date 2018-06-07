create view v_beneficio_mes as
SELECT        ROW_NUMBER() OVER (ORDER BY dat_movto ASC) AS Row#, CASE MONTH(dat_movto) 
WHEN 1 THEN 'jan' WHEN 2 THEN 'fev' WHEN 3 THEN 'mar' WHEN 4 THEN 'abr' WHEN 5 THEN 'mai' WHEN 6 THEN 'jun' WHEN 7 THEN 'jul' WHEN 8 THEN 'ago' WHEN 9 THEN
 'set' WHEN 10 THEN 'out' WHEN 11 THEN 'nov' WHEN 12 THEN 'dez' END + '/' + CONVERT(VARCHAR(4), YEAR(dat_movto)) AS mes
FROM            HISTOR_PROCES hp, PROCES_WORKFLOW pw
WHERE        pw.COD_EMPRESA = 1 AND pw.LOG_ATIV = 0 AND pw.COD_DEF_PROCES = 'Beneficio' AND hp.COD_EMPRESA = pw.COD_EMPRESA AND 
                         hp.NUM_PROCES = pw.NUM_PROCES AND hp.NUM_SEQ_MOVTO = 1