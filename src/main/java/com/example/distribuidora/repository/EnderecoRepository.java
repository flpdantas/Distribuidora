/**
 * 
 */
package com.example.distribuidora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.distribuidora.modelo.Endereco;

/**
 * @author Filipe Soares Dantas
 *
 */
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
