package br.com.meli.databaseexample.exceptions;

public class NotFoundException extends RuntimeException{
	public NotFoundException(String msg) {
		super(msg);
	}

}
