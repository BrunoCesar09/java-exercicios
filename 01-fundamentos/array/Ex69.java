import java.util.Scanner;
public class Ex69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número");
            numeros[i] = sc.nextInt();
        }
        int qtdMaiorque10 = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 10) {
                qtdMaiorque10++;

            }
        }
        System.out.println("A quantidade de números maior que 10 é: " + qtdMaiorque10);
        sc.close();
    }

}
