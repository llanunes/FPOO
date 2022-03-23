import java.util.Scanner;

class Ex1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Informe um numero:");
        int numero = sc.nextInt();
       
        if (numero == 0) {
            System.out.println ("Numero zero");
        } 
        else {
            if (numero < 0) {
                System.out.println ("Negativo");
            }
            else {
                System.out.println ("Positivo");
            }
        }
    }
}    