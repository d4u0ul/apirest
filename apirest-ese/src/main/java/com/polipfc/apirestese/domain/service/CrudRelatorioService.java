package com.polipfc.apirestese.domain.service;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polipfc.apirestese.domain.exception.NegocioException;
import com.polipfc.apirestese.domain.model.Comentario;
import com.polipfc.apirestese.domain.model.Conclusao;
import com.polipfc.apirestese.domain.model.Desenvolvimento;
import com.polipfc.apirestese.domain.model.Introducao;
import com.polipfc.apirestese.domain.model.Relatorio;
import com.polipfc.apirestese.domain.model.StatusRelatorio;
import com.polipfc.apirestese.domain.repository.ComentarioRepository;
import com.polipfc.apirestese.domain.repository.ConclusaoRepository;
import com.polipfc.apirestese.domain.repository.DesenvolvimentoRepository;
import com.polipfc.apirestese.domain.repository.IntroducaoRepository;
import com.polipfc.apirestese.domain.repository.RelatorioRepository;

@Service
public class CrudRelatorioService {

	@Autowired
	private RelatorioRepository relatorioRepository;
	@Autowired
	private IntroducaoRepository introducaoRepository;
	@Autowired
	private DesenvolvimentoRepository desenvolvimentoRepository;
	@Autowired
	private ConclusaoRepository conclusaoRepository;
	@Autowired
	private ComentarioRepository comentarioRepository;
	
	
	public Relatorio cria(Relatorio relatorio) {
		
		
		Introducao introducao = introducaoRepository.findById(relatorio.getIntroducao().getId()).orElseThrow(() -> new NegocioException("Id de introducao não encontrado"));
		Desenvolvimento desenvolvimento = desenvolvimentoRepository.findById(relatorio.getDesenvolvimento().getId()).orElseThrow(() -> new NegocioException("Id de desenvolvimento não encontrado"));
		Conclusao conclusao = conclusaoRepository.findById(relatorio.getConclusao().getId()).orElseThrow(() -> new NegocioException("Id de conclusao não encontrado"));
	
		
	List<Relatorio> relatoriosExistentes = relatorioRepository.findAll();
	
	for (Relatorio i : relatoriosExistentes) {
		if(i.equals(relatorio)) {
			throw new NegocioException("relatório já existente");
		}
	}
	
		relatorio.setIntroducao(introducao);
		relatorio.setDesenvolvimento(desenvolvimento);
		relatorio.setConclusao(conclusao);
		relatorio.setStatusRelatorio(StatusRelatorio.ABERTO);
		relatorio.setDataAbertura(OffsetDateTime.now());
		return relatorioRepository.save(relatorio);
	}
	
	public void excluir(Long rel_id) {
		relatorioRepository.deleteById(rel_id); 
	}
	
	public Comentario adicionarComentario(Long relatorioId, String descricao) {
		Relatorio relatorio = buscar(relatorioId);
		
		
		Comentario comentario = new Comentario();
		comentario.setDataEnvio(OffsetDateTime.now());
		comentario.setDescricao(descricao);
		comentario.setRelatorio(relatorio);
		
		return comentarioRepository.save(comentario);  
	}
	
	public Comentario excluirComentario(Long relatorioId, Long comentarioId) {
		
		Relatorio relatorio = buscar(relatorioId);
		Comentario comentario = comentarioRepository.findById(comentarioId).orElseThrow(() -> new NegocioException("Relatorio não encontrado"));
		relatorio.getComentarios().remove(comentario);
		comentarioRepository.deleteById(comentarioId);
		return comentarioRepository.save(comentario);  
	}
	
	public void finalizar(Long relatorioId) {

			Relatorio relatorio = buscar(relatorioId);
			if(!relatorio.getStatusRelatorio().equals(StatusRelatorio.ABERTO)) {
				throw new NegocioException("relatório não pode ser finalizado");
			}
			relatorio.setDataFinalizacao(OffsetDateTime.now());
			relatorio.setStatusRelatorio(StatusRelatorio.FINALIZADO);
			relatorioRepository.save(relatorio);
			
	}

	private Relatorio buscar(Long relatorioId) {
		return relatorioRepository.findById(relatorioId).orElseThrow(() -> new NegocioException("Relatorio não encontrado"));
	}
}















