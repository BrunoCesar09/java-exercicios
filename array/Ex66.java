import java.util.Scanner;
public class Ex66 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        int qtdPares = 0;
        int qtdImpares = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                qtdPares++;
            }
            else{
                qtdImpares++;
            }
        }
        System.out.println(qtdPares);
        System.out.println(qtdImpares);
    }
}
