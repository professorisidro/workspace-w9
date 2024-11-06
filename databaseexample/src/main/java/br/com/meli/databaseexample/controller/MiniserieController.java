package br.com.meli.databaseexample.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.databaseexample.model.Miniserie;
import br.com.meli.databaseexample.service.IMiniserieService;

@RestController
public class MiniserieController {
	private IMiniserieService service;
	
	public MiniserieController(IMiniserieService service) {
		this.service = service;
	}
	
	@GetMapping("/miniseries")
	public ResponseEntity<List<Miniserie>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/miniseries/{id}")
	public ResponseEntity<Miniserie> findById(@PathVariable Integer id){
		return ResponseEntity.ok(service.findById(id));
	}
	
	@PostMapping("/miniseries")
	public ResponseEntity<Miniserie> save(@RequestBody Miniserie miniserie){
		return ResponseEntity.status(201).body(service.save(miniserie));
	}
	
	@PutMapping("/miniseries")
	public ResponseEntity<Miniserie> update(@RequestBody Miniserie miniserie){		
		return ResponseEntity.ok(service.update(miniserie));
	}
	
	@DeleteMapping("/miniseries/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id){
		service.deleteById(id);
		return ResponseEntity.ok("Deleted!");
	}
	
	@GetMapping("/miniseries/sort")
	public ResponseEntity<List<Miniserie>> findAllSorted(@RequestParam(name = "f", defaultValue = "id") String f, 
			                                             @RequestParam(name = "s", defaultValue = "a") String s){
		return ResponseEntity.ok(service.findSorted(f, s));
	}
	
	@GetMapping("/miniseries/categoria/{idCategoria}")
	public ResponseEntity<List<Miniserie>> findByCategoria(@PathVariable Integer idCategoria){
		return ResponseEntity.ok(service.findByCategoria(idCategoria));
	}
	
	@GetMapping("/miniseries/search/custom")
	public ResponseEntity<List<Miniserie>> findCustom(){
		String fields[] = {"rating", "name"};
		String sorts[] = {"desc", "asc"};
		return ResponseEntity.ok(service.customSort(fields, sorts));
	}
	

}
