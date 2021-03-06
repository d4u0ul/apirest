package com.polipfc.apirestese.api.exceptionhandler;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL) // quando for serializar em jason, só inclua campos não null 
public class Problema {

	
		private Integer status;
		private OffsetDateTime dataHora;
		private String titulo;
		private List<Campo> campos;
		
		public static class Campo{
			private String nome;
			private String menssagem;
			
			
			public Campo(String nome, String menssagem) {
				super();
				this.nome = nome;
				this.menssagem = menssagem;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getMenssagem() {
				return menssagem;
			}
			public void setMenssagem(String menssagem) {
				this.menssagem = menssagem;
			}
			
			
		}
		
		
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public OffsetDateTime getDataHora() {
			return dataHora;
		}
		public void setDataHora(OffsetDateTime dataHora) {
			this.dataHora = dataHora;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public List<Campo> getCampos() {
			return campos;
		}
		public void setCampos(List<Campo> campos) {
			this.campos = campos;
		}
		
}
