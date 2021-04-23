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
public class Desenvolvimento {

	
	@Id
	@NotNull(groups = ValidationGroups.DesenvolvimentoId.class)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String intro_demonstracaoproblema;
	@NotBlank
	private String intro_objetivopesquisa;
	@NotBlank
	private String intro_contexto;
	@NotBlank
	private String hist_tecnologiasobinvestigacao;
	@NotBlank
	private String hist_tecnologiasalternativas;
	@NotBlank
	private String hist_estudosrelacionados;
	@NotBlank
	private String hist_relavanciapratica;
	@NotBlank
	@Column(name="planexp_objetivos")
	private String planexp_objetivos;
	@NotBlank
	private String planexp_unidadesexperimentais;
	@NotBlank
	private String planexp_materialexperimento;
	@NotBlank
	private String planexp_tarefas;
	@NotBlank
	private String planexp_hipoparamvariaveis;
	@NotBlank
	private String planexp_design;
	@NotBlank
	private String planexp_procedimentos;
	@NotBlank
	private String planexp_analiseprocedimentos;
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Desenvolvimento other = (Desenvolvimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIntro_demonstracaoproblema() {
		return intro_demonstracaoproblema;
	}
	public void setIntro_demonstracaoproblema(String intro_demonstracaoproblema) {
		this.intro_demonstracaoproblema = intro_demonstracaoproblema;
	}
	public String getIntro_objetivopesquisa() {
		return intro_objetivopesquisa;
	}
	public void setIntro_objetivopesquisa(String intro_objetivopesquisa) {
		this.intro_objetivopesquisa = intro_objetivopesquisa;
	}
	public String getIntro_contexto() {
		return intro_contexto;
	}
	public void setIntro_contexto(String intro_contexto) {
		this.intro_contexto = intro_contexto;
	}
	public String getHist_tecnologiasobinvestigacao() {
		return hist_tecnologiasobinvestigacao;
	}
	public void setHist_tecnologiasobinvestigacao(String hist_tecnologiasobinvestigacao) {
		this.hist_tecnologiasobinvestigacao = hist_tecnologiasobinvestigacao;
	}
	public String getHist_tecnologiasalternativas() {
		return hist_tecnologiasalternativas;
	}
	public void setHist_tecnologiasalternativas(String hist_tecnologiasalternativas) {
		this.hist_tecnologiasalternativas = hist_tecnologiasalternativas;
	}
	public String getHist_estudosrelacionados() {
		return hist_estudosrelacionados;
	}
	public void setHist_estudosrelacionados(String hist_estudosrelacionados) {
		this.hist_estudosrelacionados = hist_estudosrelacionados;
	}
	public String getHist_relavanciapratica() {
		return hist_relavanciapratica;
	}
	public void setHist_relavanciapratica(String hist_relavanciapratica) {
		this.hist_relavanciapratica = hist_relavanciapratica;
	}
	public String getPlanexp_objetivos() {
		return planexp_objetivos;
	}
	public void setPlanexp_objetivos(String planexp_objetivos) {
		this.planexp_objetivos = planexp_objetivos;
	}
	public String getPlanexp_unidadesexperimentais() {
		return planexp_unidadesexperimentais;
	}
	public void setPlanexp_unidadesexperimentais(String planexp_unidadesexperimentais) {
		this.planexp_unidadesexperimentais = planexp_unidadesexperimentais;
	}
	public String getPlanexp_materialexperimento() {
		return planexp_materialexperimento;
	}
	public void setPlanexp_materialexperimento(String planexp_materialexperimento) {
		this.planexp_materialexperimento = planexp_materialexperimento;
	}
	public String getPlanexp_tarefas() {
		return planexp_tarefas;
	}
	public void setPlanexp_tarefas(String planexp_tarefas) {
		this.planexp_tarefas = planexp_tarefas;
	}
	public String getPlanexp_hipoparamvariaveis() {
		return planexp_hipoparamvariaveis;
	}
	public void setPlanexp_hipoparamvariaveis(String planexp_hipoparamvariaveis) {
		this.planexp_hipoparamvariaveis = planexp_hipoparamvariaveis;
	}
	public String getPlanexp_design() {
		return planexp_design;
	}
	public void setPlanexp_design(String planexp_design) {
		this.planexp_design = planexp_design;
	}
	public String getPlanexp_procedimentos() {
		return planexp_procedimentos;
	}
	public void setPlanexp_procedimentos(String planexp_procedimentos) {
		this.planexp_procedimentos = planexp_procedimentos;
	}
	public String getPlanexp_analiseprocedimentos() {
		return planexp_analiseprocedimentos;
	}
	public void setPlanexp_analiseprocedimentos(String planexp_analiseprocedimentos) {
		this.planexp_analiseprocedimentos = planexp_analiseprocedimentos;
	}


	
}
