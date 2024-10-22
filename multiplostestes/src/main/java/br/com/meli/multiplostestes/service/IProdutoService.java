package br.com.meli.multiplostestes.service;

import java.util.List;

import br.com.meli.multiplostestes.model.Produto;

public interface IProdutoService {
	public List<Produto> recuperarTodos();
	public Produto recuperarPeloId(Integer id);
	public Produto cadastrar(Produto novo);
}
