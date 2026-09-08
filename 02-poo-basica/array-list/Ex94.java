import java.util.ArrayList;
import java.util.Scanner;
public class Ex94 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precosProdutos = new ArrayList<>();
        while (true) {
            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            if(preco != 0){
                precosProdutos.add(preco);
            }
            else{
                break;
            }
        }
        double somaTotal = 0;
        for (int i = 0; i < precosProdutos.size(); i++){
            somaTotal += precosProdutos.get(i);

        }
        System.out.println("A compra total ficou no valor de: R$ " + somaTotal);
        System.out.println("Quantidade de itens comprados: " + precosProdutos.size());
        sc.close();
    }
}
