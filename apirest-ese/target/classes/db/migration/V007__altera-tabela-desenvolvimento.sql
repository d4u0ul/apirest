alter table desenvolvimento drop column introducao;
alter table desenvolvimento drop column historico;
alter table desenvolvimento drop column planejamento;

alter table desenvolvimento add column 
intro_demonstracaoproblema text not null ;
alter table desenvolvimento add column 
intro_objetivopesquisa text not null ;
alter table desenvolvimento add column 
intro_contexto text not null ;
alter table desenvolvimento add column 
hist_tecnologiasobinvestigacao text not null ;
alter table desenvolvimento add column 
hist_tecnologiasalternativas text not null ;
alter table desenvolvimento add column 
hist_estudosrelacionados text not null ;
alter table desenvolvimento add column 
hist_relavanciapratica text not null ;
alter table desenvolvimento add column 
planexp_objetivos text not null ;
alter table desenvolvimento add column 
planexp_unidadesexperimentais text not null ;
alter table desenvolvimento add column 
planexp_materialexperimento text not null ;
alter table desenvolvimento add column 
planexp_tarefas text not null ;
alter table desenvolvimento add column 
planexp_hipoparamvariaveis text not null ;
alter table desenvolvimento add column 
planexp_design text not null ;
alter table desenvolvimento add column 
planexp_procedimentos text not null ;
alter table desenvolvimento add column 
planexp_analiseprocedimentos text not null ;