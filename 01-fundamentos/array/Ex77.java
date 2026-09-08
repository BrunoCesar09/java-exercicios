import java.util.Scanner;
public class Ex77 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int[]numeros = new int[5];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        int maior = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if (maior < numeros[i]){
                maior = numeros[i];
            }

        }
        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}
