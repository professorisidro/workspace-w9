package br.com.meli.serializator.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

public class Departamento {
	private Integer idDepto;
	private String nome;
	
	private List<Integer> produtos;
	
	public Integer getIdDepto() {
		return idDepto;
	}
	public void setId(Integer idDepto) {
		this.idDepto = idDepto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Departamento(Integer idDepto, String nome) {
		super();
		this.idDepto = idDepto;
		this.nome = nome;
	}
	public Departamento() {
		super();
	}
	public List<Integer> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Integer> produtos) {
		this.produtos = produtos;
	}
	@Override
	public String toString() {
		return "Departamento [idDepto=" + idDepto + ", nome=" + nome + ", produtosId=" + produtos + "]";
	}
	
	

}
