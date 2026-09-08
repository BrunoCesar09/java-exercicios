import java.util.Scanner;
public class Ex73 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[]numeros = new int[5];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Digite o número que quer encontrar: ");
        int numeroProcurado = sc.nextInt();
        int quantidadeNumeroProcurado = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeroProcurado == numeros[i]){
                quantidadeNumeroProcurado++;

            }
        }
        System.out.println("A quantidade de vezes que o número aparece é: " + quantidadeNumeroProcurado);

    }
}
