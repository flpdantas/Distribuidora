/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelo.Endereco;

/**
 * @author Filipe Soares Dantas
 *
 */
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
