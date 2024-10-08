package br.com.meli.calculadoradecalorias.repo;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.calculadoradecalorias.model.Ingredient;

@Repository
public class IngredientRepoImpl implements IngredientRepo{
	
	private List<Ingredient> database;
	
	public IngredientRepoImpl() {
		loadDatabase();
	}
	
	
	@Override
	public Ingredient findByName(String name) {
		return this.database.stream().filter( i -> i.getName().equals(name)).findFirst().orElse(null);
	}
	
	
	
	private void loadDatabase() {
		try {
			File file = ResourceUtils.getFile("classpath:food.json");
			ObjectMapper objectMapper = new ObjectMapper();
			TypeReference<List<Ingredient>> ref = new TypeReference<>() {};
			database = objectMapper.readValue(file, ref);			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
