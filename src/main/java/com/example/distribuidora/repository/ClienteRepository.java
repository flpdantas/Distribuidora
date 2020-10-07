/**
 * 
 */
package com.example.distribuidora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.distribuidora.modelo.Cliente;

/**
 * @author Filipe Soares Dantas
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}