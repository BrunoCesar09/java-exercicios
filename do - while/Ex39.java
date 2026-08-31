import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        double num1 = 0;
        double num2 = 0;
            do {
                System.out.println(" -- Menu -- \n1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n0. Sair");
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite dois números");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("A soma é: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Digite dois números");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("A subtração é: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Digite dois números");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("A multiplicação é: " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("Digite dois números");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("A divisão é: " + (num1 / num2));
                        break;

                }

            }
            while (opcao != 0);
            sc.close();
    }

}