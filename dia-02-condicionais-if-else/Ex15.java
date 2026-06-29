import java.util.Scanner;
public class Ex15 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano:");
        int ano = sc.nextInt();
        if (ano > 2000) {
            System.out.println("O ano é maior que 2000.");
        } else if (ano < 2000) {
            System.out.println("O ano é menor que 2000");
        }
        else {
            System.out.println("O ano é 2000.");
        }
        sc.close();

    }
}
