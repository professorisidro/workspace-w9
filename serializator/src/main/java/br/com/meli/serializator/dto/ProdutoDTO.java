package br.com.meli.serializator.dto;

import java.util.List;

public record ProdutoDTO(Integer idProduto, String nome, Double preco, List<DepartamentoDTO> departamento) {

}
