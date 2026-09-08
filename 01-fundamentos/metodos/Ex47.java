import java.util.Scanner;

public class Ex47 {
    public static void tabuada(){
        int num = 5;
        int multiplicacao = 0;
        for (int contador = 1; contador <=10; contador++){
            multiplicacao = num * contador;
            System.out.println(num + " x " + contador + " = " + multiplicacao);
        }

    }
    public static void main(String[]args){
        tabuada();
    }
}
