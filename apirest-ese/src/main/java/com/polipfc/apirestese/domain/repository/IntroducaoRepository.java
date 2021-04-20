package com.polipfc.apirestese.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polipfc.apirestese.domain.model.Introducao;

@Repository
public interface IntroducaoRepository extends JpaRepository<Introducao, Long>{

	Introducao findByTitulo(String titulo);
	List<Introducao> findByTituloContaining(String titulo);
	List<Introducao> findByAutoria(String Autoria);
	List<Introducao> findByAutoriaContaining(String Autoria);
	List<Introducao> findByPalavrasChave(String titulo);
	List<Introducao> findByPalavrasChaveContaining(String nome);

}
