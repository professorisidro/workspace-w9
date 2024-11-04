package br.com.meli.serializator.service;

import br.com.meli.serializator.model.Produto;

public class ProdutoUtil {
	public static Produto createProduto() {
		return new Produto(1,"Computador", 15600.0);
	}
}
