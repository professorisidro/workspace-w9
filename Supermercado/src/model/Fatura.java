package model;

import java.util.List;

public class Fatura {
	private Integer numero;
	private Cliente cliente;
	private List<Item> itens;
	private Double total;
	public Fatura() {
		super();
	}
	public Fatura(Integer numero, Cliente cliente, List<Item> itens, Double total) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.itens = itens;
		this.total = total;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Fatura [numero=" + numero + ", cliente=" + cliente + ", itens=" + itens + ", total=" + total + "]";
	}	
}
