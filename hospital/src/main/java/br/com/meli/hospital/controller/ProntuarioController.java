package br.com.meli.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.hospital.document.Prontuario;
import br.com.meli.hospital.service.IProntuarioService;

@RestController
public class ProntuarioController {
	@Autowired
	private IProntuarioService service;
	
	@GetMapping("/prontuarios")
	public ResponseEntity<List<Prontuario>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/prontuarios/{id}")
	public ResponseEntity<Prontuario> findById(@PathVariable Integer id){
		return ResponseEntity.ok(service.findById(id));
	}
	
	@GetMapping("/prontuarios/search")
	public ResponseEntity<List<Prontuario>> findByQueixa(@RequestParam(name = "k") String k){
		return ResponseEntity.ok(service.findByQueixa(k));
	}
	
	@PostMapping("/prontuarios")
	public ResponseEntity<Prontuario> save(@RequestBody Prontuario prontuario){
		return ResponseEntity.status(201).body(service.save(prontuario));
	}
}
