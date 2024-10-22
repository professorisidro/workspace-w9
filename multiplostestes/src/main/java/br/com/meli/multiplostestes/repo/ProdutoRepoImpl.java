package br.com.meli.multiplostestes.repo;

import java.io.File;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.multiplostestes.model.Produto;

@Repository
public class ProdutoRepoImpl implements IProdutoRepo{

	private List<Produto> database;
	
	public ProdutoRepoImpl() {
		try {
			File f = ResourceUtils.getFile("classpath:produtos.json");
			ObjectMapper mapper = new ObjectMapper();
			database = mapper.readValue(f, new TypeReference<List<Produto>>() {});
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public List<Produto> findAll() {
		// TODO Auto-generated method stub
		return database;
	}

	@Override
	public Produto save(Produto produto) {
		// TODO Auto-generated method stub
		if (this.findById(produto.getId()) != null){
			return null;
		}
		database.add(produto);
		return produto;
	}

	@Override
	public Produto findById(Integer id) {
		// TODO Auto-generated method stub
		return database.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
	}

}
