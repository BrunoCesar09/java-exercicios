
public class EX50 {
    public static int maiorNumero (int a, int b){
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[]args){
        int maior = maiorNumero(15,8);
        System.out.println("O maior número é: " + maior);
    }
}
