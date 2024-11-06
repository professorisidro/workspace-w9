package br.com.meli.databaseexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.databaseexample.exceptions.NotFoundException;
import br.com.meli.databaseexample.model.Categoria;
import br.com.meli.databaseexample.repo.CategoriaRepo;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
	
	@Autowired
	private CategoriaRepo repo;

	@Override
	public Categoria save(Categoria categoria) {
		// TODO Auto-generated method stub
		return repo.save(categoria);
	}

	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>)repo.findAll();
	}

	@Override
	public Categoria update(Categoria categoria) {
		// TODO Auto-generated method stub
		return repo.save(categoria);
	}

	@Override
	public Categoria findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(() -> new NotFoundException("Categoria inexistente"));
	}
}
