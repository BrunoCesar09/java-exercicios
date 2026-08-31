import java.util.Scanner;
public class Ex19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 4");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Água");
                break;
            case 2:
                System.out.println("Refrigerante");
                break;
            case 3:
                System.out.println("Suco");
                break;
            case 4:
                System.out.println("Café");
                break;
            default:
                System.out.println("Opção inválida");
        }
        sc.close();}
        }


