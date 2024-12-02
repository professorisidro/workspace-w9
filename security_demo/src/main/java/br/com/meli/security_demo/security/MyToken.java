package br.com.meli.security_demo.security;

public class MyToken {
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public MyToken(String token) {
		super();
		this.token = token;
	}

	public MyToken() {
		super();
	}
	
}
