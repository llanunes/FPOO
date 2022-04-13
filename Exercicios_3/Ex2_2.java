import java.util.Scanner;

class Ex2_2{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        String usuarioCad = "Larissa";
        String senhaCad = "123456789";
        int rep=1;

        while (rep<4){
            for (int i = 1; i < 3; i++) {
                System.out.println("Usuario:");
                String usuario = sc.next();
                System.out.println("Senha:");
                String senha = sc.next();

                if (usuario.equals(usuarioCad) && senha.equals(senhaCad)){
                    System.out.println("Seja bem vindo (a)!");
                    System.exit(0);
                } 
                else {
                    System.out.println("Dados incorretos");
                    rep ++;
                    break;    
                }
            }
        }
    }
}