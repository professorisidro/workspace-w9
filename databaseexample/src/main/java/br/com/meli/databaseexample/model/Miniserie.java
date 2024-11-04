package br.com.meli.databaseexample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_miniserie")
public class Miniserie {
	@Id
	@Column(name = "id_miniserie")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String name;
	
	@Column(name = "rating", nullable =  false)
	private Double rating;
	
	@Column(name = "amount_of_awards", nullable = false)
	private Integer amountOfAwards;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Integer getAmountOfAwards() {
		return amountOfAwards;
	}
	public void setAmountOfAwards(Integer amountOfAwards) {
		this.amountOfAwards = amountOfAwards;
	}	
}
