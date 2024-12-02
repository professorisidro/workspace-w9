package br.com.meli.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.hospital.dto.ConsultasPorMesDTO;
import br.com.meli.hospital.repo.ConsultaRepo;

@RestController
public class ConsultaController {
	
	@Autowired	
	private ConsultaRepo repo;
	
	@GetMapping("/consultas/relatorio/{ano}")
	public List<ConsultasPorMesDTO> recuperarRelatorio(@PathVariable Integer ano){
		return repo.recuperarConsultasPorMes(ano);
	}

}
