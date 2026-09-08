import java.util.Scanner;

public class Ex67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        // Preenche o vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = sc.nextInt();
        }

        // Número a ser procurado
        System.out.println("Digite o número que deseja encontrar:");
        int numeroProcurado = sc.nextInt();

        boolean encontrado = false;

        // Procura o número
        for (int i = 0; i < numeros.length; i++) {
            if (numeroProcurado == numeros[i]) {
                encontrado = true;
                break; // Para de procurar, pois já encontrou
            }
        }

        // Resultado
        if (encontrado) {
            System.out.println("Número encontrado!");
        } else {
            System.out.println("Número não encontrado!");
        }

        sc.close();
    }
}