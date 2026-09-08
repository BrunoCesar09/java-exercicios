public class Ex109 {
    public static void main(String[]args){
        Caminhao c1 = new Caminhao("KND-5268", 1000, 8);
        CarroEletrico ce1 = new CarroEletrico("MJN-9898", 1000, 10);
        c1.exibirRelatorio();
        ce1.exibirRelatorio();
    }
}
