import java.util.Scanner;
public class Ex13 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = sc.nextDouble();
        if (num >= 10 && num <= 20){
            System.out.println("Número está entre 10 e 20");
        }
        else {
            System.out.println("Número fora do intervalo");
        }
        sc.close();
    }

}
