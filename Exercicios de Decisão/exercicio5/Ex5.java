import java.util.Scanner;

class Ex5 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Informe sua idade: ");
        int idade = sc.nextInt ();

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        }
        else {
            System.out.println ("Menor de idade");
        }
    }
}