package br.com.meli.socialtestenetwork.model;

public class Buyer {
	private Integer id;
	private String username;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Buyer(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	public Buyer() {
		super();
	}
	

}
