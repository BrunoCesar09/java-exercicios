public class Caminhao extends Veiculo{
    private int qtdEixo;

    public Caminhao(String placa, double custoManutencao, int qtdEixo){
        super(placa, custoManutencao);
        setQtdEixo(qtdEixo);
    }

    public int getQtdEixo(){
        return this.qtdEixo;
    }

    public void setQtdEixo(int qtdEixo){
        if(qtdEixo <= 0){
            System.out.println("Erro. Informe uma quantidade de eixos válida");
            this.qtdEixo = 0;
        }
        else{
            this.qtdEixo = qtdEixo;
        }
    }

    @Override
    public double calcularCustoManutencao(){
        return getCustoBaseManutencao() + (getQtdEixo()*150);
    }

}
