package br.com.meli.exemplocache.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.exemplocache.caching.CacheService;
import br.com.meli.exemplocache.model.Produto;
import br.com.meli.exemplocache.repo.ProdutoRepo;

@Service
public class ProdutoServiceImpl implements IProdutoService{
	
	@Autowired
	private ProdutoRepo repo;

	@Override
	public Produto save(Produto p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Produto findById(Integer id) {
		// TODO Auto-generated method stub
		Produto p = repo.findById(id).orElse(null);
		if (p != null) {
			CacheService.cache.put("/produtos/"+id, p);
		}
		return p;
	}

	@Override
	public List<Produto> findAll() {
		// TODO Auto-generated method stub
		List<Produto> lista = (List<Produto>)repo.findAll();
		CacheService.cache.put("/produtos", lista);
		System.out.println("Inserido no cache!!!");
		return lista;
	}
	
	
}
