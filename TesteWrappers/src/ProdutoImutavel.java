
public class ProdutoImutavel {
	
	private Integer id;
	private String nome;
	private Double preco;
	public ProdutoImutavel(Integer id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Double getPreco() {
		return preco;
	}
	@Override
	public String toString() {
		return "ProdutoImutavel [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	

}
