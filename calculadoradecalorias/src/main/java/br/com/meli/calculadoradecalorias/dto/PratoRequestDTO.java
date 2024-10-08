package br.com.meli.calculadoradecalorias.dto;

import java.util.List;

import br.com.meli.calculadoradecalorias.model.Ingredient;

public record PratoRequestDTO(String nome, List<Ingredient> ingredientes) {

}
