public class Caminhao2 extends Veiculo3 implements Revisavel{
    private int quantidadeDeEixos;
    private double kmUltimaRevisao;

    public Caminhao2(String placa, String modelo, int ano, double quilometragem, int quantidadeDeEixos, double kmUltimaRevisao){
        super(placa, modelo, ano, quilometragem);
        this.quantidadeDeEixos = quantidadeDeEixos;
        this.kmUltimaRevisao = kmUltimaRevisao;
    }

    @Override
    public void realizarRevisao(){
        this.kmUltimaRevisao = getQuilometragem();
        System.out.println("Revisão do caminhão " + getModelo() + " realizada com sucesso");
    }

    @Override
    public boolean precisaRevisao(){
        return (getQuilometragem() - this.kmUltimaRevisao) >= 20000;
    }

    @Override
    public void exibirDados(){
        System.out.println("Modelo: " + getModelo() + " - Ano: " + getAno() + " - Placa: " + getPlaca() + " - Quilometragem: " + getQuilometragem());
    }

    @Override
    public double calcularCustoManutencao(){
        double custoBase = 2000;
        double taxaDesgaste = getQuilometragem() * 1.5;
        return custoBase +  taxaDesgaste + (this.quantidadeDeEixos * 100);
    }


}
