package com.polipfc.apirestese.api.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.polipfc.apirestese.domain.model.Comentario;
import com.polipfc.apirestese.domain.model.Conclusao;
import com.polipfc.apirestese.domain.model.Desenvolvimento;
import com.polipfc.apirestese.domain.model.Introducao;
import com.polipfc.apirestese.domain.model.Relatorio;
import com.polipfc.apirestese.domain.model.StatusRelatorio;

public class RelatorioRepresentationModel {
	
	public Long id;
	private Introducao introducao;
	private Desenvolvimento desenvolvimento;
	private Conclusao conclusao;
	private String descricao;
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
		result = prime * result + ((conclusao == null) ? 0 : conclusao.hashCode());
		result = prime * result + ((desenvolvimento == null) ? 0 : desenvolvimento.hashCode());
		result = prime * result + ((introducao == null) ? 0 : introducao.hashCode());
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
		RelatorioRepresentationModel other = (RelatorioRepresentationModel) obj;
		if (conclusao == null) {
			if (other.conclusao != null)
				return false;
		} else if (!conclusao.equals(other.conclusao))
			return false;
		if (desenvolvimento == null) {
			if (other.desenvolvimento != null)
				return false;
		} else if (!desenvolvimento.equals(other.desenvolvimento))
			return false;
		if (introducao == null) {
			if (other.introducao != null)
				return false;
		} else if (!introducao.equals(other.introducao))
			return false;
		return true;
	}

	
	
	
	
	
	
}
