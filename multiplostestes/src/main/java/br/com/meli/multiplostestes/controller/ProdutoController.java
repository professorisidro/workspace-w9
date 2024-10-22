package br.com.meli.multiplostestes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.multiplostestes.model.Produto;
import br.com.meli.multiplostestes.service.IProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	private IProdutoService service;
	
	@GetMapping("/produtos")
	public ResponseEntity<List<Produto>> recuperarTodos(){
		return ResponseEntity.ok(service.recuperarTodos());
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> recuperarPeloId(@PathVariable Integer id){
		Produto p = service.recuperarPeloId(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/produtos")
	public ResponseEntity<Produto> cadastrar(@RequestBody Produto novo){
		Produto res = service.cadastrar(novo);
		if (res != null) {
			return ResponseEntity.status(201).body(res);
		}
		return ResponseEntity.badRequest().build();
	}

}
