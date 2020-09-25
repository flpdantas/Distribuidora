/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelo.Produto;

/**
 * @author Filipe Soares Dantas
 *
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
