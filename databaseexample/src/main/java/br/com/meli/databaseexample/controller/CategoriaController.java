package br.com.meli.databaseexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.databaseexample.model.Categoria;
import br.com.meli.databaseexample.service.ICategoriaService;

@RestController
public class CategoriaController {
	
	@Autowired
	private ICategoriaService service;
	
	@GetMapping("/categorias")
	public ResponseEntity<List<Categoria>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/categorias/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Integer id){
		return ResponseEntity.ok(service.findById(id));
	}
	
	@PostMapping("/categorias")
	public ResponseEntity<Categoria> save(@RequestBody Categoria categoria){
		return ResponseEntity.status(201).body(service.save(categoria));
	}

}
