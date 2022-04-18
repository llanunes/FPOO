import java.util.Scanner;
import javax.swing.JOptionPane;

class Formulas {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

                while (true){
                    System.out.println ("Area de qual figura geometrica voce deseja saber? [quadrado, circulo, triangulo, trapezio, losango ou retangulo]");
                    String opFigura = sc.next();
    
                    if (opFigura.equals("quadrado")){
                        System.out.println("Insira base:");
                        double base = sc.nextDouble();
                        
                        System.out.println("Insira a altura:");
                        double altura = sc.nextDouble();
    
                        System.out.println ("Area: " + quaouRe(altura,base));
                    }
            
                    else if (opFigura.equals("circulo") || opFigura.equals("círculo")){
                        System.out.println("Insira o raio do circulo: ");
                        double raio = sc.nextDouble();
    
                        System.out.println("Area: " + circulo (raio));
                    }
            
                    else if (opFigura.equals("triangulo") || opFigura.equals("triângulo")){
                        System.out.println("Insira a base: ");
                        double base = sc.nextDouble();
    
                        System.out.println("Insira a altura: ");
                        double altura = sc.nextDouble();
    
                        System.out.println("Area: " + triangulo (altura, base));
                    }
            
                    else if (opFigura.equals("retangulo") || opFigura.equals("retângulo")){
                        System.out.println("Insira base:");
                        double base = sc.nextDouble();
    
                        System.out.println("Insira a altura:");
                        double altura = sc.nextDouble();
    
                        System.out.println ("Area: " + quaouRe(altura,base));
                    }
    
                    else if (opFigura.equals("trapezio") || opFigura.equals("trapézio")){
                        System.out.println("Insira a diagonal maior: ");
                        double diagonalMaior = sc.nextDouble();
    
                        System.out.println("Insira a diagonal menor: ");
                        double diagonalMenor = sc.nextDouble();
    
                        System.out.println("Insira a altura:");
                        double altura = sc.nextDouble();
    
                        System.out.println("Area: " + trapezio (diagonalMaior, diagonalMenor, altura));
                    }
    
                    else if (opFigura.equals("losango")){
                        System.out.println("Insira a diagonal maior: ");
                        double diagonalMaior = sc.nextDouble();
    
                        System.out.println("Insira a diagonal menor: ");
                        double diagonalMenor = sc.nextDouble();
    
                        System.out.println("Area: " + losango(diagonalMaior, diagonalMenor));
                    }
                    System.out.println("Deseja continuar? [sim/nao]");
                    String sn = sc.next();
    
                    if (sn.equals("nao")){
                    System.exit(0);
                    } 
                 
        }      
    }

    public static double quaouRe(double altura, double base){
        double area = base * altura;
        return (area);
    }

    public static double triangulo(double base, double altura){
        double area = (base * altura)/2;
        return(area);
    }

    public static double circulo(double raio){
        double area = 3.14 * raio * raio;
        return (area);
    }

    public static double losango (double diagonalMaior, double diagonalMenor){
        double area = (diagonalMaior * diagonalMenor)/2;
        return(area);
    }

    public static double trapezio(double baseMaior, double baseMenor, double altura){
        double area =  (baseMaior + baseMenor) * altura/2;
        return(area);
    }
}

