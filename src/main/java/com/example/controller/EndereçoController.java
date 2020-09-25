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
@RequestMapping("/enderecos")
public class EndereçoController {
	
	public String teste() {
		return "Controller de enderecos funcionando";
	}

}
