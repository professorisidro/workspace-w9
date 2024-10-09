package br.com.meli.concessionaria.repo;

import br.com.meli.concessionaria.model.Vehicle;

public interface IVehicleRepo {
	public Vehicle save(Vehicle v);
	public Iterable<Vehicle> findAll();
	public Vehicle findById(Integer id);
}
