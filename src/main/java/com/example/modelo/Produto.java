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
@Table(name = "tb_produtos")

public class Produto {
	
	// Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nome;
		private int codigo;
		private double preco;
		
	//gets e sets
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

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		// Construtor
		public Produto(String nome, int codigo, double preco) {
			super();
			this.nome = nome;
			this.codigo = codigo;
			this.preco = preco;
		}

}
