import java.util.Scanner;

public class Ex60 {
    public static double calcularMedia(double a, double b){
        return (a+b)/2;
    }
    public static void verificarAprovacao(double media){
        if (media >= 7 ){
            System.out.println("Aluno aprovado com média: " + media);
        }
        else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = calcularMedia(nota1, nota2);
        verificarAprovacao(media);
        sc.close();
    }

}
