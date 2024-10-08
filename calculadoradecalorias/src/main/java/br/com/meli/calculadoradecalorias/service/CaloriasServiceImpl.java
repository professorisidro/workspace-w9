package br.com.meli.calculadoradecalorias.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.meli.calculadoradecalorias.dto.PratoRequestDTO;
import br.com.meli.calculadoradecalorias.dto.PratoResponseDTO;
import br.com.meli.calculadoradecalorias.model.Ingredient;
import br.com.meli.calculadoradecalorias.repo.IngredientRepo;

@Service
public class CaloriasServiceImpl implements ICaloriasService {

	private IngredientRepo repo;

	public CaloriasServiceImpl(IngredientRepo repo) {
		this.repo = repo;
	}

	@Override
	public PratoResponseDTO calcularCaloriasDeUmPrato(PratoRequestDTO prato) {
		// TODO Auto-generated method stub

		/*
		 * System.out.println("Ingredientes recebidos");
		 * System.out.println(prato.ingredientes());
		 * 
		 * 
		 * List<Ingredient> lista1 = prato.ingredientes().stream().map(ingPrato ->
		 * repo.findByName(ingPrato.getName())).toList();
		 * System.out.println("Ingredientes recuperados da base");
		 * System.out.println(lista1);
		 * 
		 * System.out.println("Isolando somente as calorias");
		 * lista1.stream().mapToInt(Ingredient::getCalories).forEach(d ->
		 * System.out.println(d));
		 */

		Integer calorias = prato.ingredientes().stream()
											   .map(ingPrato -> repo.findByName(ingPrato.getName()))
				                               .filter(ing -> ing != null)
				                               .mapToInt(Ingredient::getCalories)
				                               .sum();
		// System.out.println(lista);
		return new PratoResponseDTO(prato.nome(), calorias);
	}
}
