package br.com.meli.multiplostestes.repo;

import java.util.List;

import br.com.meli.multiplostestes.model.Produto;

public interface IProdutoRepo {
	
	public List<Produto> findAll();
	public Produto save(Produto produto);
	public Produto findById(Integer id);

}
