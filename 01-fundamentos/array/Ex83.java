import java.util.Scanner;
public class Ex83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] compras = new double[5];
        for (int i = 0; i < compras.length; i++) {
            System.out.println("Digite o valor da compra: ");
            compras[i] = sc.nextDouble();
        }
        double somaTotal = 0;
        double limiteCompra = 1000;
        for (int i = 0; i < compras.length; i++) {
            somaTotal += compras[i];
        }
        System.out.println("Total gasto no dia: " + somaTotal);
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > limiteCompra) {
                System.out.println("ALERTA DISPARADO");

            }

        }
        sc.close();
    }
}

