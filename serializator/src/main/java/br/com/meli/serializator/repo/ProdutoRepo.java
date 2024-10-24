package br.com.meli.serializator.repo;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.serializator.model.Produto;


public class ProdutoRepo {
	
	private List<Produto> database;
	
	public ProdutoRepo() {
		System.out.println("INICIALIZANDO REPO");
		try {
			ObjectMapper mapper = new ObjectMapper();
			File f = ResourceUtils.getFile("classpath:produtos.json");
			this.database = mapper.readValue(f, new TypeReference<List<Produto>>() { });
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public List<Produto> findAll(){
		return this.database;
	}
}
