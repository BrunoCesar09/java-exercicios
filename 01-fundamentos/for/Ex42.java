import java.util.Scanner;

public class Ex42 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int contador = 1; contador <=5; contador++){
            System.out.println("Digite um número");
            int num = sc.nextInt();
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A diferença entre os números é: " + (maior - menor));
        sc.close();

    }
}
