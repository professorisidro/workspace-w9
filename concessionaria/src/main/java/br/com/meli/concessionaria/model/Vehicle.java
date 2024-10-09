package br.com.meli.concessionaria.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {
	private Integer id;
	private String brand;
	private String model;
	private LocalDate manufacturingDate;
	private Integer numberOfKilometers;
	private Integer doors;
	private Integer price;
	private String  currency;
	private List<VehicleService> services;
	private Integer countOfOwners;
	public Vehicle() {
		super();
		services = new ArrayList<VehicleService>();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Integer getNumberOfKilometers() {
		return numberOfKilometers;
	}
	public void setNumberOfKilometers(Integer numberOfKilometers) {
		this.numberOfKilometers = numberOfKilometers;
	}
	public Integer getDoors() {
		return doors;
	}
	public void setDoors(Integer doors) {
		this.doors = doors;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<VehicleService> getServices() {
		return services;
	}
	public void setServices(List<VehicleService> services) {
		this.services = services;
	}
	public Integer getCountOfOwners() {
		return countOfOwners;
	}
	public void setCountOfOwners(Integer countOfOwners) {
		this.countOfOwners = countOfOwners;
	}
	

}
