import java.util.Scanner;
public class Ex61 {
    public static double calcularTotal(int a, double b) {
        if (a * b >= 100) {
            return (a * b) * 0.90;
        }
        else{
            return a * b;
        }
    }
        public static void mostrarCompra ( double total) {
                System.out.println("O total da sua compra ficou: R$" + total);
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantidade de produtos: ");
            int qtdProduto = sc.nextInt();
            System.out.println("Digite o valor do produto: ");
            double valorProduto = sc.nextDouble();
            double total = calcularTotal(qtdProduto, valorProduto);
            mostrarCompra(total);
            sc.close();
        }
    }

