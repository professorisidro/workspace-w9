package br.com.meli.multiplostestes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.multiplostestes.model.Produto;
import br.com.meli.multiplostestes.repo.IProdutoRepo;

@Service
public class ProdutoServiceImpl implements IProdutoService{

	@Autowired
	private IProdutoRepo repo;
	
	@Override
	public List<Produto> recuperarTodos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Produto recuperarPeloId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Produto cadastrar(Produto novo) {
		System.out.println("Estou no servico: "+novo);
		// TODO Auto-generated method stub
		return repo.save(novo);
	}

}
