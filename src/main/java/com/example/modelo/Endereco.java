/**
 * 
 */
package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Filipe Soares Dantas
 *
 */

@Data
@Entity
@Table(name = "tb_enderecos")

public class Endereco {
	
	// Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String rua;
		private String bairro;
		private String cidade;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		
		// Construtor
		public Endereco(String rua, String bairro, String cidade) {
			super();
			this.rua = rua;
			this.bairro = bairro;
			this.cidade = cidade;
		}

}
