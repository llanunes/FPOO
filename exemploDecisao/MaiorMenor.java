import java.util.Scanner;

class MaiorMenor{
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe sua idade: ");

        int idade = sc.nextInt();

        if (idade > 17) { 
            System.out.println ("\n Maior de idade");
        }
         
        else {
            System.out.println("\n Menor de idade");
        }   
        
    }
}