import java.util.List;

public class App {
	public static void main(String[] args) {
		
		Garagem g = new Garagem();
		
		
//		List<Veiculo> result = g.getVeiculos().stream()
//				 .sorted(Comparator.comparing( Veiculo::getPreco ).reversed())
//				 .toList();	
			
		// filtrando pelo menor preço
		List<Veiculo> result = g.getVeiculos().stream().filter((v)-> v.getPreco() < 1000).toList();
		
		
		List<Veiculo> r1 = FiltroGenerico.filtrarGenericamente(g.getVeiculos(), (v)-> v.getPreco() < 1000.0 );
		System.out.println(result);
		//g.getVeiculos().stream().forEach(v -> System.out.println(v));		
	}
}
