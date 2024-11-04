package br.com.meli.serializator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.meli.serializator.service.ProdutoUtil;

@SpringBootTest
class SerializatorApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testandoCriarProduto() {
		System.out.println(ProdutoUtil.createProduto());
	}

}
