import java.util.Scanner;
public class Ex25 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número:");
        int num = sc.nextInt();
        int contador = 1;
        while (contador <= 10){
            System.out.println(num + " x " + contador + " = " + (num*contador));
            contador++;
        }
        sc.close();
    }
}
