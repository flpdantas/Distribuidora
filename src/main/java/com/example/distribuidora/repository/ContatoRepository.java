/**
 * 
 */
package com.example.distribuidora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.distribuidora.modelo.Contato;

/**
 * @author Filipe Soares Dantas
 *
 */
@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
