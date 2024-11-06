package br.com.meli.databaseexample.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.meli.databaseexample.model.Categoria;
import br.com.meli.databaseexample.model.Miniserie;

public interface MiniserieRepo extends CrudRepository<Miniserie, Integer>{
	public List<Miniserie> findByOrderByNameAsc();
	public List<Miniserie> findByOrderByNameDesc();
	public List<Miniserie> findByOrderByRatingAsc();
	public List<Miniserie> findByOrderByRatingDesc();
	public List<Miniserie> findByOrderByAmountOfAwardsAsc();
	public List<Miniserie> findByOrderByAmountOfAwardsDesc();
	public List<Miniserie> findByOrderByRatingDescNameAsc();
	public List<Miniserie> findByCategoria(Categoria categoria);
	public List<Miniserie> findByCategoriaId(Integer id);
	public List<Miniserie> findByCategoriaNameContaining(String key);
	

}
