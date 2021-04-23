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

import com.polipfc.apirestese.domain.model.Desenvolvimento;
import com.polipfc.apirestese.domain.repository.DesenvolvimentoRepository;

@RestController
@RequestMapping("/relatorio/desenvolvimento")
public class DesenvolvimentoController {

	
	
	@Autowired
	private DesenvolvimentoRepository desenvolvimentoRespository;
	
	
	
	@GetMapping()
	public List<Desenvolvimento> listar() {
		return desenvolvimentoRespository.findAll();
		
	}
	
	@GetMapping("/{des_id}")
	public ResponseEntity<Desenvolvimento> busca(@Valid @PathVariable Long des_id) {
		
		Optional<Desenvolvimento> introducao = desenvolvimentoRespository.findById(des_id);
		if(introducao.isPresent()) {
			return ResponseEntity.ok(introducao.get());
		}
		
		
		return ResponseEntity.notFound().build();
	
	}
	 
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Desenvolvimento adicionar(@Valid @RequestBody Desenvolvimento introducao) {
		return desenvolvimentoRespository.save(introducao);
	}
	
	@PutMapping("/{des_id}")
	public ResponseEntity<Desenvolvimento> atualizar (@Valid  @PathVariable Long des_id, @Valid @RequestBody Desenvolvimento introducao){
		if(!desenvolvimentoRespository.existsById(des_id)) {
			return ResponseEntity.notFound().build();
		}
		introducao.setId(des_id);
		desenvolvimentoRespository.save(introducao);
		return ResponseEntity.ok(introducao);
		
	}
	
	@DeleteMapping("/{des_id}")
	public ResponseEntity<Void> remover(@PathVariable Long des_id){
		if(!desenvolvimentoRespository.existsById(des_id)) {
			return ResponseEntity.notFound().build();
		}
		desenvolvimentoRespository.deleteById(des_id);
		//return ResponseEntity.noContent().build();
		return ResponseEntity.noContent().build();
	}
	
}
