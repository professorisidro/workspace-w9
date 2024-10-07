package br.com.meli.praticadeesportes.service;

import java.util.List;

import br.com.meli.praticadeesportes.dto.EsporteDTO;
import br.com.meli.praticadeesportes.dto.PessoaDTO;

public interface InterfaceService {
	
	public EsporteDTO getNivelEsporte(String nome);
	public List<PessoaDTO> recuperarEsportistas();
	

}
