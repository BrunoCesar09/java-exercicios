import java.util.Scanner;
public class Ex64 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        int media = soma/ numeros.length;
        System.out.println(soma);
        System.out.println(media);
        sc.close();
    }
}
