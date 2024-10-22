package br.com.meli.socialtestenetwork;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.meli.socialtestenetwork.exceptions.BuyerNotFoundException;
import br.com.meli.socialtestenetwork.exceptions.SellerNotFoundException;
import br.com.meli.socialtestenetwork.service.UserService;

@SpringBootTest
public class UserServiceTests {
	
//	@Mock
	@Autowired
	private UserService service;
	
//	@BeforeEach
//	private void setup() {		
//		Mockito.when(service.follow(1234, 4567)).thenReturn(new ResponseDTO(200,1234,4567));
//		Mockito.when(service.follow(1234, 9876)).thenThrow(new SellerNotFoundException("Vendedor inexistente"));
//		Mockito.when(service.follow(4321, 4567)).thenThrow(new BuyerNotFoundException("Comprador inexistente"));
//	}	
	
	@Test
	public void shouldValidBuyerFollowValidSeller() {
		assertNotNull(service.follow(1234, 4567));
	}
	
	@Test
	public void shouldNotFollowInvalidSeller() {
		assertThrows(SellerNotFoundException.class, () -> {
			service.follow(1234,9876);
		});
	}
	
	@Test
	public void shouldNotBeFollowedByInvalidBuyer() {
		assertThrows(BuyerNotFoundException.class, () ->{
			service.follow(4321,4567);
		});
	}

}
