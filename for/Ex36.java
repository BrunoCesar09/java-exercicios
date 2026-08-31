import java.util.Scanner;

public class Ex36 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double soma = 0;
        int qtdPares = 0;
        double media = 0;
        for(int contador = 1; contador <= 5; contador ++){
            System.out.println("Digite um número");
            int num = sc.nextInt();
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
        }
            if (num %2 == 0){
                qtdPares++;
            }
            soma += num;
            media = soma/5;

        }
        System.out.println("O maior número é: " + maior + "\nO menor número é: " + menor + "\nA soma dos números é: " + soma + "\nA quantidade de pares é: " + qtdPares + "\nA média dos número é: " + media);

    }
}
