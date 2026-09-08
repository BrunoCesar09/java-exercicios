import java.util.Scanner;

public class Ex58 {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static void menu() {
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        System.out.println("Digite a opção desejada:");
        int opcao = sc.nextInt();
        if (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida");
        } else {
            System.out.println("Digite um número");
            int a = sc.nextInt();
            System.out.println("Digite um número");
            int b = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("A soma é: " + somar(a, b));
                    break;
                case 2:
                    System.out.println("A subtração é: " + subtrair(a, b));
                    break;
                case 3:
                    System.out.println("A multiplicação é: " + multiplicar(a, b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Não existe divisão por 0");
                    } else {
                        System.out.println("A dividão é: " + dividir(a, b));
                    }
                    break;


            }
            sc.close();

        }

    }
}
