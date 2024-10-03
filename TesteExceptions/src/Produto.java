
public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	public Produto(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	public Produto() {
		this(0, "", 0.0);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id <= 0) {
			throw new IsiException("ID nao pode ser menor ou igual a zero"); 
		}
		this.id = id;
		
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.length() == 0) {
			throw new IsiException("Nome nao pode ser vazio");
		}
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco <= 0) {
			throw new IsiException("Preco nao pode ser menor ou igual a zero");
		}
		this.preco = preco;
	}
	

	
}
