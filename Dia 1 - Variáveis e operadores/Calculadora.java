import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float n1 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        float n2 = sc.nextFloat();
        float soma = n1 + n2;
        float subtracao = n1 - n2;
        float divisao = n1 / n2;
        float multiplicacao = n1 * n2;
        System.out.println("Soma: " + soma);
        System.out.println("Divisão: " + divisao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        sc.close();



    }
}
