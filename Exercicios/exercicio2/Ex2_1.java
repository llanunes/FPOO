import javax.swing.JOptionPane;

class Ex2_1 {
    public static void main (String args[]) {
        JOptionPane jp = new JOptionPane ();

        int n1 = Integer.parseInt(jp.showInputDialog (null, "Informe um número inteiro:"));
        int n2 = Integer.parseInt(jp.showInputDialog (null, "Informe outro número inteiro:"));

        double pot1 = Math.pow(n1, 5);
        double pot2 = Math.pow(n2,5);

        jp.showMessageDialog(null, n1 + "^5 = " +  pot1);
        jp.showMessageDialog(null,n2 + "^5 = " + pot2);
    }
}
    