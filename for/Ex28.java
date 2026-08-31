import java.util.Scanner;
public class Ex28 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        for (int contador = 1; contador <= num; contador++){
            if (contador % 2 ==1){
                System.out.println(contador);
            }
        }
    }
}
