import java.util.Scanner;
public class Ex17 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a medida de um lado:");
        int lado1 = sc.nextInt();
        System.out.println("Digite a medida do segundo lado:");
        int lado2 = sc.nextInt();
        System.out.println("Digite a medida do terceiro lado:");
        int lado3 = sc.nextInt();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Forma um triângulo");
        }
        else{
            System.out.println("Não forma um triângulo");
        }
        sc.close();
    }


}
