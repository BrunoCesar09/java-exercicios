import java.util.Scanner;
public class Ex29 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        for (int contador = num; contador>= 0; contador--){
            System.out.println(contador);
        }
        sc.close();

    }
}
