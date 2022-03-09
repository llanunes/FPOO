import javax.swing.JOptionPane;

class Ex4 {
    public static void main (String args []) {
        JOptionPane jp = new JOptionPane ();

        double valor = Double.parseDouble(jp.showInputDialog(null, "Informe o valor do produto: "));
        double percent = Double.parseDouble(jp.showInputDialog(null, "Informe a porcentagem do desconto: "));

        double desconto = (valor / 100) * percent;
        double compra = valor - desconto;

        jp.showMessageDialog(null, "O valor do desconto é: " + desconto + "reais");
        jp.showMessageDialog(null, "O total a pagar é: " + compra + "reais");
    }
}