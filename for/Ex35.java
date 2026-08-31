import java.util.Scanner;

public class Ex35 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int contador = 1; contador <=5; contador ++){
            System.out.println("Digite um número");
            int num = sc.nextInt();
            soma += num;
        }
        System.out.print("A soma é: " + soma + "\nA média é: " + (soma/5));
    }
}
