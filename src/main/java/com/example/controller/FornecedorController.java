/**
 * 
 */
package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Filipe Soares Dantas
 *
 */

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
	
	public String teste() {
		return "Controller de fornecedores funcionando";
	}
	
	

}
