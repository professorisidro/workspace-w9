package br.com.meli.concessionaria.service;

import java.net.URL;

import br.com.meli.concessionaria.dto.VehicleDTO;
import br.com.meli.concessionaria.dto.VehicleDTOResponse;

public interface IVehicleService {
	
	public VehicleDTOResponse create(VehicleDTO novo);

}
