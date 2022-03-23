import java.util.Scanner;

class Ex2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Informe um numero: ");
        int numero = sc.nextInt();

        if (numero == 10) {
            System.out.println ("Numero 10");
        }
        else {
            if (numero < 10) {
                System.out.println ("Numero menor de 10");
            }
            else {
                System.out.println ("Numero maior que 10");
            }
        }
    }
}