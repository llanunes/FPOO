import javax.swing.JOptionPane;

class Ex5 {
    public static void main (String args[]) {
        JOptionPane jp = new JOptionPane ();
        double valorDolar = Double.parseDouble(jp.showInputDialog(null, "Informe o valor do dolar a ser convertido em reais: "));
        double cotacaoDolar = Double.parseDouble(jp.showInputDialog(null, "Informe a cotação atual do dolar: "));

        double real = valorDolar * cotacaoDolar;

        jp.showMessageDialog(null, "O valor do dólar convertido em reais é: " + real);
    }
}