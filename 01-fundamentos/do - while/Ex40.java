import java.util.Scanner;
public class Ex40 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int opcao = 0;
        double saldo = 1000;
        double valor = 0;
        do {
            System.out.println(" -- Menu --");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    valor = sc.nextDouble();
                    saldo += valor;
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    valor = sc.nextDouble();
                    if (valor <= saldo){
                        saldo -= valor;
                    }
                    else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Seu saldo é de: " + saldo);
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
        while (opcao != 0);
    }
}
