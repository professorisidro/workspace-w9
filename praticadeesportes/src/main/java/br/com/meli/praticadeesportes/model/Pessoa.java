package br.com.meli.praticadeesportes.model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private Integer idade;
	private Esporte esporte;
	
	public Pessoa(String nome, String sobrenome, Integer idade, Esporte esporte) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.esporte = esporte;
	}
	public Pessoa() {
		super();		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Esporte getEsporte() {
		return esporte;
	}
	public void setEsporte(Esporte esporte) {
		this.esporte = esporte;
	}

	
}
