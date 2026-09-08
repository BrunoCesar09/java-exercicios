import java.util.Scanner;
public class Ex70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = sc.nextInt();
        }
        int qntNumerosNgtv = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                qntNumerosNgtv++;

            }
        }
        System.out.println(qntNumerosNgtv);
        sc.close();
    }
}
