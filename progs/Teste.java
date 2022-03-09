import javax.swing.JOptionPane;

class Teste {
public static void main (String args []) {
    JOptionPane jp = new JOptionPane();

   String nome = jp.showInputDialog(null, "informe seu nome:");
    jp.showMessageDialog(null,"Seja bem-vindo(a) " + nome);

    }
}