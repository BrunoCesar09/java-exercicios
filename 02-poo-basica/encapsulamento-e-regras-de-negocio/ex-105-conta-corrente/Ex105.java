public class Ex105 {
    public static void main(String[]args){
        ContaCorrente c1 = new ContaCorrente("Mitla Yuki", 526842, 5000, 500);
        c1.depositar(500);
        c1.sacar(100);
        c1.exibirExtrato();
    }
}
