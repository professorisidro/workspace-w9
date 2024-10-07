package br.com.meli.multiservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.multiservices.dto.ClienteRequest;
import br.com.meli.multiservices.service.IService;

@RestController
public class HelloController {
	
	@Autowired
	@Qualifier("padrao")
	private IService service;
	
	@GetMapping("/hello")
	public String sayHello() {
		return service.exibirMensagem("Hello world");
	}
	
	@PostMapping("/clientes")
	public String adicionarCliente(@RequestBody ClienteRequest cliente) {
		System.out.println(cliente);
		System.out.println(cliente.id());
		System.out.println(cliente.nome());
		return "Ok";
	}

}
