import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("O menor número é: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("O menor número é: " + num2);
        } else
            System.out.println("O menor número é: " + num3);
    }
        }
