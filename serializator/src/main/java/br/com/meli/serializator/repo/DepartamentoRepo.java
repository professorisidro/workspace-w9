package br.com.meli.serializator.repo;

import java.io.File;
import java.util.List;

import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.serializator.model.Departamento;
import br.com.meli.serializator.model.Produto;

public class DepartamentoRepo {

private List<Departamento> database;
	
	public DepartamentoRepo() {
		System.out.println("INICIALIZANDO REPO");
		try {
			ObjectMapper mapper = new ObjectMapper();
			File f = ResourceUtils.getFile("classpath:departamentos.json");
			this.database = mapper.readValue(f, new TypeReference<List<Departamento>>() { });
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public List<Departamento> findAll(){
		return this.database;
	}
}
