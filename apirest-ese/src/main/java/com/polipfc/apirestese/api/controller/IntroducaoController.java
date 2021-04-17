package com.polipfc.apirestese.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polipfc.apirestese.domain.model.Introducao;
import com.polipfc.apirestese.domain.repository.IntroducaoRepository;

@RestController
@RequestMapping("/relatorio/introducao")
public class IntroducaoController {
	
	@Autowired
	private IntroducaoRepository introducaoRepository;
	
	
	
	@GetMapping()
	public List<Introducao> listar() {
		return introducaoRepository.findAll();
		
	}
	
}





































