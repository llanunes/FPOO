import java.util.Scanner;

class Fatorial{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe o numero desejado para o fatorial:");
        long num = sc.nextLong();
        long fat = num;

        for (long i = num-1; i>=2; i--){
            fat = fat * i;
        }

        System.out.println(num + "! = " + fat);
    }  
}       
