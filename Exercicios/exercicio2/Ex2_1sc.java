import java.util.Scanner;

class Ex2_1sc {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println ("Digite um numero inteiro: ");
        int n1 = sc.nextInt();
        System.out.println ("Digite outro numero inteiro: ");
        int n2 = sc.nextInt();

        double pot1 = Math.pow(n1, 5);
        double pot2 = Math.pow(n2, 5);

        System.out.println("A potencia do primeiro numero com expoente 5 é: " + pot1);
        System.out.println("A potencia do segundo numero com expoente 5 é: " + pot2);
    }
}