/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelo.Fornecedor;

/**
 * @author Filipe Soares Dantas
 *
 */
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
