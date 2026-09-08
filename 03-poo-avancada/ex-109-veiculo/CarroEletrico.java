public class CarroEletrico extends Veiculo{
    private double qtdKwh;

    public CarroEletrico(String placa, double custoManutencao, double qtdKwh){
        super(placa, custoManutencao);
        setQtdKwh(qtdKwh);
    }

    public double getQtdKwh(){
        return this.qtdKwh;
    }

    public void setQtdKwh(double qtdKwh){
        if(qtdKwh <=0){
            System.out.println("Erro. Valor inválido");
            this.qtdKwh = 0;
        }
        else{
            this.qtdKwh = qtdKwh;
        }
    }

    @Override
    public double calcularCustoManutencao(){
        return getCustoBaseManutencao() * 0.80;
    }
}
