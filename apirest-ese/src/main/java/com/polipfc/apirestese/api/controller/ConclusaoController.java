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

import com.polipfc.apirestese.domain.model.Conclusao;
import com.polipfc.apirestese.domain.model.Conclusao;
import com.polipfc.apirestese.domain.model.Conclusao;
import com.polipfc.apirestese.domain.repository.ConclusaoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.polipfc.apirestese.domain.repository.ConclusaoRepository;

@RestController
@RequestMapping("/relatorio/conclusao")
@Api(value = "API REST SACREES")
@CrossOrigin(origins="*")
public class ConclusaoController {
	
	@Autowired
	private ConclusaoRepository conclusaoRespository;
	
	
	
	@GetMapping()
	@ApiOperation(value="lista todas as conclusões do sistema")
	public List<Conclusao> listar() {
		return conclusaoRespository.findAll();
		
	}
	
	@GetMapping("/{conc_id}")
	@ApiOperation(value="busca 1 de todas as conclusões")
	public ResponseEntity<Conclusao> busca(@Valid @PathVariable Long conc_id) {
		
		Optional<Conclusao> conclusao = conclusaoRespository.findById(conc_id);
		if(conclusao.isPresent()) {
			return ResponseEntity.ok(conclusao.get());
		}
		
		
		return ResponseEntity.notFound().build();
	
	}
	 
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value="adiciona 1 conclusão")
	public Conclusao adicionar(@Valid @RequestBody Conclusao conclusao) {
		return conclusaoRespository.save(conclusao);
	}
	
	@PutMapping("/{conc_id}")
	@ApiOperation(value="atualiza 1 das conclusões do sistema")
	public ResponseEntity<Conclusao> atualizar (@Valid  @PathVariable Long conc_id, @Valid @RequestBody Conclusao conclusao){
		if(!conclusaoRespository.existsById(conc_id)) {
			return ResponseEntity.notFound().build();
		}
		conclusao.setId(conc_id);
		conclusaoRespository.save(conclusao);
		return ResponseEntity.ok(conclusao);
		
	}
	
	@DeleteMapping("/{conc_id}")
	@ApiOperation(value="deleta uma das conclusões do sistema")
	public ResponseEntity<Void> remover(@PathVariable Long conc_id){
		if(!conclusaoRespository.existsById(conc_id)) {
			return ResponseEntity.notFound().build();
		}
		conclusaoRespository.deleteById(conc_id);
		return ResponseEntity.noContent().build();
		
	}
}
