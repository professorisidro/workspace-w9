package br.com.meli.exemplocache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.exemplocache.model.Produto;
import br.com.meli.exemplocache.service.IProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	private IProdutoService service;
	
	@GetMapping("/produtos")
	public ResponseEntity<List<Produto>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Integer id){
		Produto res = service.findById(id);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/produtos")
	public ResponseEntity<Produto> save(@RequestBody Produto novo){
		return ResponseEntity.status(201).body(service.save(novo));
	}

}
