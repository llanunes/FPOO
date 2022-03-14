import java.util.Scanner;

class Ex4sc {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println ("Informe o valor da compra(R$): ");
        double valor = sc.nextDouble ();
        System.out.println("Informe a porcentagem do desconto: ");
        double porcent = sc.nextDouble ();
        
        double desconto = (valor / 100) * porcent;
        double compra = valor - desconto;

        System.out.println ("O valor do desconto é: " + desconto);
        System.out.println("Com o desconto, o total a ser pago é: " + compra);
    }
}