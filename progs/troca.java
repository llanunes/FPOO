class Troca {
    public static void main(String args []) {
        int n1 = 10;
        int n2 =  4;

        System.out.println ("n1=" + n1);
        System.out.println ("n2=" + n2);

        System.out.println ("------------------");
        System.out.println ("Trocando Variaveis");
        System.out.println ("------------------");

        int aux = n1;
        n1=n2;
        n2=aux;

        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);

    }
}