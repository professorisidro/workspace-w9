import java.util.ArrayList;
import java.util.List;

public class Garagem {
	private List<Veiculo> veiculos;
	
	public Garagem() {
		veiculos = new ArrayList<Veiculo>() {{
			add(new Veiculo("Ford", "Fiesta", 1000.00));
			add(new Veiculo("Ford","Focus",1200.00));
			add(new Veiculo("Ford","Explorer",2500.00));
			add(new Veiculo("Fiat","Uni",500.00));
			add(new Veiculo("Fiat","Cronos",1000.00));
			add(new Veiculo("Fiat","Torino",1250.00));
			add(new Veiculo("Chevrolet","Aveo",1250.00));
			add(new Veiculo("Chevrolet","Spin",2500.00));
			add(new Veiculo("Toyota","Corola",1200.00));
			add(new Veiculo("Toyota","Fortuner",3000.00));
			add(new Veiculo("Renault","Logan",900.00));
		}};
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	
	
}
