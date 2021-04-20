package com.polipfc.apirestese.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Introducao {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(max=150)
	private String titulo;
	@NotBlank
	private String autoria;
	@Column(name="resumo_estruturado")
	@NotBlank
	private String resumoEstruturado;
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
	public String getResumoEstruturado() {
		return resumoEstruturado;
	}
	public void setResumoEstruturado(String resumoEstruturado) {
		this.resumoEstruturado = resumoEstruturado;
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
