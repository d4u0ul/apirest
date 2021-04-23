create table relatorio(
	id bigint not null auto_increment,
    introducao_id bigint not null,
    desenvolvimento_id bigint not null,
    conclusao_id bigint not null,
    descricao text not null,
    status varchar(20) not null,
    data_abertura datetime not null,
    data_finalizacao datetime,
    primary key (id)   
    
);

alter table relatorio add constraint fk_relatorio_introducao
foreign key(introducao_id) references introducao (id);

alter table relatorio add constraint fk_relatorio_desenvolvimento
foreign key(desenvolvimento_id) references desenvolvimento(id);
alter table relatorio add constraint fk_relatorio_conclusao
foreign key(conclusao_id) references conclusao(id);