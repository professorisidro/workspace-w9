
public class ProdutoWrapper {
	private Integer id;
	private String nome;
	private Double preco;
	
		
	public ProdutoWrapper() {
		super();
	}
	public ProdutoWrapper(Integer id, String nome, Double preco) {
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
	public String toString() {
		return "ProdutoWrapper [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	
}
