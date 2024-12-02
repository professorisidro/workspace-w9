package br.com.meli.exemplocache.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.meli.exemplocache.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{

}
