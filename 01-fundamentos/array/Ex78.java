import java.util.Scanner;
public class Ex78 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int[]numeros = new int[5];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número");
            numeros[i] = sc.nextInt();
        }
        int menor = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if(menor > numeros [i]){
                menor = numeros[i];
            }
        }
        System.out.println("O menor número é: " + menor);
        sc.close();
    }
}
