package com.polipfc.apirestese.domain.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Relatorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	//podemos colocar a parametrização de join com @JoinColumn(name=cliente_id)  <--cliente_id é o padrão assumido por @onetoone ou seja classe_id esse relacionamento deve ser feito no bd
	@OneToOne
	private Introducao introducao;
	@OneToOne
	private Desenvolvimento desenvolvimento;
	@OneToOne
	private Conclusao conclusao;
	
	private String descricao;
	
	@Enumerated(EnumType.STRING) //especifica que queremos guardar no bd uma string, se não ele identifica como números 1,2,3...
	private StatusRelatorio statusRelatorio;
	private OffsetDateTime dataAbertura;
	private OffsetDateTime dataFinalizacao;
	//private List<Comentario> comentarios= new ArrayList<>();
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Introducao getIntroducao() {
		return introducao;
	}
	public void setIntroducao(Introducao introducao) {
		this.introducao = introducao;
	}
	public Desenvolvimento getDesenvolvimento() {
		return desenvolvimento;
	}
	public void setDesenvolvimento(Desenvolvimento desenvolvimento) {
		this.desenvolvimento = desenvolvimento;
	}
	public Conclusao getConclusao() {
		return conclusao;
	}
	public void setConclusao(Conclusao conclusao) {
		this.conclusao = conclusao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public StatusRelatorio getStatusRelatorio() {
		return statusRelatorio;
	}
	public void setStatusRelatorio(StatusRelatorio statusRelatorio) {
		this.statusRelatorio = statusRelatorio;
	}
	public OffsetDateTime getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(OffsetDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public OffsetDateTime getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(OffsetDateTime dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	//public List<Comentario> getComentarios() {
	//	return comentarios;
	//}
	//public void setComentarios(List<Comentario> comentarios) {
	//	this.comentarios = comentarios;
	//}
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
		Relatorio other = (Relatorio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
