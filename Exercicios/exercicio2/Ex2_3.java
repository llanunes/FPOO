import javax.swing.JOptionPane;

class Ex2_3 {
    public static void main (String args[]) {
        JOptionPane jp = new JOptionPane ();

        int n1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro: "));
        int n2 = Integer.parseInt(jp.showInputDialog(null, "Informe outro número inteiro: "));

        double modulo = n1 % n2; 

        jp.showMessageDialog(null, "O módulo entre esses dios números é: " + modulo);
    }
}