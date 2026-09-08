import java.util.Scanner;
public class Ex16 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();
        System.out.println("Escolha a operação matemática:\n. 1.Soma\n. 2.Subtração\n. 3.Divisão\n. 4.Multiplicação\n.");
        int op = sc.nextInt();
        if (op == 1){
            System.out.println("O resultado da soma é: " + (num1 + num2));
        }
        else if (op == 2){
            System.out.println("O resultado da subtração é: " + (num1 - num2));
        }
        else if (op == 3){
            System.out.println("O resultado da divisão é: " + (num1 / num2));
        }
        else if (op == 4){
            System.out.println("O resultado da multiplicação é: " + (num1 * num2));
        }
        else {
            System.out.println("Operação inválida, por favor escolha o número correspondente à operação desejada");
        }
        sc.close();

    }
}
