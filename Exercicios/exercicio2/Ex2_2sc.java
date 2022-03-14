import java.util.Scanner;

class Ex2_2sc {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Informe um numero inteiro: ");
        int n1 = sc.nextInt ();
        System.out.println ("Informe outro numero inteiro: ");
        int n2 = sc.nextInt();
        
        double div = n1 / n2;

        System.out.println ("A divisao entre os dois numeros é: " + div);
    }
}