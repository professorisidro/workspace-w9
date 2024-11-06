package br.com.meli.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.hospital.model.Paciente;
import br.com.meli.hospital.service.IPacienteService;

@RestController
public class PacienteController {
	@Autowired
	private IPacienteService service;
	
	@PostMapping("/pacientes")
	public ResponseEntity<Paciente> save(@RequestBody Paciente paciente){
		return ResponseEntity.status(201).body(service.save(paciente));
	}
	
	@GetMapping("/pacientes")
	public ResponseEntity<List<Paciente>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	@GetMapping("/pacientes/{id}")
	public ResponseEntity<Paciente> findById(@PathVariable Integer id){
		return ResponseEntity.ok(service.findById(id));
	}

}
