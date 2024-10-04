package br.com.meli.objects.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.objects.model.Produto;

@RestController
@RequestMapping("/api")
public class ProdutoController {
	
	@GetMapping("/produtos")
	public Produto getProduto() {
		Produto p = new Produto(12345,"Computador cheio das Luzinha", 2000.0);
		return p;
	}
	
	@PostMapping("/produtos")
	public String receberProduto(@RequestBody Produto p) {
		System.out.println(p);
		return "Ok";
	}
	
}
