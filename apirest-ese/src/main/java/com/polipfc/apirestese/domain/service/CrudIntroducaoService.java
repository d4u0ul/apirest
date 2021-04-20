package com.polipfc.apirestese.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polipfc.apirestese.domain.exception.NegocioException;
import com.polipfc.apirestese.domain.model.Introducao;
import com.polipfc.apirestese.domain.repository.IntroducaoRepository;
@Service
public class CrudIntroducaoService {
	
	/*
	 * classe separada para implementar os processos de negócio e alteração de bancodedados de Introducao, cada classe deve ter uma única atribuição
	 * 	as chamadas de consulta podem ficar no próprio model, já que não alteram o bd
	 */
	
	
	@Autowired
	private IntroducaoRepository introducaoRepository;
	
	
	public Introducao salva(Introducao introducao) {
		
		Introducao introducaoTituloExistente = introducaoRepository.findByTitulo(introducao.getTitulo());
		
		if(introducaoTituloExistente !=null &&!introducaoTituloExistente.equals((introducao))) {
			throw new NegocioException("titulo já existente");
		}
		return introducaoRepository.save(introducao);
	}
	
	public void excluir(Long intro_id) {
		introducaoRepository.deleteById(intro_id);
	}
	
	
	
	
	
	
	

}
