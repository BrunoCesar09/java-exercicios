import java.util.Scanner;
public class Ex65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (maior < numeros[i]) {
                maior = numeros[i];
            }
            if (menor > numeros[i]) {
                menor = numeros[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }
}
