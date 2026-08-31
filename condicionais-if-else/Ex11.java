import java.util.Scanner;
public class Ex11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();
        if (nota1 >= 7) {
            System.out.println("Aluno aprovado com nota: " + nota1);
        }
        else {
            System.out.println("Aluno reprovado com nota: "+ nota1);

        }
        sc.close();
    }
}
