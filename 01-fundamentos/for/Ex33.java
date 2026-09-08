import java.util.Scanner;

public class Ex33 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int maior = sc.nextInt();
        for (int contador = 1; contador < 4; contador++) {
            System.out.println("Digite um número");
            int num = sc.nextInt();
            if (num >= maior) {
                maior = num;
            }
        }
        System.out.println("O número maior é: " + maior);
        sc.close();

    }
}
