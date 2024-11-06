package br.com.meli.databaseexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.databaseexample.exceptions.NotFoundException;
import br.com.meli.databaseexample.model.Categoria;
import br.com.meli.databaseexample.model.Miniserie;
import br.com.meli.databaseexample.repo.MiniserieRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Service
public class MiniserieServiceImpl implements IMiniserieService {

	private MiniserieRepo repo;
	
	@Autowired
	private EntityManager manager;

	public MiniserieServiceImpl(MiniserieRepo repo) {
		this.repo = repo;
	}

	@Override
	public Miniserie save(Miniserie miniserie) {
		return repo.save(miniserie);
	}

	@Override
	public Miniserie update(Miniserie miniserie) {
		return repo.save(miniserie);
	}

	@Override
	public Miniserie findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(() -> new NotFoundException("Minserie nao econtrada"));
	}

	@Override
	public List<Miniserie> findAll() {
		// TODO Auto-generated method stub
		return (List<Miniserie>) repo.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<Miniserie> findSorted(String field, String sortingCriteria) {
		// TODO Auto-generated method stub
		if (field.equalsIgnoreCase("name") && sortingCriteria.equalsIgnoreCase("a")) 
			return repo.findByOrderByNameAsc();		
		else if (field.equalsIgnoreCase("name") && sortingCriteria.equalsIgnoreCase("d"))
			return repo.findByOrderByNameDesc();
		else if (field.equalsIgnoreCase("rating") && sortingCriteria.equalsIgnoreCase("a")) 
			return repo.findByOrderByRatingAsc();		
		else if (field.equalsIgnoreCase("rating") && sortingCriteria.equalsIgnoreCase("d")) 
			return repo.findByOrderByRatingDesc();
		else if (field.equalsIgnoreCase("amount") && sortingCriteria.equalsIgnoreCase("a")) 
			return repo.findByOrderByAmountOfAwardsAsc();		
		else if (field.equalsIgnoreCase("amount") && sortingCriteria.equalsIgnoreCase("d")) 
			return repo.findByOrderByAmountOfAwardsDesc();		
		else 
			return repo.findByOrderByRatingDescNameAsc();
//			return (List<Miniserie>)repo.findAll();
	}

	
	public List<Miniserie> customSort(String field[], String sort[]){
		String sql = "Select m FROM Miniserie m ORDER BY ";
		for (int i=0; i<field.length-1; i++) {
			sql += field[i] + " " + sort[i] + ",";
		}
		sql += field[field.length-1] + " "+ sort[sort.length - 1];
		System.out.println("SQL = "+sql);
		TypedQuery<Miniserie> query = manager.createQuery(sql, Miniserie.class);
		return query.getResultList();
	}

	@Override
	public List<Miniserie> findByCategoria(Integer idCategoria) {
		// TODO Auto-generated method stub
//		Categoria categoria = new Categoria();
//		categoria.setId(idCategoria);
//		return repo.findByCategoria(categoria);
		return repo.findByCategoriaId(idCategoria);
	}
}
