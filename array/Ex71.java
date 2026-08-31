import java.util.Scanner;
public class Ex71 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[]numeros = new int[5];
        for (int i= 0; i < numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        int somaPares = 0;
        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                somaPares += numeros[i];
            }
        }
        System.out.println(somaPares);
        sc.close();
    }
}
