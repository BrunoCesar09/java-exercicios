import java.util.Scanner;
public class Ex3 {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println ("Digite a altura do retângulo");
        double altura = entrada.nextDouble();
        System.out.println ("Digite a largura do retângulo");
        double largura = entrada.nextDouble();
        double area = altura * largura;
        System.out.println ("A área do retângulo é " + area);

    }

}
