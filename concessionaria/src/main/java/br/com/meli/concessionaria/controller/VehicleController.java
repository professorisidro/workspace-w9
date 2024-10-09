package br.com.meli.concessionaria.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.concessionaria.dto.VehicleDTO;
import br.com.meli.concessionaria.dto.VehicleDTOResponse;
import br.com.meli.concessionaria.service.IVehicleService;

@RestController
@RequestMapping("/v1/api")
public class VehicleController {
	
	@Autowired
	private IVehicleService service;
	
	
	@PostMapping("/vehicles")
	public ResponseEntity<?> addNewVehicle(@RequestBody VehicleDTO novo) throws Exception{
		VehicleDTOResponse dto = service.create(novo);
		return ResponseEntity.created(new URI(dto.url())).body(dto);
		
	}

}
