import java.util.Scanner;
public class Ex30 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = sc.nextInt();
        int contador = 0;
        int qtdPares = 0;
        while (contador <= num){
            if (contador % 2 ==0){
                qtdPares ++;
            }

            contador++;
        }
        System.out.println(qtdPares);


    }
}
