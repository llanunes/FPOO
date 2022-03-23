import java.util.Scanner;

class Ex8 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a sua altura em metros: ");
        double alt = sc.nextDouble();
        System.out.println("Insira o seu peso em quilos: ");
        double peso = sc.nextDouble();

        double imc = peso / (alt * alt);

        if (imc < 17) {
            System.out.println ("Muito abaixo do peso.");
        }
        else if (imc >= 17 && imc <=18.49) {
            System.out.println("Abaixo do peso.");
        }
        else if (imc >= 18.5 && imc <= 24.99){
            System.out.println("Peso normal.");
        }
        else if ( imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso.");
        }
        else if ( imc >= 30 && imc <= 34.99) {
            System.out.println ("Obesidade I.");
        }
        else if ( imc >= 35 && imc <= 39.99){
            System.out.println("Obesidade II (severa).");
        }
        else if ( imc >= 40){
            System.out.println ("Obesidade III (morbida).");
        }
    }           
}
