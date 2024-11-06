package br.com.meli.databaseexample.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.meli.databaseexample.model.Categoria;

public interface CategoriaRepo extends CrudRepository<Categoria, Integer>{

}
