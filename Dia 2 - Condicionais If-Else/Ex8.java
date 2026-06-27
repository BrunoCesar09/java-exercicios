import java.util.Scanner;
public class Ex8 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("Número positivo: " + n);
        } else {
            System.out.println("Número negativo: " + n);

        }
    }
}
