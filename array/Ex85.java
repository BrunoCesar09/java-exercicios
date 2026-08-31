import java.util.Scanner;
public class Ex85 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int[] loteLatas = new int[5];
        for(int i = 0; i < loteLatas.length; i++){
            System.out.println("Quantidade de mililitros: ");
            loteLatas[i] = sc.nextInt();
        }
        boolean loteDefeituoso = false;
        int posicaoDoDefeito = -1;
        for (int i = 0; i < loteLatas.length; i++){
            if(loteLatas[i] < 300){
                loteDefeituoso = true;
                posicaoDoDefeito = i;
                break;
            }
        }
        if(loteDefeituoso){
            System.out.println("LOTE COM DEFEITO: LATA Nº " + (posicaoDoDefeito + 1));
        }
        else {
            System.out.println("LOTE APROVADO");
        }
        sc.close();
    }
}
