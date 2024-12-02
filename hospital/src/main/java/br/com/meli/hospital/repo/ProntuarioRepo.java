package br.com.meli.hospital.repo;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;

import br.com.meli.hospital.document.Prontuario;

public interface ProntuarioRepo extends ElasticsearchRepository<Prontuario, Integer> {
	public List<Prontuario> findByQueixaContaining(String key);
	
	@Query("{\r\n"		
			+ "      \"bool\": {\r\n"
			+ "          \"should\": [\r\n"
			+ "              { \"match\": {\"queixa\": \":key\" } },\r\n"
			+ "              { \"match\": {\"diagnostico\": \":key\" } },\r\n"
			+ "              { \"match\": {\"condutaMedica\": \":key\" } },\r\n"
			+ "              { \"match\": {\"prescricao\": \":key\" } }\r\n"
			+ "          ]\r\n"
			+ "      }\r\n"
			+ "  }")
	public List<Prontuario> realizarConsultacustomizada(@Param("key") String key);

}
