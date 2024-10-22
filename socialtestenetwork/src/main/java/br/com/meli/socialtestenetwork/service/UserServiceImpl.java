package br.com.meli.socialtestenetwork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.socialtestenetwork.dto.ResponseDTO;
import br.com.meli.socialtestenetwork.exceptions.BuyerNotFoundException;
import br.com.meli.socialtestenetwork.exceptions.SellerNotFoundException;
import br.com.meli.socialtestenetwork.model.Buyer;
import br.com.meli.socialtestenetwork.model.Seller;
import br.com.meli.socialtestenetwork.repo.BuyerRepo;
import br.com.meli.socialtestenetwork.repo.SellerRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired 
	private SellerRepo sellerRepo;
	
	@Autowired
	private BuyerRepo buyerRepo;
	
	@Override
	public ResponseDTO follow(Integer userId, Integer userIdToFollow) {
		// TODO Auto-generated method stub
		Seller s = sellerRepo.findById(userIdToFollow);
		Buyer  b = buyerRepo.findById(userId);
		
		if (s == null) {
			throw new SellerNotFoundException("Vendedor inexistente" );
		}
		if (b == null) {
			throw new BuyerNotFoundException("Comprador inexistente");
		}
		
		s.getFollowers().add(b);
		return new ResponseDTO(200, b.getId(), s.getUserId());
		
	}

}
