import java.util.Scanner;
public class Ex84 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int[] salasVisitadas = new int[5];
        for(int i = 0; i < salasVisitadas.length; i++){
            System.out.println("Sala visitada: ");
            salasVisitadas[i] = sc.nextInt();
        }
        boolean suspeitoDetectado = false;
        for(int i = 0; i < salasVisitadas.length; i++){
            if(salasVisitadas[i] == 13){
                suspeitoDetectado = true;
            }
        }
        if (suspeitoDetectado){
            System.out.println("PROTOCOLO DE SEGURANÇA ACIONADO: Alguém tentou entrar na sala interditada!");
        }
        else{
            System.out.println("Portaria limpa: Nenhum incidente detectado hoje.");
        }
        sc.close();
    }
}
