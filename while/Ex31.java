import java.util.Scanner;
public class Ex31 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = sc.nextInt();
        int soma = 0;
        int contador = 0;
        while (contador <= n){
            if (contador % 2 ==0){
                soma += contador ;

            }
            contador++;
        }
        System.out.println("A soma dos pares é: " + soma);
        sc.close();

    }
}
