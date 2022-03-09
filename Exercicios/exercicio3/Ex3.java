import javax.swing.JOptionPane;

class Ex3 {
    public static void main (String args[]) {
        JOptionPane jp = new JOptionPane (); 

        int n1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro: "));
        int n2 = Integer.parseInt(jp.showInputDialog(null, "Informe outro número inteiro: "));

        jp.showMessageDialog(null, "Numero 1= " + n1);
        jp.showMessageDialog(null, "Número2= " + n2);

        jp.showMessageDialog(null, "trocando variáveis");

        int n3 = n1;
        n1 = n2;
        n2 = n3;
        
        
        jp.showMessageDialog(null, "Número 1= " + n1);
        jp.showMessageDialog(null, "Número 2= " + n2);

    }
}