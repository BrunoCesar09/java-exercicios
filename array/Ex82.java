import java.util.Scanner;
public class Ex82 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[]estoque = new int[5];
        for(int i = 0; i < estoque.length; i++){
            System.out.println("Informe a quantidade de produtos: ");
            estoque[i] = sc.nextInt();
        }
        int maiorEstoque = estoque[0];
        int menorEstoque = estoque[0];
        int estoqueTotal = 0;
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        for(int i = 1; i < estoque.length; i++) {
            if (estoque[i] > maiorEstoque) {
                maiorEstoque = estoque[i];
                posicaoMaior = i;

            } else if (estoque[i] < menorEstoque){
                menorEstoque = estoque[i];
                posicaoMenor = i;
            }
        }
        for(int i = 0; i < estoque.length; i++){
            estoqueTotal+= estoque[i];
        }
        System.out.println("Menor estoque: Produto " + posicaoMenor + " (" + menorEstoque + ")");
        System.out.println("Maior estoque: Produto " + posicaoMaior + " (" + maiorEstoque + ")");
        System.out.println("Estoque total: " + estoqueTotal);
        sc.close();
    }
}
