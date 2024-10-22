package br.com.meli.socialtestenetwork.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.meli.socialtestenetwork.model.Seller;

@Repository
public class SellerRepo {
	
	private List<Seller> database;
	
	public SellerRepo() {
		this.database = List.of(new Seller(4567,"Seller1",5.0), new Seller(4568,"Seller2", 4.7));
	}

	public Seller findById(Integer id) {
		return this.database.stream().filter(s -> s.getUserId().equals(id)).findFirst().orElse(null);
	}
}
