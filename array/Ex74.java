import java.util.Scanner;
public class Ex74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número");
            numeros[i] = sc.nextInt();
        }
        int Maiorque10 = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 10) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }

}
