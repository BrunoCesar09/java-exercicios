import java.util.Scanner;
import java.util.ArrayList;
public class Ex95 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        ArrayList<String> estoqueEnvio = new ArrayList<>();
        estoqueEnvio.add("TECLADO");
        estoqueEnvio.add("MOUSE");
        estoqueEnvio.add("MONITOR");
        estoqueEnvio.add("HEADSET");
        System.out.println("Qual produto deseja cancelar o envio?");
        String nomeProduto = sc.nextLine();
        nomeProduto = nomeProduto.toUpperCase();
        if(estoqueEnvio.contains(nomeProduto)){
            estoqueEnvio.remove(nomeProduto);
            System.out.println("Produto removido com sucesso");
        }
        else{
            System.out.println("ERRO! Produto não encontrado na lista de envio");
        }
        sc.close();
    }
}

