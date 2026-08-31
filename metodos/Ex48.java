import java.util.Scanner;

public class Ex48 {
    public static void tabuada(int numero){
        for (int contador = 1; contador <=10; contador++){
            System.out.println(numero + " x " + contador + " = " + (numero*contador) );
        }
    }
    public static void main(String[]args){
        tabuada(7);
    }
}
