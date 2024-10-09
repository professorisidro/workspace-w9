package br.com.meli.concessionaria.model;

import java.time.LocalDate;

public class VehicleService {
	private LocalDate date;
	private Integer kilometers;
	private String description;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Integer getKilometers() {
		return kilometers;
	}
	public void setKilometers(Integer kilometers) {
		this.kilometers = kilometers;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
