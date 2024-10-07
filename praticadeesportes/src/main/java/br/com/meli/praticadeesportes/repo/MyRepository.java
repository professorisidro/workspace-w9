package br.com.meli.praticadeesportes.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.meli.praticadeesportes.model.Esporte;
import br.com.meli.praticadeesportes.model.Pessoa;

@Repository
public class MyRepository {
	
	private List<Pessoa> pessoas;

	
	public MyRepository() {
		pessoas = new ArrayList<Pessoa>();		
				
		pessoas.add(new Pessoa("Professor", "isidro", 46, new Esporte("Futebol", "basico")));
		pessoas.add(new Pessoa("Israel","Campos", 22, new Esporte("Natacao", "avancado")));
		pessoas.add(new Pessoa("Gustavo","Breve", 33, new Esporte("Musculacao", "intermediario")));
	}

	public List<Pessoa> getAllPessoas(){
		return this.pessoas;
	}
	
}
