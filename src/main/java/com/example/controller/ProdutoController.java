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
@RequestMapping("/produtos")
public class ProdutoController {
	
	public String teste() {
		return "Controller de produtos funcionando";
	}

}
