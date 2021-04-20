package com.polipfc.apirestese.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polipfc.apirestese.domain.model.Desenvolvimento;
import com.polipfc.apirestese.domain.repository.DesenvolvimentoRepository;
@Service
public class CrudDesenvolvimentoService {

	
	
	@Autowired
	private DesenvolvimentoRepository desenvolvimentoRepository;
	
	
	public Desenvolvimento salva(Desenvolvimento desenvolvimento) {
		return desenvolvimentoRepository.save(desenvolvimento);
	}

	public void excluir(Long des_id) {
		desenvolvimentoRepository.deleteById(des_id);
	}
	
}
