/**
 * 
 */
package com.example.distribuidora.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.distribuidora.modelo.Cliente;
import com.example.distribuidora.repository.ClienteRepository;



/**
 * @author Filipe Soares Dantas
 *
 */

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	
	@PostMapping
	public Cliente salvarCliente(@RequestBody Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	
	@GetMapping
	public List<Cliente> listarCliente() {
		return this.clienteRepository.findAll();
	}
	
	
	@DeleteMapping("/{id}")
	public void deletarCliente (@PathVariable Long id) { 
		this.clienteRepository.deleteById(id);
	}
	
	
	@PutMapping("/{id}")
	public Cliente editarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
		Cliente clienteEditar = this.clienteRepository.findById(id).get();
		BeanUtils.copyProperties(cliente, clienteEditar, "id");
		this.clienteRepository.save(clienteEditar);
		return clienteEditar;
	}	


	

}
