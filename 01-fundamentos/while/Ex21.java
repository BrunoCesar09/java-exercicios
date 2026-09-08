import java.util.Scanner;
public class Ex21 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        int num2 = 1;
        while (num2 <= num){
            System.out.println(num2);
            num2++;

        }
    }
}
