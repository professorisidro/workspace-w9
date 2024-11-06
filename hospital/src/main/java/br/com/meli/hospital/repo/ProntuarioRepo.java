package br.com.meli.hospital.repo;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import br.com.meli.hospital.document.Prontuario;

public interface ProntuarioRepo extends ElasticsearchRepository<Prontuario, Integer> {
	public List<Prontuario> findByQueixaContaining(String key);

}
