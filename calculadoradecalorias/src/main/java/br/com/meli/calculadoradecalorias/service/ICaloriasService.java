package br.com.meli.calculadoradecalorias.service;

import br.com.meli.calculadoradecalorias.dto.PratoRequestDTO;
import br.com.meli.calculadoradecalorias.dto.PratoResponseDTO;

public interface ICaloriasService {
	
	public PratoResponseDTO calcularCaloriasDeUmPrato(PratoRequestDTO prato);

}
