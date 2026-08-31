import java.util.Scanner;
public class Ex4 {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println ("Digite sua idade");
        int idade = entrada.nextInt();
        int futuro = idade + 10;
        System.out.println ("Daqui a 10 anos você terá " + futuro + " anos");

    }
}
