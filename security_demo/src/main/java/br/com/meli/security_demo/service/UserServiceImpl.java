package br.com.meli.security_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.meli.security_demo.dto.UserDTO;
import br.com.meli.security_demo.model.User;
import br.com.meli.security_demo.repo.UserRepo;
import br.com.meli.security_demo.security.MyToken;
import br.com.meli.security_demo.security.TokenUtil;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepo repo;
	
	
	@Override
	public MyToken doLogin(UserDTO login) {
		// TODO Auto-generated method stub
		User user = repo.findByLogin(login.login());
		if (user != null) {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (encoder.matches(login.password(), user.getPassword())) {
				return TokenUtil.encode(user);
			}
		}
		return null;
	}
	@Override
	public User addNewUser(User user) {
		// só quero gravar a senha criptografada
		String novaSenha;
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		novaSenha = encoder.encode(user.getPassword());
		user.setPassword(novaSenha);
				
		return repo.save(user);
	}

}
