import java.util.Scanner;
public class Ex24 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        int contador = 0;
        while (contador <=num) {
            if (contador % 2 == 0) {
                System.out.println(contador);

            }
            else {
            }
            contador++;
        }

        }
    }
