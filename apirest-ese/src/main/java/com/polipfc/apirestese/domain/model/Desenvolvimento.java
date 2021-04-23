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
	@Column(name="intro_demonstracaoproblema")
	private String introDemonstracaoProblema;
	@NotBlank
	@Column(name="intro_objetivopesquisa")
	private String introObjetivoPesquisa;
	@NotBlank
	@Column(name="intro_contexto")
	private String introContexto;
	@NotBlank
	@Column(name="hist_tecnologiasobinvestigacao")
	private String histTecnologiaSobInvestigacao;
	@NotBlank
	@Column(name="hist_tecnologiasalternativas")
	private String histTecnologiasAlternativas;
	@NotBlank
	@Column(name="hist_estudosrelacionados")
	private String histEstudosRelacionados;
	@NotBlank
	@Column(name="hist_relavanciapratica")
	private String histRelavanciaPratica;
	@NotBlank
	@Column(name="planexp_objetivos")
	private String planExpObjetivos;
	@NotBlank
	@Column(name="planexp_unidadesexperimentais")
	private String planExpUnidadesExperimentais;
	@NotBlank
	@Column(name="planexp_materialexperimento")
	private String planExpMaterialExperimento;
	@NotBlank
	@Column(name="planexp_tarefas")
	private String planExpTarefas;
	@NotBlank
	@Column(name="planexp_hipoparamvariaveis")
	private String planExpHipotParamVariaveis;
	@NotBlank
	@Column(name="planexp_design")
	private String planExpDesign;
	@NotBlank
	@Column(name="planexp_procedimentos")
	private String planExpProcedimentos;
	@NotBlank
	@Column(name="planexp_analiseprocedimentos")
	private String planExpAnaliseProcedimentos;
	
	
	
	
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
	public String getIntroDemonstracaoProblema() {
		return introDemonstracaoProblema;
	}
	public void setIntroDemonstracaoProblema(String introDemonstracaoProblema) {
		this.introDemonstracaoProblema = introDemonstracaoProblema;
	}
	public String getIntroObjetivoPesquisa() {
		return introObjetivoPesquisa;
	}
	public void setIntroObjetivoPesquisa(String introObjetivoPesquisa) {
		this.introObjetivoPesquisa = introObjetivoPesquisa;
	}
	public String getIntroContexto() {
		return introContexto;
	}
	public void setIntroContexto(String introContexto) {
		this.introContexto = introContexto;
	}
	public String getHistTecnologiaSobInvestigacao() {
		return histTecnologiaSobInvestigacao;
	}
	public void setHistTecnologiaSobInvestigacao(String histTecnologiaSobInvestigacao) {
		this.histTecnologiaSobInvestigacao = histTecnologiaSobInvestigacao;
	}
	public String getHistTecnologiasAlternativas() {
		return histTecnologiasAlternativas;
	}
	public void setHistTecnologiasAlternativas(String histTecnologiasAlternativas) {
		this.histTecnologiasAlternativas = histTecnologiasAlternativas;
	}
	public String getHistEstudosRelacionados() {
		return histEstudosRelacionados;
	}
	public void setHistEstudosRelacionados(String histEstudosRelacionados) {
		this.histEstudosRelacionados = histEstudosRelacionados;
	}
	public String getHistRelavanciaPratica() {
		return histRelavanciaPratica;
	}
	public void setHistRelavanciaPratica(String histRelavanciaPratica) {
		this.histRelavanciaPratica = histRelavanciaPratica;
	}
	public String getPlanExpObjetivos() {
		return planExpObjetivos;
	}
	public void setPlanExpObjetivos(String planExpObjetivos) {
		this.planExpObjetivos = planExpObjetivos;
	}
	public String getPlanExpUnidadesExperimentais() {
		return planExpUnidadesExperimentais;
	}
	public void setPlanExpUnidadesExperimentais(String planExpUnidadesExperimentais) {
		this.planExpUnidadesExperimentais = planExpUnidadesExperimentais;
	}
	public String getPlanExpMaterialExperimento() {
		return planExpMaterialExperimento;
	}
	public void setPlanExpMaterialExperimento(String planExpMaterialExperimento) {
		this.planExpMaterialExperimento = planExpMaterialExperimento;
	}
	public String getPlanExpTarefas() {
		return planExpTarefas;
	}
	public void setPlanExpTarefas(String planExpTarefas) {
		this.planExpTarefas = planExpTarefas;
	}
	public String getPlanExpHipotParamVariaveis() {
		return planExpHipotParamVariaveis;
	}
	public void setPlanExpHipotParamVariaveis(String planExpHipotParamVariaveis) {
		this.planExpHipotParamVariaveis = planExpHipotParamVariaveis;
	}
	public String getPlanExpDesign() {
		return planExpDesign;
	}
	public void setPlanExpDesign(String planExpDesign) {
		this.planExpDesign = planExpDesign;
	}
	public String getPlanExpProcedimentos() {
		return planExpProcedimentos;
	}
	public void setPlanExpProcedimentos(String planExpProcedimentos) {
		this.planExpProcedimentos = planExpProcedimentos;
	}
	public String getPlanExpAnaliseProcedimentos() {
		return planExpAnaliseProcedimentos;
	}
	public void setPlanExpAnaliseProcedimentos(String planExpAnaliseProcedimentos) {
		this.planExpAnaliseProcedimentos = planExpAnaliseProcedimentos;
	}


	
}
