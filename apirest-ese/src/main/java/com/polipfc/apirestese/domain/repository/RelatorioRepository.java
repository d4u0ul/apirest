package com.polipfc.apirestese.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polipfc.apirestese.domain.model.Conclusao;
import com.polipfc.apirestese.domain.model.Desenvolvimento;
import com.polipfc.apirestese.domain.model.Introducao;
import com.polipfc.apirestese.domain.model.Relatorio;

@Repository
public interface RelatorioRepository extends JpaRepository<Relatorio, Long>{

	Relatorio findByIntroducao(Introducao introducao);
	Relatorio findByDesenvolvimento(Desenvolvimento desenvolvimento);
	Relatorio findByConclusao(Conclusao conclusao);
	//Relatorio findByRelatorio(Introducao introducao,Desenvolvimento desenvolvimento,Conclusao conclusao);
}
