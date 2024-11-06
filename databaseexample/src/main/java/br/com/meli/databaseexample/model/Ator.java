package br.com.meli.databaseexample.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_ator")
public class Ator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ator")
	private Integer id;
	
	@Column(name = "nome", length = 100)
	private String nome;
	@Column(name = "idade")
	private Integer idade;
	
	@ManyToMany
	@JoinTable(name = "tbl_atuacao",
	           joinColumns = @JoinColumn(name = "id_ator"),
	           inverseJoinColumns = @JoinColumn(name = "id_miniserie"))
	@JsonIgnoreProperties("elenco")
	private List<Miniserie> atuacoes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public List<Miniserie> getAtuacoes() {
		return atuacoes;
	}
	public void setAtuacoes(List<Miniserie> atuacoes) {
		this.atuacoes = atuacoes;
	}
	
	

}
