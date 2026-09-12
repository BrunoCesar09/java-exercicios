public class Ex114 {
    public static void main(String[] args) {
        CentralDeComando central = new CentralDeComando();

        Dispositivo lampada = new LampadaInteligente("Lâmpada da Sala");
        Dispositivo fechadura = new FechaduraEletronica("Fechadura Principal", "1234");

        System.out.println("=== TESTANDO LÂMPADA (Sem senha) ===");
        central.autenticarEAcionar(lampada, "qualquer_senha");

        System.out.println("\n=== TESTANDO FECHADURA (Senha Errada) ===");
        central.autenticarEAcionar(fechadura, "0000");

        System.out.println("\n=== TESTANDO FECHADURA (Senha Correta) ===");
        central.autenticarEAcionar(fechadura, "1234");
    }
}
