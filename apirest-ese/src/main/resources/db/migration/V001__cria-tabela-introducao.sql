create table introducao(
	id bigint not null auto_increment ,                   
	titulo            text  not null,
	autoria           text  not null,
	resumo_estruturado text  not null,
	palavras_chave     text  not null,
     
    
    primary key(id)
);