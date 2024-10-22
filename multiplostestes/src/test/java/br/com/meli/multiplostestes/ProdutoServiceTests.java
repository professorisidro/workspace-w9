package br.com.meli.multiplostestes;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.meli.multiplostestes.model.Produto;
import br.com.meli.multiplostestes.repo.IProdutoRepo;
import br.com.meli.multiplostestes.service.ProdutoServiceImpl;

@SpringBootTest
public class ProdutoServiceTests {
	
	/* Qual a idéia deste teste?
	 * Precisamos criar um teste para que, ao invés do nosso serviço utilizar
	 * o repositorio original (por várias questoes, desde falta de acesso até 
	 * não querer poluir o repo), vamos simular o repositório
	 * 
	 * como fazer?
	 * - precisamos criar uma versão fake do repositório
	 * @Mock antes da declaração do repo
	 * 
	 * - precisamos que o serviço injete o repositório Fake ao invés do original
	 * @InjectMocks na declaração do servico
	 * 
	 * 
	 * Precisamos também definir o comportamento das chamadas dos métodos do Mock
	 */
	
	@InjectMocks
	private ProdutoServiceImpl service = new ProdutoServiceImpl();
	
	@Mock
	private IProdutoRepo mockRepo;
	
	@BeforeEach
	public void setup() {
		List<Produto> produtos = List.of(new Produto(1,"FakeProduct1",10.0));
		Produto produtoCadastrado = new Produto(10,"FakeInsertedProduct",100.0);
		Mockito.when(mockRepo.findAll()).thenReturn(produtos);
	}
	
	@Test
	public void shouldReturnNonEmptyProductList() {
		System.out.println("DEBUG - ML - Teste Produto Service");
		assertTrue(service.recuperarTodos().size() > 0);
	}
	
	
	
	

}
