package model;

public class Cliente {
	private Integer numSeq;
	private String  nome;
	private String  sobrenome;
	
	public Cliente() {
		super();
	}
	public Cliente(Integer numSeq, String nome, String sobrenome) {
		super();
		this.numSeq = numSeq;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public Integer getNumSeq() {
		return numSeq;
	}
	public void setNumSeq(Integer numSeq) {
		this.numSeq = numSeq;
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
	@Override
	public String toString() {
		return "Cliente [numSeq=" + numSeq + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	

}
