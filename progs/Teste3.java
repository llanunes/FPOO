import java.util.Scanner;

class Teste3 {
public static void main (String [] args) {

    Scanner ler = new Scanner(System.in);

    System.out.print("\n informe seu ano de nascimento: ");

    int anonasc = ler.nextInt();
    int idade = 2022 - anonasc;
    
    System.out.println("\n\tIdade " +idade + " anos.");
    }
}