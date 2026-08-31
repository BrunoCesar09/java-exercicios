import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 1234;
        int senha = 0;
        do {
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();
        }
        while (senha != senhaCorreta);
        if (senha == senhaCorreta) {
            System.out.println("A senha está correta");

        }
    }
}
