import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 1234;
        int senha = 0;
        int tentativas = 1;
            do {
                System.out.println("Digite sua senha: ");
                senha = sc.nextInt();
                tentativas++;
            }while (senha != senhaCorreta && tentativas<= 3);

        if (senha == senhaCorreta){
            System.out.println("Login realizado com sucesso!");
        }
        else{
            System.out.println("Acesso bloqueado");
        }

    }
}


