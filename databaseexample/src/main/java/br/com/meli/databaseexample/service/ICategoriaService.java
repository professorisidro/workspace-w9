package br.com.meli.databaseexample.service;

import java.util.List;

import br.com.meli.databaseexample.model.Categoria;

public interface ICategoriaService {

	public Categoria save(Categoria categoria);
	public List<Categoria> findAll();
	public Categoria update(Categoria categoria);
	public Categoria findById(Integer id);
}
