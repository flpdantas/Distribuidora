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

import com.example.distribuidora.modelo.Endereco;
import com.example.distribuidora.repository.EnderecoRepository;



/**
 * @author Filipe Soares Dantas
 *
 */

@RestController
@RequestMapping("/enderecos")
public class EndereçoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	@PostMapping
	public Endereco salvarEndereco(@RequestBody Endereco endereco) {
		return this.enderecoRepository.save(endereco);
	}

	@GetMapping
	public List<Endereco> listarEndereco() {
		return this.enderecoRepository.findAll();
	}

	@DeleteMapping("/{id}")
	public void deletarEndereco(@PathVariable Long id) {
		this.enderecoRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public Endereco editarEndereco(@PathVariable Long id, @RequestBody Endereco endereco) {
		Endereco enderecoEditar = this.enderecoRepository.findById(id).get();
		BeanUtils.copyProperties(endereco, enderecoEditar, "id");
		this.enderecoRepository.save(enderecoEditar);
		return enderecoEditar;
	}

}
