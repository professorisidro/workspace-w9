package br.com.meli.socialtestenetwork.service;

import br.com.meli.socialtestenetwork.dto.ResponseDTO;

public interface UserService {
	public ResponseDTO follow(Integer userId, Integer userIdToFollow);
}
