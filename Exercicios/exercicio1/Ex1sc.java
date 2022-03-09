import java.util.Scanner;
class Ex1sc {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero:");
        int n2 = sc.nextInt ();

        double soma = n1+n2;
        double sub  = n1-n2;
        double div  = n1/n2;
        double mult = n1*n2;

        System.out.println ("A soma dos dois números é: " + soma);
        System.out.println ("A subtração dos dois numeros é: " + sub);
        System.out.println ("A divisão dos dois números é: " + div);
        System.out.println ("A multiplicação dos dois números é: " + mult);
    }
}