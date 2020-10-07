/**
 * 
 */
package com.example.distribuidora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.distribuidora.modelo.Fornecedor;

/**
 * @author Filipe Soares Dantas
 *
 */
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
