public class Ex54 {
    public static int dobro(int numero){
        return numero*2;
    }
    public static int quadruplo(int numero){
        return dobro(numero*2);
    }
    public static void main(String[]args){
        int resultado = quadruplo(7);
        System.out.println(resultado);
    }
}
