import java.util.Locale;
import java.util.Scanner;
public class Ex89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu email: ");
        String email = sc.nextLine();
        System.out.println("Digite uma senha: ");
        String senha = sc.nextLine();
        boolean emailCorreto = false;
        if (email.contains("@") && senha.length() >= 6 ) {
            emailCorreto = true;
            email = email.toLowerCase();
            System.out.println("E-mail padronizado para o sistema: " + email);
        }
        else{
            if (senha.length() < 6){
                System.out.println("Erro: A senha deve ter pelo menos 6 dígitos.");
            }
            if (!email.contains("@")){
                System.out.println("Erro: E-mail incorreto.");
            }
        }
        sc.close();
    }
}