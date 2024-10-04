package br.com.meli.morse.util;

public class MorseMessage {
	private String message;

	public MorseMessage(String message) {
		super();
		this.message = message;
	}

	public MorseMessage() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
