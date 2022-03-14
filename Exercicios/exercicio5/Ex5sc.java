import java.util.Scanner;

class Ex5sc {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe o valor em Real a ser convertido em Dolar: ");
        double valorDolar = sc.nextDouble();
        System.out.println("Informe a cotação do dolar atualmente: ");
        double cotacaoDolar = sc.nextDouble();
        
        double real = valorDolar * cotacaoDolar;

        System.out.println ("Valor da quantidade em real = " + real);

    }
}