public class Moto extends Veiculo3{
    private int quantidadeCilindradas;

    public Moto(String modelo, String placa, int ano, double quilometragem, int quantidadeCilindradas){
        super(placa, modelo, ano, quilometragem);
        this.quantidadeCilindradas = quantidadeCilindradas;
    }

    @Override
    public void exibirDados(){
        System.out.println("Modelo: " + getModelo() + " - Ano: " + getAno() + " - Placa: " + getPlaca() + " - Quilometragem: " + getQuilometragem());
    }

    @Override
    public double calcularCustoManutencao(){
        double custoBase = 500;
        double taxaDesgaste = getQuilometragem() * 0.2;
        double custoCilindrada = 0;
        if (this.quantidadeCilindradas > 160){
            custoCilindrada = this.quantidadeCilindradas * 0.4;
        }
        else{
            custoCilindrada = this.quantidadeCilindradas *0.2;
        }
        return custoBase + taxaDesgaste + custoCilindrada;
    }
}
