package com.polipfc.apirestese.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Conclusao {

	@Id
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
	private String discussao;
	@NotBlank
	@Column(name="conclusoes_trab_fut")
	private String conclusõesEtrabalhosFuturos ;
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
	public String getDiscussão() {
		return discussao;
	}
	public void setDiscussão(String discussão) {
		this.discussao = discussão;
	}
	public String getConclusõesEtrabalhosFuturos() {
		return conclusõesEtrabalhosFuturos;
	}
	public void setConclusõesEtrabalhosFuturos(String conclusõesEtrabalhosFuturos) {
		this.conclusõesEtrabalhosFuturos = conclusõesEtrabalhosFuturos;
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
