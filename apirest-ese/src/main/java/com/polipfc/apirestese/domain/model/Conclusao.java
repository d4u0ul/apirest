package com.polipfc.apirestese.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Conclusao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="desvios_planejamento")
	private String desviosDoPlanejamento ;
	private String  analises;
	private String discussão;
	@Column(name="conclusoes_trab_fut")
	private String conclusõesEtrabalhosFuturos ;
	private String contribuidores; 
	private String referencias;
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
		return discussão;
	}
	public void setDiscussão(String discussão) {
		this.discussão = discussão;
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
