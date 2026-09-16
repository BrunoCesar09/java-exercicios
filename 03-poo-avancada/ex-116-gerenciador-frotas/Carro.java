public class Carro extends Veiculo3 implements Revisavel{
    private double kmUltimaRevisao;

    public Carro(String placa, String modelo, int ano, double quilometragem, double kmUltimaRevisao){
        super(placa, modelo, ano, quilometragem);
        this.kmUltimaRevisao = kmUltimaRevisao;
    }

    @Override
    public void realizarRevisao(){
        this.kmUltimaRevisao = getQuilometragem();
        System.out.println("Revisão do carro " + getModelo() + " realizada com sucesso!");
    }

    @Override
    public boolean precisaRevisao(){
        return (getQuilometragem() - this.kmUltimaRevisao) >= 10000;
    }

    @Override
    public void exibirDados(){
        System.out.println("Modelo: " + getModelo() + " - Ano: " + getAno() + " - Placa: " + getPlaca() + " - Quilometragem: " + getQuilometragem());
    }
    @Override
    public double calcularCustoManutencao(){
        double custoBase = 1000;
        double taxaDesgaste = getQuilometragem() * 0.5;
        return custoBase + taxaDesgaste;
    }
}
