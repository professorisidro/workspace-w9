package model;

public class Item {
	private Integer codigo;
	private String nome;
	private Double precoUn;
	private Double qtd;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoUn() {
		return precoUn;
	}

	public void setPrecoUn(Double precoUn) {
		this.precoUn = precoUn;
	}

	public Double getQtd() {
		return qtd;
	}

	public void setQtd(Double qtd) {
		this.qtd = qtd;
	}

	public Item(Integer codigo, String nome, Double precoUn, Double qtd) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.precoUn = precoUn;
		this.qtd = qtd;
	}

	public Item() {
		super();
	}

	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", nome=" + nome + ", precoUn=" + precoUn + ", qtd=" + qtd + "]";
	}

}
