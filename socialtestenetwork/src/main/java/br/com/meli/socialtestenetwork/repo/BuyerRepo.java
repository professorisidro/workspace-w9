package br.com.meli.socialtestenetwork.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.meli.socialtestenetwork.model.Buyer;

@Repository
public class BuyerRepo {
	
	private List<Buyer> database;
	
	public BuyerRepo() {
		this.database = List.of(new Buyer(1234,"Isidro"),new Buyer(1235,"Jose"));
	}
	
	public Buyer findById(Integer id) {
		return database.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
	}

}
