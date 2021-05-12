package com.polipfc.apirestese.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.polipfc.apirestese.domain.model.Introducao;
import com.polipfc.apirestese.domain.repository.IntroducaoRepository;
import com.polipfc.apirestese.domain.service.CrudIntroducaoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/relatorio/introducao")
@Api(value = "API REST SACREES")
@CrossOrigin(origins="*")
public class IntroducaoController {
	
	@Autowired
	private IntroducaoRepository introducaoRepository;
	
	@Autowired
	private CrudIntroducaoService crudIntroducaoService;
	
	@GetMapping()
	@ApiOperation(value="Retorna uma lista das introduções registradas do sistema")
	public List<Introducao> listar() {
		return introducaoRepository.findAll();
		
	}
	@ApiOperation(value="Retorna 1  das introduções registradas do sistema")
	@GetMapping("/{intro_id}")
	public ResponseEntity<Introducao> busca(@Valid @PathVariable Long intro_id) {
		
		Optional<Introducao> introducao = introducaoRepository.findById(intro_id);
		if(introducao.isPresent()) {
			return ResponseEntity.ok(introducao.get());
		}
		
		
		return ResponseEntity.notFound().build();
	
	}
	 
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value="Adiciona 1  das introduções registradas do sistema")
	public Introducao adicionar(@Valid @RequestBody Introducao introducao) {
		return crudIntroducaoService.salva(introducao);
	}
	
	@PutMapping("/{intro_id}")
	@ApiOperation(value="Atualiza 1  das introduções registradas do sistema")
	public ResponseEntity<Introducao> atualizar (@Valid  @PathVariable Long intro_id, @Valid @RequestBody Introducao introducao){
		if(!introducaoRepository.existsById(intro_id)) {
			return ResponseEntity.notFound().build();
		}
		introducao.setId(intro_id);
		crudIntroducaoService.salva(introducao);
		return ResponseEntity.ok(introducao);
		
	}
	@ApiOperation(value="Deleta 1  das introduções registradas do sistema")
	@DeleteMapping("/{intro_id}")
	public ResponseEntity<Void> remover(@PathVariable Long intro_id){
		if(!introducaoRepository.existsById(intro_id)) {
			return ResponseEntity.notFound().build();
		}
		crudIntroducaoService.excluir(intro_id);
		return ResponseEntity.noContent().build();
		
	}
	
	
	
}





































