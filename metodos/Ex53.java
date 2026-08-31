public class Ex53 {
    public static int maior(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }
        else if (b > c){
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[]args){
        int numMaior = maior(8, 15, 12);
        System.out.println(numMaior);
    }
}
