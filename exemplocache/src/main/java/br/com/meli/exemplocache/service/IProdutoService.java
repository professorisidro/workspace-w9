package br.com.meli.exemplocache.service;

import java.util.List;

import br.com.meli.exemplocache.model.Produto;

public interface IProdutoService {
	public Produto save(Produto p);
	public Produto findById(Integer id);
	public List<Produto> findAll();

}
