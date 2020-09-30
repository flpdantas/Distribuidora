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
@Table(name = "tb_fornecedores")

public class Fornecedor {
	
	// Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nome;
		private String cnpj;
		private String email;
		private String telefone;
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		// Construtor
		public Fornecedor(String nome, String cnpj, String email, String telefone) {
			super();
			this.nome = nome;
			this.cnpj = cnpj;
			this.email = email;
			this.telefone = telefone;
		}

}