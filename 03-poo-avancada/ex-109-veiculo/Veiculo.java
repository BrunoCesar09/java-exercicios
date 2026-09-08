public class Veiculo {
    private String placa;
    private double custoBaseManutencao;

    public Veiculo(String placa, double custoBaseManutencao){
        this.placa = placa;
        setCustoBaseManutencao(custoBaseManutencao);

    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public double getCustoBaseManutencao() {
        return this.custoBaseManutencao;
    }

    public void setCustoBaseManutencao(double custoBaseManutencao){
        if(custoBaseManutencao <= 0){
            System.out.println("Erro. Valor inválido.");
            this.custoBaseManutencao = 0;
        }
        else{
            this.custoBaseManutencao = custoBaseManutencao;
        }
    }

    public double calcularCustoManutencao(){
        return custoBaseManutencao;
    }

    public void exibirRelatorio(){
        System.out.println("Placa do veículo: " + getPlaca() + " - Custo de manutenção: R$" + calcularCustoManutencao());
    }
}
