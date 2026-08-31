import java.util.Scanner;

public class Ex43 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int qntNum = -1;
        int soma = 0;
        int media = 0;
        do {
            System.out.println("Digite um número");
            num = sc.nextInt();
            qntNum++;
            soma += num;
        }
        while (num != 0);
        media = soma/qntNum;
        System.out.println("A quantidade de números é: " + qntNum);
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média entre os números é: " + media);

    }
}
