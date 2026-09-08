public class Ex57 {
    public static int dobro(int numero){
        return numero*2;
    }
    public static int quadruplo(int numero){
        int resultadoDobro = dobro(numero);
        return dobro(resultadoDobro);
    }
    public static void main(String[] args){
        System.out.println(quadruplo(8));
    }
}
