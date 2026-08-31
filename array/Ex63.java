import java.util.Scanner;
public class Ex63 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        for(int i = 0; i <5; i++){
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}
