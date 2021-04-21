package com.polipfc.apirestese.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polipfc.apirestese.domain.model.Conclusao;
import com.polipfc.apirestese.domain.model.Desenvolvimento;
import com.polipfc.apirestese.domain.model.Introducao;
import com.polipfc.apirestese.domain.model.Relatorio;

@Repository
public interface RelatorioRepository extends JpaRepository<Relatorio, Long>{

	List<Relatorio> findByIntroducao(Introducao introducao);
	List<Relatorio> findByDesenvolvimento(Desenvolvimento desenvolvimento);
	List<Relatorio> findByConclusao(Conclusao conclusao);
	
}
