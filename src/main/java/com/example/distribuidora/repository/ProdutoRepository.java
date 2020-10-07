/**
 * 
 */
package com.example.distribuidora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.distribuidora.modelo.Produto;

/**
 * @author Filipe Soares Dantas
 *
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
