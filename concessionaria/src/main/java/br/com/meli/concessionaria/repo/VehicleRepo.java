package br.com.meli.concessionaria.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.meli.concessionaria.model.Vehicle;

@Repository
public class VehicleRepo implements IVehicleRepo{

	private List<Vehicle> database;
	
	public VehicleRepo() {
		System.out.println("DEBUG - Initializing Vehicle Database");
		database = new ArrayList<Vehicle>();
	}

	@Override
	public Vehicle save(Vehicle v) {
		// TODO Auto-generated method stub
		v.setId(database.size()+1);
		database.add(v);
		return v;
	}

	@Override
	public Iterable<Vehicle> findAll() {
		// TODO Auto-generated method stub
		return database;
	}

	@Override
	public Vehicle findById(Integer id) {
		// TODO Auto-generated method stub
		return database.stream().filter(v -> v.getId()==id).findFirst().orElse(null);
	}
}
