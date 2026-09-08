
import java.util.Scanner;

public class Ex34 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int menor = Integer.MAX_VALUE;
        for (int contador = 1; contador <=5; contador++){
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            if (num < menor){
                menor = num;
            }

        }
        System.out.println("O menor número é: " + menor);
        sc.close();
    }
}
