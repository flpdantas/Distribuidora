/**
 * 
 */
package com.example.distribuidora.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Filipe Soares Dantas
 *
 */

@Data
@Entity
@Table(name = "tb_contatos")
public class Contato {
	
	// Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String email;
		private String telefone;
		
		@ManyToOne
		private Fornecedor fornecedor;

		@ManyToOne
		private Cliente cliente;

		// Gets e Sets
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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


}
