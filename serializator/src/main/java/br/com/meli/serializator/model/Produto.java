package br.com.meli.serializator.model;

import java.util.List;


public class Produto {
	private Integer idProduto;
	private String nome;
	private Double preco;	
	private List<Integer> departamentos;
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setId(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Produto(Integer idProduto, String nome, Double preco) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
	}
	public Produto() {
		super();
	}
	public List<Integer> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentosId(List<Integer> departamentos) {
		this.departamentos = departamentos;
	}
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + ", departamentosId=" + departamentos
				+ "]";
	}
	
	

}
