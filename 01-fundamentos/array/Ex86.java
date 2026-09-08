import java.util.Scanner;
public class Ex86 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double[] valoresFrete = new double[6];
        for(int i = 0; i < valoresFrete.length; i++){
            System.out.println("Digite o valor do frete: ");
            valoresFrete[i] = sc.nextDouble();
        }
        double valorTotal = 0;
        double maiorValor = 0;
        int posicaoMaiorValor = 0;
        int maioresQue50 = 0;
        for(int i = 0; i < valoresFrete.length; i++){
            valorTotal += valoresFrete[i];
            if(valoresFrete[i] > maiorValor){
                maiorValor = valoresFrete[i];
                posicaoMaiorValor = i;
            }
            if(valoresFrete[i] > 50){
                maioresQue50++;
            }
        }
        System.out.println("Valor total gasto em fretes: " + valorTotal);
        System.out.println("Frete mais caro: " + (posicaoMaiorValor + 1) + " (" + maiorValor + ")");
        System.out.println("Frete maiores que 50: " + maioresQue50);
        sc.close();
        }

    }

