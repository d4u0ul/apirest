alter table introducao drop column resumo_estruturado;

alter table introducao add column 
resumoEstruturado_conclusoes text not null  after autoria; 

alter table introducao add column 
resumoEstruturado_limitacoesObservadas text not null  after autoria;

alter table introducao add column 
resumoEstruturado_resultadosObtidos text not null  after autoria; 

alter table introducao add column 
resumoEstruturado_metodosUtilizados text not null  after autoria; 

alter table introducao add column 
resumoEstruturado_objetivosDaPesquisa text not null  after autoria;  

alter table introducao add column 
resumoEstruturado_background text not null  after autoria;  