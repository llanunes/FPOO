import java.util.Scanner;

class Ex3sc {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Informe uma variavel atraves de um numero inteiro: ");
        int variavel1 = sc.nextInt();
        System.out.println ("Informe outra variavel atraves de outro numero inteiro: ");
        int variavel2 = sc.nextInt();

        System.out.println("Variavel 1 = " + variavel1);
        System.out.println("Variavel 2 = " + variavel2);
        
        System.out.println ("\nTROCANDO VARIAVEIS");

        int  variavel3 = variavel1;
        variavel1 = variavel2;
        variavel2 = variavel3;

        System.out.println ("\n Variavel 1 = " + variavel1);
        System.out.println ("Variavel 2 = " + variavel2);
      



    }
}