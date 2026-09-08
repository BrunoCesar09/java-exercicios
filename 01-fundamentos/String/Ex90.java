import java.util.Scanner;

public class Ex90 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira o cumpom de desconto:");
        String cupom = sc.nextLine();
        cupom = cupom.trim().toUpperCase();
        if(cupom.equals("PROMO10")){
            System.out.println("Cupom aplicado com sucesso! Você ganhou 10% de desconto!");
        }
        else{
            System.out.println("Cupom inválido");
        }
        sc.close();
    }
}
