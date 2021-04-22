package com.polipfc.apirestese.api.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
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

import com.polipfc.apirestese.api.model.RelatorioRepresentationModel;
import com.polipfc.apirestese.domain.exception.NegocioException;
import com.polipfc.apirestese.domain.model.Introducao;
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
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping()
	public List<RelatorioRepresentationModel> listar() {
		return toCollectionModel(relatorioRepository.findAll());
		
	}
	
	@GetMapping("/{relatorio_id}")
	public ResponseEntity<RelatorioRepresentationModel> busca(@Valid @PathVariable Long relatorio_id) {
		
		Optional<Relatorio> relatorio = relatorioRepository.findById(relatorio_id);
		if(relatorio.isPresent()) {
			RelatorioRepresentationModel relatorioRepresentationModel = toModel(relatorio.get());
			return ResponseEntity.ok(relatorioRepresentationModel);
		}
		return ResponseEntity.notFound().build();
	}
	
 
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public RelatorioRepresentationModel adicionar(@Valid @RequestBody Relatorio relatorio) {
		return toModel(crudRelatorioService.cria(relatorio));
	}

	@DeleteMapping("/{relatorioId}")
	public ResponseEntity<Void> remover(@PathVariable Long relatorioId){
		if(!relatorioRepository.existsById(relatorioId)) {
			return ResponseEntity.notFound().build();
		}
		crudRelatorioService.excluir(relatorioId);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{relatorio_id}")
	public ResponseEntity<Relatorio> atualizar (@Valid  @PathVariable Long relatorio_id, @Valid @RequestBody Relatorio relatorio){
		if(!relatorioRepository.existsById(relatorio_id)) {
			return ResponseEntity.notFound().build();
		}
		Relatorio relatorioExistente = relatorioRepository.findById(relatorio_id).orElseThrow(() -> new NegocioException("Id de Relatório não encontrado"));
		relatorio.setStatusRelatorio(relatorioExistente.getStatusRelatorio());
		relatorio.setDataAbertura(relatorioExistente.getDataAbertura());
		relatorio.setId(relatorio_id);
		crudRelatorioService.atualiza(relatorio);
		return ResponseEntity.ok(relatorio);
		
	}
	
	
	
	
	@PutMapping("/{relatorioId}/finalizacao")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void finalizar(@PathVariable Long relatorioId) {
		crudRelatorioService.finalizar(relatorioId);
	}
	
	private RelatorioRepresentationModel toModel(Relatorio relatorio) {
		return  modelMapper.map(relatorio, RelatorioRepresentationModel.class);
	}
	private List<RelatorioRepresentationModel> toCollectionModel(List<Relatorio> relatorios) {
		
		return relatorios.stream().map(relatorio -> toModel(relatorio)).collect(Collectors.toList());
		
	}

	@PutMapping("/{relatorioId}/cancelamento")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void cancelar(@PathVariable Long relatorioId) {
		crudRelatorioService.cancelar(relatorioId);
	}
	
	@PutMapping("/{relatorioId}/reabertura")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void reabrir(@PathVariable Long relatorioId) {
		crudRelatorioService.reabrir(relatorioId);
	}
	
}





















































