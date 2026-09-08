import java.util.Scanner;
public class Ex27 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        int soma = 0;
        for (int contador = 1; contador <= num; contador++){
            soma += contador;
        }
        System.out.println(soma);
    }

}
