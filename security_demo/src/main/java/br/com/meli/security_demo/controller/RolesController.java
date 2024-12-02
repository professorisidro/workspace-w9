package br.com.meli.security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolesController {
	
	@GetMapping("/general")
	public String sayHelloToEveryone() {
		return "Hi Seller/Buyer/Representant";
	}
	
	@GetMapping("/buyer")
	public String sayHelloToBuyer() {
		return "Hi Buyer";
	}
	@GetMapping("/seller")
	public String sayHelloToSeller() {
		return "Hi Seller";
	}
	@GetMapping("/rep")
	public String sayHelloToRepresentant() {
		return "Hi Representant";
	}

}
