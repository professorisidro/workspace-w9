package br.com.meli.multiplostestes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.multiplostestes.model.Produto;
import br.com.meli.multiplostestes.service.ProdutoServiceImpl;

@SpringBootTest
@AutoConfigureMockMvc
public class ProdutoControllerTests {
	
	@Autowired
	private MockMvc mvc;  // este sujeito faz as vezes do POSTMAN
	
	@MockBean
	private ProdutoServiceImpl service;
	
	private Produto novoProdutoValido;
	private Produto novoProdutoInvalido; 
	
	@BeforeEach
	public void setup() {

		Produto produtoResult1 = new Produto(1,"Produto Fake Retornado",100.0);
		novoProdutoValido = new Produto(100,"Novo Produto Fake",100.0);
		novoProdutoInvalido = new Produto(2,"Novo Produto invalido",100.0);		
		
		Mockito.when(service.cadastrar(novoProdutoInvalido)).thenReturn(null);
		Mockito.when(service.cadastrar(novoProdutoValido)).thenReturn(novoProdutoValido);
		Mockito.when(service.recuperarPeloId(1)).thenReturn(produtoResult1);
		
	}
	
	@Test
	public void shouldReturnValidProduct() throws Exception {
		System.out.println("DEBUG - ML - Teste Produto Controller 0");
		mvc.perform(MockMvcRequestBuilders.get("/produtos/1"))		
			.andExpect(MockMvcResultMatchers.status().isOk());
		
	}
	
	@Test
	public void shouldAddNewValidProduct() throws Exception {
	    ObjectMapper mapper = new ObjectMapper();
	    System.out.println("DEBUG - ML - Teste Produto Controller 1");
	    mvc.perform(MockMvcRequestBuilders.post("/produtos")
	                    .content(mapper.writeValueAsString(novoProdutoValido))
	                    .contentType(MediaType.APPLICATION_JSON))	          
	            .andExpect(MockMvcResultMatchers.status().isCreated());	    
	}
	
	@Test
	public void shouldNotAddNewInvalidProduct() throws Exception{
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("DEBUG - ML - Teste Produto Controller 2");
		mvc.perform(MockMvcRequestBuilders.post("/produtos")
						.content(mapper.writeValueAsString(novoProdutoInvalido))
						.contentType(MediaType.APPLICATION_JSON))
			.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

}
