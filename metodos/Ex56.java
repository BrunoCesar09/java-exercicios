public class Ex56 {
    public static int dobro(int numero){
        return numero*2;
    }
    public static int triplo(int numero){
        return numero*3;
    }
    public static void mostrarResultado(){
        int dobro = dobro(8);
        int triplo = triplo(8);
        System.out.println(dobro);
        System.out.println(triplo);
    }
    public static void main(String[] args){
        mostrarResultado();
    }
}
