package br.com.meli.multiservices.dto;

public record ClienteRequest(Integer id, 
		                     String nome, 
		                     String email, 
		                     String dataNascimento) {

	
}
