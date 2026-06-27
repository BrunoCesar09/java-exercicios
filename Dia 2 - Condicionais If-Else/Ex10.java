import java.util.Scanner;
public class Ex10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println(num1);
        }
        else if (num2 > num1) {
            System.out.println(num2);
        }
        else{
            System.out.println("Os números são iguais");
        }
        sc.close();
    }
}
