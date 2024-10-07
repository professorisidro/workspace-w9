package br.com.meli.praticadeesportes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.praticadeesportes.dto.EsporteDTO;
import br.com.meli.praticadeesportes.dto.PessoaDTO;
import br.com.meli.praticadeesportes.model.Esporte;
import br.com.meli.praticadeesportes.model.Pessoa;
import br.com.meli.praticadeesportes.repo.MyRepository;

@Service
public class ServiceImpl implements InterfaceService{
	
	@Autowired
	private MyRepository repo;

	@Override
	public EsporteDTO getNivelEsporte(String nome) {
		// TODO Auto-generated method stub
		Pessoa pessoa =  repo.getAllPessoas().stream().filter(p -> p.getEsporte().getNome().equals(nome)).findFirst().orElse(null);
		if (pessoa != null) {
			Esporte esporte = pessoa.getEsporte(); 
			if (esporte != null) {
				return new EsporteDTO(esporte.getNivel());
			}
		}
		return null;
	}
	
	public List<PessoaDTO> recuperarEsportistas(){
		return repo.getAllPessoas().stream().map( p -> fromPessoaToDto(p)).toList();
	}

	
	private PessoaDTO fromPessoaToDto(Pessoa p) {
		return new PessoaDTO(p.getNome(), p.getSobrenome(), p.getEsporte().getNome());
	}
	
}
