import java.util.Scanner;

public class ex59 {

    public static double depositar(double saldo, double valor) {
        return saldo + valor;
    }

    public static double sacar(double saldo, double valor) {
        return saldo - valor;
    }

    public static void menu() {
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Sair");
    }

    public static void consultarSaldo(double saldo) {
        System.out.println("Seu saldo é de: " + saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int opcao = 0;
        do {
            menu();
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida");}
            else{
                switch (opcao) {
                    case 1:
                        System.out.println("Digite a quantia desejada: ");
                        double valorDeposito = sc.nextDouble();
                        saldo = depositar(saldo, valorDeposito);
                        break;
                    case 2:
                        System.out.println("Digite a quantia desejada: ");
                        double valorSaque = sc.nextDouble();
                        saldo = sacar(saldo, valorSaque);
                        break;
                    case 3:
                        consultarSaldo(saldo);
                        break;
                    case 4:
                        System.out.println("Sistema fechado");

                }
            }
        }
        while (opcao != 4);
    }
}