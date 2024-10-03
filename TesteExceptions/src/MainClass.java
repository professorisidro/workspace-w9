import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		
		try (Scanner teclado = new Scanner(System.in)) {			
			Produto p = new Produto();
			System.out.println("Digite o ID do produto");
			int id = Integer.parseInt(teclado.nextLine());
			p.setId(id);
			
			System.out.println("Digite o nome do produto");
			String nome = teclado.nextLine();
			p.setNome(nome);
			
			System.out.println("Digite o preco do produto");
			double preco = Double.parseDouble(teclado.nextLine());
			p.setPreco(preco);
			
			System.out.println("Produto cadastrado "+p.getId()+"/"+p.getNome()+"/"+p.getPreco());
		}
		catch(NumberFormatException | InputMismatchException e) {
			System.out.println("Erro - valor invalido para este dado");
		}		
		catch(IsiException e) {
			System.out.println("Erro - "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Erro generico ");
		}
		
		
	}

}
