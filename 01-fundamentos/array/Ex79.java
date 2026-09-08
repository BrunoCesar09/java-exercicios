import java.util.Scanner;
public class Ex79 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double[]notaAluno = new double[4];
        for (int i = 0; i < notaAluno.length; i++){
            System.out.println("Digite a nota do aluno: ");
            notaAluno[i] = sc.nextDouble();
        }
        double somaNotas = 0;
        for (int i= 0; i < notaAluno.length; i++){
            somaNotas += notaAluno[i];
        }
        double media = somaNotas / notaAluno.length;
        if (media >= 7){
            System.out.printf("Aluno aprovado com média: %.1f%n " , media);
        }
        else{
            System.out.printf("Aluno em recuperação com média: %.1f%n" , media);
        }
        sc.close();
    }
}
