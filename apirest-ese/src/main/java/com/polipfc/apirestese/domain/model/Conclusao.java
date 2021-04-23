package com.polipfc.apirestese.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.polipfc.apirestese.domain.ValidationGroups;


@Entity
public class Conclusao {

	@Id
	@NotNull(groups = ValidationGroups.ConclusaoId.class)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@NotBlank
	@Column(name="desvios_planejamento")
	private String desviosDoPlanejamento ;
	@NotBlank
	private String  analises;
	@NotBlank
	@Column(name="disc_avaliacao_res_imp")
	private String discussaoAvaliacaoDosResultadosEImplicacoes;
	@NotBlank
	@Column(name="disc_ameacas_validacao")
	private String discussaoAmeacasDeValidacao;
	@NotBlank
	@Column(name="disc_inferencias")
	private String discussaoInferencias;
	@NotBlank
	@Column(name="conclusoes_resumo")
	private String conclusoesResumo ;
	@NotBlank
	@Column(name="conclusoes_impacto")
	private String conclusoesImpacto;
	@Column(name="conclusoes_trab_fut")
	@NotBlank
	private String conclusoesTrabalhosFuturos;
	@NotBlank
	private String contribuidores; 
	@NotBlank
	private String referencias;
	@NotBlank
	private String apendices ;

	
	public String getDesviosDoPlanejamento() {
		return desviosDoPlanejamento;
	}
	public void setDesviosDoPlanejamento(String desviosDoPlanejamento) {
		this.desviosDoPlanejamento = desviosDoPlanejamento;
	}
	public String getAnalises() {
		return analises;
	}
	public void setAnalises(String analises) {
		this.analises = analises;
	}
	
	
	public String getDiscussaoAvaliacaoDosResultadosEImplicacoes() {
		return discussaoAvaliacaoDosResultadosEImplicacoes;
	}
	public void setDiscussaoAvaliacaoDosResultadosEImplicacoes(String discussaoAvaliacaoDosResultadosEImplicacoes) {
		this.discussaoAvaliacaoDosResultadosEImplicacoes = discussaoAvaliacaoDosResultadosEImplicacoes;
	}
	public String getDiscussaoAmeacasDeValidacao() {
		return discussaoAmeacasDeValidacao;
	}
	public void setDiscussaoAmeacasDeValidacao(String discussaoAmeacasDeValidacao) {
		this.discussaoAmeacasDeValidacao = discussaoAmeacasDeValidacao;
	}
	public String getDiscussaoInferencias() {
		return discussaoInferencias;
	}
	public void setDiscussaoInferencias(String discussaoInferencias) {
		this.discussaoInferencias = discussaoInferencias;
	}
	public String getConclusoesResumo() {
		return conclusoesResumo;
	}
	public void setConclusoesResumo(String conclusoesResumo) {
		this.conclusoesResumo = conclusoesResumo;
	}
	public String getConclusoesImpacto() {
		return conclusoesImpacto;
	}
	public void setConclusoesImpacto(String conclusoesImpacto) {
		this.conclusoesImpacto = conclusoesImpacto;
	}
	public String getConclusoesTrabalhosFuturos() {
		return conclusoesTrabalhosFuturos;
	}
	public void setConclusoesTrabalhosFuturos(String conclusoesTrabalhosFuturos) {
		this.conclusoesTrabalhosFuturos = conclusoesTrabalhosFuturos;
	}
	public String getContribuidores() {
		return contribuidores;
	}
	public void setContribuidores(String contribuidores) {
		this.contribuidores = contribuidores;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public String getApendices() {
		return apendices;
	}
	public void setApendices(String apendices) {
		this.apendices = apendices;
	}

}
