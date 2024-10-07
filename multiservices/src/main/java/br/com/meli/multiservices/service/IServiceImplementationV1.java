package br.com.meli.multiservices.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("padrao")
public class IServiceImplementationV1 implements IService{

	@Override
	public String exibirMensagem(String msg) {
		// TODO Auto-generated method stub
		return "Message:"+msg;
	}
	

}
