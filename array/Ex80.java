import java.util.Scanner;
public class Ex80 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int[]numeros = new int[5];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        int maiorNumero = numeros[0];
        int posicaoMaior = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
                posicaoMaior = i;
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("Está na posição: " + posicaoMaior);
        sc.close();
    }

}
