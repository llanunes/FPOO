class Tabuada {
    public static void main (String args []){
        int n = 5;
        
        for ( int i = 0 ; i<3 ; i++){
            for ( int j = 1 ; j<=10 ; j ++ ){
                System.out.println(n + "x" + j + "=" + n*j);
            }
            n++;
            System.out.println();
        }
    }
}