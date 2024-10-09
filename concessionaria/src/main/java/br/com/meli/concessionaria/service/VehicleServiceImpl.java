package br.com.meli.concessionaria.service;

import java.net.URI;
import java.time.LocalDate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.meli.concessionaria.dto.ServiceDTO;
import br.com.meli.concessionaria.dto.VehicleDTO;
import br.com.meli.concessionaria.dto.VehicleDTOResponse;
import br.com.meli.concessionaria.exceptions.CreateVehicleException;
import br.com.meli.concessionaria.model.Vehicle;
import br.com.meli.concessionaria.model.VehicleService;
import br.com.meli.concessionaria.repo.IVehicleRepo;

@Service
public class VehicleServiceImpl implements IVehicleService {

	IVehicleRepo repo;

	public VehicleServiceImpl(IVehicleRepo repo) {
		this.repo = repo;
	}

	@Override
	public VehicleDTOResponse create(VehicleDTO novo) {
		try {
			Vehicle v = repo.save(fromDTOToVehicle(novo));
			System.out.println("Inserido novo registro de ID = " + v.getId());
			return new VehicleDTOResponse("/v1/api/vehicles/" + v.getId());
		} catch (Exception ex) {
			throw new CreateVehicleException("Erro ao criar veiculo");
		}
	}

	private Vehicle fromDTOToVehicle(VehicleDTO dto) {
		Vehicle v = new Vehicle();
		v.setBrand(dto.brand());
		v.setCountOfOwners(Integer.parseInt(dto.countOfOwners()));
		v.setModel(dto.model());
		v.setCurrency(dto.currency());
		v.setDoors(Integer.parseInt(dto.doors()));
		v.setNumberOfKilometers(Integer.parseInt(dto.numberOfKilometers()));
		v.setPrice(Integer.parseInt(dto.price()));
		v.setServices(dto.services().stream().map(t -> fromVehicleServiceDTOToService(t)).collect(Collectors.toList()));
		v.setManufacturingDate(LocalDate.parse(dto.manufacturingDate()));
		return v;
	}

	private VehicleService fromVehicleServiceDTOToService(ServiceDTO dto) {
		VehicleService s = new VehicleService();
		s.setDate(LocalDate.parse(dto.date()));
		s.setDescription(dto.descriptions());
		s.setKilometers(Integer.parseInt(dto.kilometers()));
		return s;
	}

}
