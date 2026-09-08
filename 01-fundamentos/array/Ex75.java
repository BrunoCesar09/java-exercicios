import java.util.Scanner;

public class Ex75 {

    // SEU PRIMEIRO MÉTODO: Ele recebe um número e diz se é maior que 10
    public static boolean ehMaiorQue10(int numero) {
        if (numero > 10) {
            return true;  // Devolve verdadeiro se for maior
        } else {
            return false; // Devolve falso se não for
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para testar o método:");
        int valor = sc.nextInt();

        // Chamando o método dentro do IF do main
        if (ehMaiorQue10(valor)) {
            System.out.println("O número " + valor + " é maior que 10!");
        } else {
            System.out.println("O número " + valor + " NÃO é maior que 10.");
        }

        sc.close();
    }
}
