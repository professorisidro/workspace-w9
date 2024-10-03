
public class NonPerishable extends Product{
	
	private String type;

	public NonPerishable(String name, double price, String type) {
		super(name, price);
		this.type = type;
	}



	@Override
	public String toString() {
		return "NonPerishable [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	
	

}
