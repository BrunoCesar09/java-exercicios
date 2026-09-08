import java.util.Scanner;
public class Ex87 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String[] placas = new String[4];
        int[] horasEstacionadas = new int[4];
        for(int i = 0; i < placas.length; i++){
            System.out.println("Digite a placa do carro: ");
            placas[i] = sc.nextLine();

            System.out.println("Quantidade de horas: ");
            horasEstacionadas[i] = sc.nextInt();
            sc.nextLine();
        }
        int maiorTempoEstacionado = 0;
        String posicaoMaiorTempo = placas[0];
        for(int i = 0; i < placas.length; i++){
            String placaCarro = placas[i];
            int valorHoraTotal = horasEstacionadas[i] * 10;
            System.out.println("Carro " + (placaCarro) + ": R$" + valorHoraTotal);
            if (valorHoraTotal > maiorTempoEstacionado){
                maiorTempoEstacionado = valorHoraTotal;
                posicaoMaiorTempo = placas[i];

            }
        }
        System.out.println("O carro com maior tempo estacionado hoje é: " + posicaoMaiorTempo );
        sc.close();
    }
}
