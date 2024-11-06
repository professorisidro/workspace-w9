package br.com.meli.databaseexample.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	@JsonIgnoreProperties("miniseries")
	private Categoria categoria;
	
	
	@ManyToMany(mappedBy = "atuacoes")
	@JsonIgnoreProperties("atuacoes")
	private List<Ator> elenco;
	
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
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public List<Ator> getElenco() {
		return elenco;
	}
	public void setElenco(List<Ator> elenco) {
		this.elenco = elenco;
	}	
	
}
