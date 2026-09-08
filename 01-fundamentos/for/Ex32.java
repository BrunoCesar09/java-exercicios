import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        for (int contador = 1; contador <= 5; contador++) {

            System.out.println("Digite um número:");
            int numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior número: " + maior);

        sc.close();
    }
}