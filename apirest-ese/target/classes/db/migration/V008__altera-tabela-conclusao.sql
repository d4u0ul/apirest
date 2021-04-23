alter table conclusao drop column discussao;
alter table conclusao drop column conclusoes_trab_fut;

alter table conclusao add column conclusoes_trab_fut text not null after analises;
alter table conclusao add column conclusoes_impacto text not null after analises;
alter table conclusao add column conclusoes_resumo text not null after analises;
alter table conclusao add column disc_inferencias text not null after analises;
alter table conclusao add column disc_ameacas_validacao text not null after analises;
alter table conclusao add column disc_avaliacao_res_imp text not null after analises; 