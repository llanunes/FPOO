import javax.swing.JOptionPane;

class Ex1 {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        double n1 = Double.parseDouble(jp.showInputDialog(null,"Informe o primeiro número:"));
        double n2 = Double.parseDouble(jp.showInputDialog(null, "Informe o segundo número:"));

        double soma  = n1+n2;
        double sub   = n1-n2;
        double div   = n1/n2;
        double multi = n1*n2;

        jp.showMessageDialog(null, "Soma=" + soma);
        jp.showMessageDialog(null, "Subtração="+ sub);
        jp.showMessageDialog(null, "Divisão=" + div);
        jp.showMessageDialog(null, "Multiplicação=" + multi);
    }
}