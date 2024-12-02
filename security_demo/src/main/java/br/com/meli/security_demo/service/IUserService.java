package br.com.meli.security_demo.service;

import br.com.meli.security_demo.dto.UserDTO;
import br.com.meli.security_demo.model.User;
import br.com.meli.security_demo.security.MyToken;

public interface IUserService {
	
	public MyToken doLogin(UserDTO login);
	public User addNewUser(User user);

}
