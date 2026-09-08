public class Pagamento {
    private double valorBase;

    public Pagamento(double valorBase){
        setValorBase(valorBase);
    }

    public double getValorBase(){
        return this.valorBase;
    }
    public void setValorBase(double valorBase){
        if(valorBase <= 0){
            System.out.println("Erro. Valor inválido.");
            this.valorBase = 0;
        }
        else{
            this.valorBase = valorBase;
        }
    }
    public double calcularValorFinal(){
        return this.valorBase;
    }
    public void exibirRecibo(){
        System.out.println("Valor: R$ " + getValorBase() + " - Valor final: R$ " + calcularValorFinal());
    }
}
