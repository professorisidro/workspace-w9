package br.com.meli.multiplostestes.model;

public class Produto {
	private Integer id;
	private String  nome;
	private Double  preco;
	
	
	public Produto() {
		super();
	}
	
	
	public Produto(Integer id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}


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
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof Produto) {
			Produto otherP = (Produto)other;
			return this.id.equals(otherP.id) && this.nome.equals(otherP.nome) && this.preco.equals(otherP.preco);
		}
		return false;
		
	}
	
	public int hashCode() {
		return id.hashCode();
	}


	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	
}
