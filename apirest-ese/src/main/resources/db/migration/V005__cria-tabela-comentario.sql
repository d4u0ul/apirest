create table comentario(
	id bigint not null auto_increment,
    relatorio_id bigint not null,
    descricao text not null,
    data_envio datetime not null,
    
    primary key(id)
);

alter table comentario add constraint fk_comentario_relatorio
foreign key (relatorio_id) references relatorio (id);