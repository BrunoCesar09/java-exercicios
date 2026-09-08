import java.util.Scanner;

public class Ex76 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número:");
            numeros[i] = sc.nextInt();
        }
        int somaMaioresQue10 = 0;
        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] > 10){
                somaMaioresQue10 += numeros[i];
            }

        }
        System.out.println("A soma dos números maiores que 10 é: " + somaMaioresQue10);
        sc.close();
    }
}
