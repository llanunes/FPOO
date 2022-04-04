import java.util.Scanner;

class Ex7{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        while (true) {
            System.out.println("Informe um numero positivo: ");
            final long n = sc.nextInt();
            long fat = n;

        if (n==0){
            System.out.println ("0! = 1");
            break;
        }  
        if (n==1){
            System.out.println ("1! = 1");
            break;
        }  
        if  (n>0) {
            for ( int i = 2; i < n ; i ++) {
                fat *= i;   
            }
            System.out.println (n + "! = " + fat);
            break;
            }
        System.out.println("Voce inseriu um numero negativo, somente numeros positivos sao aceitos.");                       
        }
    }    
}