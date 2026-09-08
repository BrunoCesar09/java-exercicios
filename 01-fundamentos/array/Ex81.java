import java.util.Scanner;
public class Ex81 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[]numeros = new int[6];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número:");
            numeros[i] = sc.nextInt();
        }
        int qntImpares = 0;
        System.out.println("Os números pares são: ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.println(numeros[i]);
            }
            else{
                qntImpares++;

            }
        }
        System.out.println("A quantidade de números ímpares é: " + qntImpares);
        sc.close();
    }
}
