import java.util.Scanner;
public class Ex62 {
    public static double calcularSalario(double horas, double valorHora){
        return horas * valorHora;
    }
    public static double calcularBonus(double salario){
        if (salario >= 3000){
            return salario + 500;
        }
        else {
            return salario;
        }
    }
    public static void mostrarSalario(double salario){
        System.out.println("Salário final: R$" + salario);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de horas trabalhadas:");
        double valorHoras = sc.nextDouble();
        System.out.println("Horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();
        double salario = calcularSalario(valorHoras,horasTrabalhadas);
        salario = calcularBonus(salario);
        mostrarSalario(salario);
        sc.close();
    }
}
