import java.util.Scanner;

class ParImpar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            while (true) {
                System.out.print("\nInsira um número: ");
                int num = sc.nextInt();

                int res = num % 2;

                if (res == 0) {
                    System.out.println("Par");
                    break;
                }
                else {
                    System.out.println("Impar");
                    break;
                }
            }
            System.out.println("\nDeseja continuar? [s/n]");
            char op = sc.next().charAt(0);
            if (op != 's') {
                break;
            }
        }
    }
}