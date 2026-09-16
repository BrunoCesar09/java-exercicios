public class Ex116 {
    public static void main(String[] args) {
        GerenciadorFrota gerenciador = new GerenciadorFrota();

        Carro carro1 = new Carro("ABC-1234", "Civic", 2020, 25000, 10000);
        Caminhao2 caminhao1 = new Caminhao2("XYZ-9876", "Volvo FH", 2018, 30000, 6, 20000);
        Moto moto1 = new Moto("CG 160", "KLY-5544", 2022, 12000, 160);

        gerenciador.adicionarVeiculo(carro1);
        gerenciador.adicionarVeiculo(caminhao1);
        gerenciador.adicionarVeiculo(moto1);

        System.out.println("=== RELATÓRIO DE CUSTOS DE MANUTENÇÃO ===");
        gerenciador.exibirCustosTotais();

        System.out.println("\n========================================");

        System.out.println("=== EXECUTANDO REVISÕES GERAIS ===");
        gerenciador.realizarRevisoesGerais();
    }
}

