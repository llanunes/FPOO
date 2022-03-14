import java.util.Scanner;

class Ex6sc {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Informe os graus em Celsius: ");
        double grau = sc.nextDouble ();

        double f = (grau * 9 / 5) + 32;

        System.out.println("Graus Celsius convertido em graus Farenhait =  " + f);
    }
}