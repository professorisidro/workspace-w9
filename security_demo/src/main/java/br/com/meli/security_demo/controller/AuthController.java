package br.com.meli.security_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.security_demo.dto.UserDTO;
import br.com.meli.security_demo.model.User;
import br.com.meli.security_demo.security.MyToken;
import br.com.meli.security_demo.service.IUserService;

@RestController
public class AuthController {
	
	@Autowired
	private IUserService service;
	
	@PostMapping("/users")
	public User addNewUser(@RequestBody User newUser) {
		return service.addNewUser(newUser);
	}
	
	@PostMapping("/login")
	public MyToken doLogin(@RequestBody UserDTO login) {
		return service.doLogin(login);
	}

}
