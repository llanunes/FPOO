import javax.swing.JOptionPane;

class Ex6{
    public static void  main (String args[]) {
        JOptionPane jp = new JOptionPane ();

        double graus = Double.parseDouble(jp.showInputDialog(null,"Informe os graus em Celsius para serem convertidos em Fahrenheit"));
        double f = (graus * 9 + 160) / 5;

        jp.showMessageDialog(null, "O valor dos graus Celsius em Fahrenheit é: " + f);
    }
}