public class PagamentoCartao extends Pagamento{
    private int numeroParcelas;

    public PagamentoCartao(double valorBase, int numeroParcelas){
        super(valorBase);
        this.numeroParcelas = numeroParcelas;
    }

    public int getNumeroParcelas(){
        return this.numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas){
        this.numeroParcelas = numeroParcelas;
    }

    @Override

    public double calcularValorFinal(){
        return getValorBase() * 1.05;
    }
}
