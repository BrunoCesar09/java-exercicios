import java.util.Scanner;

public class Ex41 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int qtdPares = 0;
        int qtdImpares = 0;
        for (int contador=1; contador <=10; contador++){
            System.out.println("Digite um número");
            num = sc.nextInt();
            if (num % 2 == 0){
                qtdPares++;
            }
            else {
                qtdImpares++;
            }
        }
        System.out.println("A quantidade de pares é: " + qtdPares);
        System.out.println("A quantidade de impares é: " + qtdImpares);
        sc.close();

    }
}
