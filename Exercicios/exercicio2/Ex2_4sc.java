import java.util.Scanner;

class Ex2_4sc {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe um numero inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Informe outro numero inteiro: ");
        int n2 = sc.nextInt ();

        double raiz1 = Math.sqrt(n1);
        System.out.println("A raiz do primeiro numero é: " + raiz1);
        double raiz2 = Math.sqrt(n2);
        System.out.println("A raiz do segundo numero é: " + raiz2);
    }
}