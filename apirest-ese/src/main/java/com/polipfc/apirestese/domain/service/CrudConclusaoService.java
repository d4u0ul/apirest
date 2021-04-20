package com.polipfc.apirestese.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polipfc.apirestese.domain.model.Conclusao;
import com.polipfc.apirestese.domain.repository.ConclusaoRepository;

@Service
public class CrudConclusaoService {

	

	
	@Autowired
	private ConclusaoRepository conclusaoRepository;
	
	
	public Conclusao salva(Conclusao conclusao) {
		return conclusaoRepository.save(conclusao);
	}

	public void excluir(Long des_id) {
		conclusaoRepository.deleteById(des_id);
	}

}
