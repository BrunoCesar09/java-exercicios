public class Ex52 {
    public static boolean par (int numero){
        if (numero % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        boolean resultado = par(8);
        System.out.println(resultado);
    }
}
