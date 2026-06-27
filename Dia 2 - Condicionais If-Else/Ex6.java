import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Digite a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println ("Digite a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 60.0) {
            System.out.println("Aluno aprovado com media: " + media);
        }
        else {
            System.out.println("Aluno reprovado com média: " + media);
        }
        sc.close();

    }


}
