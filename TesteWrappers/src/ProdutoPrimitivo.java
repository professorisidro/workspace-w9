
public class ProdutoPrimitivo {
	private int id;
	private String nome;
	private double preco;
	

	
	public ProdutoPrimitivo() {
		super();
	}

	public ProdutoPrimitivo(int id, String no, double pr) {
		this.id = id;
		this.nome = no;
		this.preco = pr;
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "ProdutoPrimitivo [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
}	
