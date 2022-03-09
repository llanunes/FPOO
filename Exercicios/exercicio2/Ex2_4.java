import javax.swing.JOptionPane;

class Ex2_4 {
    public static void main (String args []) {
        JOptionPane jp = new JOptionPane ();

        int n1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro: "));
        int n2 = Integer.parseInt(jp.showInputDialog(null, "Informe outro número inteiro: "));

        double raiz1 = Math.sqrt(n1);
        double raiz2 = Math.sqrt(n2);

        jp.showMessageDialog(null,"Raiz do primeiro número: " + raiz1);
        jp.showMessageDialog(null, "Raiz do segundo número: " + raiz2);
     }
}
    