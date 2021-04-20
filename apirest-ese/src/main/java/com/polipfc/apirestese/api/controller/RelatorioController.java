package com.polipfc.apirestese.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.polipfc.apirestese.domain.model.Relatorio;
import com.polipfc.apirestese.domain.repository.RelatorioRepository;
import com.polipfc.apirestese.domain.service.CrudRelatorioService;

@RestController
@RequestMapping("/relatorio")
public class RelatorioController {
	@Autowired
	CrudRelatorioService crudRelatorioService;
	@Autowired
	RelatorioRepository relatorioRepository;
	
	@GetMapping()
	public List<Relatorio> listar() {
		return relatorioRepository.findAll();
		
	}
	
	@GetMapping("/{relatorio_id}")
	public ResponseEntity<Relatorio> busca(@Valid @PathVariable Long relatorio_id) {
		
		Optional<Relatorio> introducao = relatorioRepository.findById(relatorio_id);
		if(introducao.isPresent()) {
			return ResponseEntity.ok(introducao.get());
		}
		
		
		return ResponseEntity.notFound().build();
	
	}
	 
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Relatorio adicionar(@Valid @RequestBody Relatorio relatorio) {
		return crudRelatorioService.cria(relatorio);
	}
	
	@PutMapping("/{relatorio_id}")
	public ResponseEntity<Relatorio> atualizar (@Valid  @PathVariable Long relatorio_id, @Valid @RequestBody Relatorio relatorio){
		if(!relatorioRepository.existsById(relatorio_id)) {
			return ResponseEntity.notFound().build();
		}
		relatorio.setId(relatorio_id);
		crudRelatorioService.cria(relatorio);
		return ResponseEntity.ok(relatorio);
		
	}
	
	@DeleteMapping("/{relatorio_id}")
	public ResponseEntity<Void> remover(@PathVariable Long relatorio_id){
		if(!relatorioRepository.existsById(relatorio_id)) {
			return ResponseEntity.notFound().build();
		}
		crudRelatorioService.excluir(relatorio_id);
		return ResponseEntity.noContent().build();
		
	}
	
	
	
}
