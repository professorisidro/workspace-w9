
public class MainClass {
	public static void main(String[] args) {
		/*
		ProdutoPrimitivo p1 = new ProdutoPrimitivo();
		ProdutoWrapper   p2 = new ProdutoWrapper();
		System.out.println(p1);
		System.out.println(p2);
		
		p1.setId(1234);
		p1.setNome("computador");
		p1.setPreco(1500);
		System.out.println(p1);
		
		
		ProdutoImutavel p3 = new ProdutoImutavel(1235,"mouse",54.90);
		System.out.println(p3);
		
		p3 = new ProdutoImutavel(1235,"mouse",49.90);
		*/
		
		
		ProdutoPrimitivo p1 = new ProdutoPrimitivo(1234,"computador",1500.0);
		ProdutoPrimitivo p2 = p1;
		
		System.out.println(p1);
		p2.setPreco(2500.0);
		System.out.println(p1);
		
		String s1 = "Oi, quer tc?";
		String s2 = "Oi, quer tc?";  // s2 = s1
		
		if (s1.equals(s2)) {
			System.out.println("iguais");
		}
		else {
			System.out.println("diferentes");
		}
		
		s2 = "Oi quero tc sim, por que?";
		
		System.out.println(s2.intern());
		
		System.out.println(s2);
		
		ProdutoImutavel p;
		for (int i=0;i<10;i++) {
			p = new ProdutoImutavel(i, "produto"+i, i*10.0);
		}
		
		String x = "";
		x += "zaaa";
		
		Number z = 4.0f;
		
		System.out.println(z.getClass().getName());
	}
	
}
