package br.com.meli.praticadeesportes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.praticadeesportes.dto.EsporteDTO;
import br.com.meli.praticadeesportes.dto.PessoaDTO;
import br.com.meli.praticadeesportes.service.InterfaceService;

@RestController
public class MyController {
	
	@Autowired
	private InterfaceService service;

	
	@GetMapping("/findSports/{name}")
	public ResponseEntity<?> findNivelByName(@PathVariable String name){
		EsporteDTO e = service.getNivelEsporte(name);
		if (e != null) {
			return ResponseEntity.ok(e);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/findPersons")
	public ResponseEntity<?> findPersons(){
		List<PessoaDTO> esportistas = service.recuperarEsportistas();
		if (esportistas.size() > 0) {
			return ResponseEntity.ok(esportistas);
		}
		return ResponseEntity.notFound().build();
	}
}
