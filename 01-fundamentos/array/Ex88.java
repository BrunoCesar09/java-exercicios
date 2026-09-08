import javax.xml.transform.Source;
import java.util.Scanner;
public class Ex88 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String [] nomesPacientes = new String[5];
        int [] idade = new int[5];
        for (int i = 0; i < idade.length; i++){
            System.out.println("Informe o nome do paciente: ");
            nomesPacientes[i] = sc.nextLine();
            System.out.println("Informe a idade do paciente: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
        }
        boolean idadeCritica = false;
        for (int i = 0; i < idade.length; i++){
            System.out.println(nomesPacientes[i]);
            System.out.println(idade[i]);
            if (idade[i] > 80){
                idadeCritica = true;
            }
        }
        if(idadeCritica){
            System.out.println("ALERTA: Prioridade máxima encontrada no lote! Chamar enfermeiro chefe.");
        }
        else {
            System.out.println("Lote de triagem processado. Nenhuma prioridade crítica encontrada.");
        }
        sc.close();
    }
}
