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

import com.polipfc.apirestese.api.model.ComentarioInput;
import com.polipfc.apirestese.api.model.ComentarioModel;
import com.polipfc.apirestese.domain.exception.EntidadeNaoEncontradaException;
import com.polipfc.apirestese.domain.model.Comentario;
import com.polipfc.apirestese.domain.model.Relatorio;
import com.polipfc.apirestese.domain.repository.ComentarioRepository;
import com.polipfc.apirestese.domain.repository.RelatorioRepository;
import com.polipfc.apirestese.domain.service.CrudRelatorioService;

@RestController
@RequestMapping(("/relatorio/{relatorioId}/comentarios"))
public class ComentarioController {

	@Autowired
	private CrudRelatorioService crudRelatorioService; 
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RelatorioRepository relatorioRepository ;
	
	@Autowired
	private ComentarioRepository comentarioRepository;
	
	@GetMapping
	public List<ComentarioModel> listar(@PathVariable Long relatorioId){
		Relatorio relatorio = relatorioRepository.findById(relatorioId).orElseThrow(() -> new EntidadeNaoEncontradaException("relatorio não encontrada"));
		return toCollectionModel(relatorio.getComentarios());
	}
	
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ComentarioModel adicionar(@PathVariable  Long relatorioId,@Valid @RequestBody ComentarioInput comentarioInput) {
		Comentario comentario = crudRelatorioService.adicionarComentario(relatorioId, comentarioInput.getDescricao()); 
		return toModel(comentario);
	}
	
		
	
	@PutMapping("/{comentario_id}")
	public ResponseEntity<Comentario> atualizar (@Valid  @PathVariable Long comentario_id, @Valid @RequestBody Comentario comentario){
		if(!comentarioRepository.existsById(comentario_id)) {
			return ResponseEntity.notFound().build();
		}
		comentario.setId(comentario_id);
		crudRelatorioService.adicionarComentario(comentario.getRelatorio().getId() ,comentario.getDescricao());
		return ResponseEntity.ok(comentario);
		
	} 
	
	@DeleteMapping("{comentarioId}")
	public ResponseEntity<Void> remover(@PathVariable Long relatorioId,@PathVariable Long comentarioId){
		if(!relatorioRepository.existsById(relatorioId)||!comentarioRepository.existsById(comentarioId)) {
			return ResponseEntity.notFound().build();
		}
		Relatorio relatorio = relatorioRepository.findById(relatorioId).orElseThrow(() -> new EntidadeNaoEncontradaException("relatorio não encontrado"));
		List<Comentario> comentarios= relatorio.getComentarios();
		for( Comentario i : comentarios) {
			if(i.getId()!=(comentarioId)) {
				return ResponseEntity.notFound().build();
			}
		}
		crudRelatorioService.excluirComentario(relatorioId, comentarioId );
		return ResponseEntity.noContent().build();
		
	}
	
	private ComentarioModel toModel(Comentario comentario) {
		return modelMapper.map(comentario, ComentarioModel.class);
	}
	
	private List<ComentarioModel> toCollectionModel(List<Comentario> comentarios){
		return comentarios.stream().map(comentario -> toModel(comentario)).collect(Collectors.toList());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
