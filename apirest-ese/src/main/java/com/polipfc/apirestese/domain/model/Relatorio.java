package com.polipfc.apirestese.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Relatorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	//private Introducao introducao;
	//private Desenvolvimento desenvolvimento;
	//private Conclusao conclusao;
	//private List<Comentario> comentarios= new ArrayList<>();
	
}
