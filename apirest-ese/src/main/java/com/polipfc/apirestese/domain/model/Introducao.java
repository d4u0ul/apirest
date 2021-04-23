package com.polipfc.apirestese.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.polipfc.apirestese.domain.ValidationGroups;

@Entity
public class Introducao {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@NotNull(groups = ValidationGroups.IntroducaoId.class)
	private Long id;
	@NotBlank
	@Size(max=150)
	private String titulo;
	@NotBlank
	private String autoria;
	@Column(name="resumoestruturado_background")
	@NotBlank
	private String resumoEstruturadoBackground;
	@Column(name="resumoestruturado_objetivosdapesquisa")
	@NotBlank
	private String resumoEstruturadoObjetivosDaPesquisa;
	@Column(name="resumoestruturado_metodosutilizados")
	@NotBlank
	private String resumoEstruturadoMetodosUtilzados;
	@Column(name="resumoestruturado_resultadosobtidos")
	@NotBlank
	private String resumoEstruturadoResultadosObtidos;
	@Column(name="resumoestruturado_limitacoesobservadas")
	@NotBlank
	private String resumoEstruturadoLimitacoesObservadas;
	@Column(name="resumoestruturado_conclusoes")
	@NotBlank
	private String resumoEstruturadoConclusoes;
	@Column(name="palavras_chave")
	@NotBlank
	private String palavrasChave; 
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutoria() {
		return autoria;
	}
	public void setAutoria(String autoria) {
		this.autoria = autoria;
	}

	public String getResumoEstruturadoBackground() {
		return resumoEstruturadoBackground;
	}
	public void setResumoEstruturadoBackground(String resumoEstruturadoBackground) {
		this.resumoEstruturadoBackground = resumoEstruturadoBackground;
	}
	public String getResumoEstruturadoObjetivosDaPesquisa() {
		return resumoEstruturadoObjetivosDaPesquisa;
	}
	public void setResumoEstruturadoObjetivosDaPesquisa(String resumoEstruturadoObjetivosDaPesquisa) {
		this.resumoEstruturadoObjetivosDaPesquisa = resumoEstruturadoObjetivosDaPesquisa;
	}
	public String getResumoEstruturadoMetodosUtilzados() {
		return resumoEstruturadoMetodosUtilzados;
	}
	public void setResumoEstruturadoMetodosUtilzados(String resumoEstruturadoMetodosUtilzados) {
		this.resumoEstruturadoMetodosUtilzados = resumoEstruturadoMetodosUtilzados;
	}
	public String getResumoEstruturadoResultadosObtidos() {
		return resumoEstruturadoResultadosObtidos;
	}
	public void setResumoEstruturadoResultadosObtidos(String resumoEstruturadoResultadosObtidos) {
		this.resumoEstruturadoResultadosObtidos = resumoEstruturadoResultadosObtidos;
	}
	public String getResumoEstruturadoLimitacoesObservadas() {
		return resumoEstruturadoLimitacoesObservadas;
	}
	public void setResumoEstruturadoLimitacoesObservadas(String resumoEstruturadoLimitacoesObservadas) {
		this.resumoEstruturadoLimitacoesObservadas = resumoEstruturadoLimitacoesObservadas;
	}
	public String getResumoEstruturadoConclusoes() {
		return resumoEstruturadoConclusoes;
	}
	public void setResumoEstruturadoConclusoes(String resumoEstruturadoConclusoes) {
		this.resumoEstruturadoConclusoes = resumoEstruturadoConclusoes;
	}
	public String getPalavrasChave() {
		return palavrasChave;
	}
	public void setPalavrasChave(String palavrasChave) {
		this.palavrasChave = palavrasChave;
	}
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
		Introducao other = (Introducao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
