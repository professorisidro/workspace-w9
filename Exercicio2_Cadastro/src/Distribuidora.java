
public class Distribuidora {
	public static void main(String[] args) {
		
		Product lista[] = new Product[5];
		
		lista[0] = new Perishable("Banana", 8, 3);
		lista[1] = new NonPerishable("Agua em Garrafa", 5.0, "bebida");
		lista[2] = new Perishable("Maca", 7, 1);
		lista[3] = new NonPerishable("Farinha", 10, "secos");
		lista[4] = new Perishable("Mamao",6,2);
		
		double total=0.0;
		for (Product p: lista) {
			System.out.println(p + "Preco Unitario: "+p.calculate(1));
			total += p.calculate(5);
		}
		
		System.out.println("Total = "+total);
	}
}
