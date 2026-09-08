import java.util.Scanner;
public class Ex26 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        for (int contador = 1; contador <=10; contador++){
            System.out.println(num + " x " + contador + " = " + (num*contador));

        }
        sc.close();
    }
}
