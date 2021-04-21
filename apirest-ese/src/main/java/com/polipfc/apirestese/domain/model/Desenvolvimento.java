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
	private String introducao;
	@NotBlank
	private String historico;
	@NotBlank
	@Column(name="planejamento")
	private String planejamentoDoExperimento;
	
	
	
	
	
	
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
	public String getIntroducao() {
		return introducao;
	}
	public void setIntroducao(String introducao) {
		this.introducao = introducao;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public String getPlanejamentoDoExperimento() {
		return planejamentoDoExperimento;
	}
	public void setPlanejamentoDoExperimento(String planejamentoDoExperimento) {
		this.planejamentoDoExperimento = planejamentoDoExperimento;
	}

	
}
