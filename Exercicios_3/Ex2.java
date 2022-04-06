import java.util.Scanner;

class Ex2{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        String usuarioCad = "Larissa";
        String senhaCad = "123456789";
        int rep=1;

        while (rep < 4){
            for ( int i = 1 ; i < 4; i++ ){
                System.out.println("Usuario:");
                String usuarioin = sc.next();

                if (!usuarioin.equals(usuarioCad)) {
                    System.out.println("Usuario incorreto");
                    rep++;
                    break;
                }
                System.out.println("Senha");
                String senhain = sc.next();

                if (!senhain.equals(senhaCad)){
                    System.out.println("Senha incorreta");
                    rep++;
                    break;
                }
                else {
                    System.out.println("Seja bem vindo(a)!");
                    System.exit(0);
                }
            }
        }
    }
}
