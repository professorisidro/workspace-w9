package br.com.meli.serializator.service;

import java.util.List;
import java.util.function.Function;

import org.springframework.stereotype.Service;

import br.com.meli.serializator.dto.DepartamentoDTO;
import br.com.meli.serializator.dto.ProdutoDTO;
import br.com.meli.serializator.model.Departamento;
import br.com.meli.serializator.model.Produto;
import br.com.meli.serializator.repo.DepartamentoRepo;
import br.com.meli.serializator.repo.ProdutoRepo;

@Service
public class ProdutoService {
	private ProdutoRepo repo = new ProdutoRepo();
	private DepartamentoRepo dpRepo = new DepartamentoRepo();
	
	public ProdutoService() {
		repo.findAll().forEach(p -> System.out.println(p));
		dpRepo.findAll().forEach(d -> System.out.println(d));
		
		
		
		List<ProdutoDTO> produtos = 
				repo.findAll().stream()
				.map(p -> fromProdutoToDTO(p))
				.toList();
				
		System.out.println("Tudo convertido!!!");
		produtos.forEach(p-> System.out.println(p));
		
	
				
	}
	

	
	private ProdutoDTO fromProdutoToDTO(Produto p) {
		List<DepartamentoDTO> deptos = p.getDepartamentos().stream()
							  .map(id -> dpRepo.findAll().stream().filter(d -> d.getIdDepto().equals(id)).findFirst().get())
							  .map(d -> fromDeptoToDTO(d))
				              .toList();
		
		return new ProdutoDTO(p.getIdProduto(), p.getNome(), p.getPreco(), deptos);
	}
	private DepartamentoDTO fromDeptoToDTO(Departamento d) {
		return new DepartamentoDTO(d.getIdDepto(), d.getNome());
	}
}
