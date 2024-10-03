
public class Perishable extends Product {
	private int daysPerCaducar;

	public Perishable(String name, double price, int daysPerCaducar) {
		super(name, price);
		this.daysPerCaducar = daysPerCaducar;
	}
	
	@Override
	public double calculate(int quantityOfProducts) {
		double newprice;
		if (daysPerCaducar == 1) {
			newprice = super.price / 4;
		}
		else if (daysPerCaducar == 2) {
			newprice = super.price / 3;
		}
		else if (daysPerCaducar == 3) {
			newprice = super.price / 2;
		}
		else {
			newprice = super.price;
		}
		return newprice * quantityOfProducts;
		
	}

	@Override
	public String toString() {
		return "Perishable [name=" + name + ", price=" + price + ", daysPerCaducar=" + daysPerCaducar + "]";
	}
	

}
