import java.util.Scanner;

public class Bee1021{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double valorTotal;
        valorTotal = teclado.nextDouble();

        int valorInteiro = (int)valorTotal;       
        int centavos = (int) ((valorTotal - valorInteiro)*100);

        int q100,q50,q20,q10,q5,q2;
        int q1,q050, q025,q010,q005,q001;

        q100 = valorInteiro / 100;
        valorInteiro = valorInteiro % 100;
        q50 = valorInteiro / 50;
        valorInteiro = valorInteiro % 50;
        q20 = valorInteiro / 20;
        valorInteiro = valorInteiro % 20;
        q10 = valorInteiro / 10;
        valorInteiro = valorInteiro % 10;
        q5 = valorInteiro / 5;
        valorInteiro = valorInteiro % 5;
        q2 = valorInteiro / 2;
        
        q1 = valorInteiro % 2;
        q050 = centavos / 50;
        centavos = centavos % 50;
        q025 = centavos / 25;
        centavos = centavos % 25;
        q010 = centavos / 10;
        centavos = centavos % 10;
        q005 = centavos / 5;
        q001 = centavos % 5;
        
        System.out.println("NOTAS:");
        System.out.println(q100+ " nota(s) de R$ 100.00");
        System.out.println(q50+ " nota(s) de R$ 50.00");
        System.out.println(q20+ " nota(s) de R$ 20.00");
        System.out.println(q10+ " nota(s) de R$ 10.00");
        System.out.println(q5+ " nota(s) de R$ 5.00");
        System.out.println(q2+ " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(q1+ " moeda(s) de R$ 1.00");
        System.out.println(q050+ " moeda(s) de R$ 0.50");
        System.out.println(q025+ " moeda(s) de R$ 0.25");
        System.out.println(q010+ " moeda(s) de R$ 0.10");
        System.out.println(q005+ " moeda(s) de R$ 0.05");
        System.out.println(q001+ " moeda(s) de R$ 0.01");
        

       
    }
}