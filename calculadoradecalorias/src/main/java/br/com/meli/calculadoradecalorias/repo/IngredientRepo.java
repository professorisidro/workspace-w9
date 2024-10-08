package br.com.meli.calculadoradecalorias.repo;

import br.com.meli.calculadoradecalorias.model.Ingredient;

public interface IngredientRepo {
	public Ingredient findByName(String name);

}
