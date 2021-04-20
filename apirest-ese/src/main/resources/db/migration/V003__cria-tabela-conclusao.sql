create table conclusao(
	id bigint not null auto_increment,                   
	desvios_planejamento         text  not null,
	analises          text  not null,
	discussao       text  not null,  
    conclusoes_trab_fut  text  not null,
    contribuidores  text  not null,
    referencias text  not null,
    apendices text  not null,
    primary key(id)
);