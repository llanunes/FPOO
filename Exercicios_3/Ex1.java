import java.util.Scanner;

class Ex1{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
       

        while (true){
            while (true){
                System.out.println("Digite um numero inteiro:");
                int n = sc.nextInt();
                if (n % 2 == 0){
                    System.out.println("Numero par.");
                    break;
                }
                else{
                    System.out.println("Numero impar.");
                    break;
                }     
            }
            System.out.println("Deseja continuar? [s/n]");
                char op = sc.next().charAt(0);
                if (op != 's') {
                break;
            }  
        }
    }
}
 
