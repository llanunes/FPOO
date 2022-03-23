import java.util.Scanner;

class Ex3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Informe um numero: ");
        int n1 = sc.nextInt ();
        System.out.println ("Informe outro numero: ");
        int n2 = sc.nextInt ();

        if (n1 == n2){
            System.out.println("Os numeros sao iguais.");
        }
        else {
            if (n1 > n2) {
                System.out.println(n1 + " eh maior que " + n2);
            }
            else {
                System.out.println(n1 + " eh menor que " + n2);
            }
        }
    }
}