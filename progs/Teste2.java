import javax.swing.JOptionPane;

class Teste2 {
public static void main(String[]args) {
    JOptionPane jp = new JOptionPane ();

    String nome = jp.showInputDialog(null,"Informe seu nome");
    
    jp.showMessageDialog(null,"Seja bem-vindo(a) " + nome);

    int Anonascimento = Integer.parseInt(jp.showInputDialog(null, "Para saber a sua idade me diga em que ano voce nasceu."));
    int resultIdade = 2022 - Anonascimento;

    jp.showMessageDialog(null, "voce tem: " + resultIdade + "anos");
    

    int cincoAnos = resultIdade + 5;

    jp.showMessageDialog (null, "ja parou para pensar que daqui 5 anos voce tera "  + cincoAnos + "?");

    }
} 