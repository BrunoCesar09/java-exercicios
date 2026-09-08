public class PagamentoPix extends Pagamento{
    private String chavePix;

    public PagamentoPix(double valorBase, String chavePix){
        super(valorBase);
        this.chavePix = chavePix;
    }
    public String getChavePix(){
        return this.chavePix;
    }
    public void setChavePix(String chavePix){
        this.chavePix = chavePix;
    }

    @Override
    public double calcularValorFinal(){
        return getValorBase() * 0.90;
    }
}
