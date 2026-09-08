import java.util.Scanner;
import java.util.ArrayList;
public class Ex93 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> historicoDepositos = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            System.out.println("Digite o valor do depósito: ");
            double deposito = sc.nextDouble();
            historicoDepositos.add(deposito);
        }
        double somaTotal = 0;
        for(int i = 0; i < historicoDepositos.size(); i++){
            somaTotal += historicoDepositos.get(i);
            if(historicoDepositos.get(i) >= 5000){
                System.out.println("Notificação enviada ao Banco Central: Depósito de alto valor detectado!");
            }
        }
        System.out.println("Total acumulado na conta: " + somaTotal);
        sc.close();
    }
}
