import java.util.Scanner;
public class Ex5 {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println ("Digite a temperatura em Celcius");
        double celcius = entrada.nextDouble();
        double fahrenheit = (celcius * 1.8) + 32;
        System.out.println ("O resultado da conversão é " + fahrenheit);


    }
}
