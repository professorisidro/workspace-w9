package br.com.meli.calculadoradecalorias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.calculadoradecalorias.dto.PratoRequestDTO;
import br.com.meli.calculadoradecalorias.dto.PratoResponseDTO;
import br.com.meli.calculadoradecalorias.service.ICaloriasService;

@RestController
public class PratoController {
	
	@Autowired
	private ICaloriasService service;
	
	
	@PostMapping("/dish")
	public PratoResponseDTO calcularCalorias(@RequestBody PratoRequestDTO prato) {
		return service.calcularCaloriasDeUmPrato(prato);
	}

}
