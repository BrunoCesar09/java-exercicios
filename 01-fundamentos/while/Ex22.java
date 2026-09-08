import java.util.Scanner;
public class Ex22 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        int contador = 1;
        int soma = 0;
        while (contador <= num) {
             soma = soma + contador;
            contador++;}
        System.out.println("A soma é " + soma);







    }
};
