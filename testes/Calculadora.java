import javax.swing.JOptionPane;
import java.util.Scanner;

class Calculadora {
    public static void main (String args[]){
        JOptionPane jp = new JOptionPane();
        Scanner sc = new Scanner (System.in);

        while (true){
            System.out.println("Voce deseja usar o modo grafico ou o modo texto? [texto/grafico]");
            String resp = sc.next();
        
                    if (op.equals("grafico")){   
                    double n1 = Double.parseDouble(jp.showInputDialog(null, "Insira um numero:"));
                    double n2 = Double.parseDouble(jp.showInputDialog(null,"Insira outro numero"));

                    jp.showMessageDialog(null,n1 + " + " + n2 + " = " + somar (n1,n2));
                    jp.showMessageDialog(null, n1 + " - " + n2 + " = " + sub(n1,n2));
                    jp.showMessageDialog(null, n1 + " / " + n2 + " = " + div(n1,n2));
                    jp.showMessageDialog(null, n1 + " * " + n2 + " = " + mult (n1, n2));
                }
                System.out.println("Insira um numero:");
                double scn1 = sc.nextInt();
                System.out.println("Insira outro numero:");
                double scn2 = sc.nextInt(); 

                System.out.println(scn1 + "+" + scn2 + "=" + somar(n1,n2));
                System.out.println(scn1 + "-" + scn2 + "=" + sub(n1,n2));
                System.out.println(scn1 + "/" + scn2 + "=" + div(n1,n2));
                System.out.println(scn1 + "*" + scn2 + "=" + mult(n1,n2));
        }
        
    
    


        /*double resultsoma = somar (n1, n2);
        System.out.println(resultsoma);
        double resultsub = sub (n1, n2);
        System.out.println(resultsub);
        double resultmult = mult (n1, n2);
        System.out.println(resultmult);
        double resultdiv = div (n1, n2);
        System.out.println(resultdiv);*/
    }

    public static double somar (double n1, double n2) {
        return(n1 + n2);
    }
    public static double sub (double n1, double n2) {
        return(n1 - n2);
    }
    public static double mult (double n1, double n2) {
        return(n1 * n2);
    }
    public static double div (double n1, double n2) {
        return(n1 / n2);
    }    
}