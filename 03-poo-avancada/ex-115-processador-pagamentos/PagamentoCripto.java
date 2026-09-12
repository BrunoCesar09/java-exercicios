public class PagamentoCripto extends Pagamento2 implements Rastreavel2{
    private String hashTransacao;
    private double taxaRede;

    public PagamentoCripto(double valor, String hashTransacao, double taxaRede){
        super(valor);
        this.hashTransacao = hashTransacao;
        this.taxaRede = taxaRede;
    }

    @Override
    public void processar(){
        this.confirmado = true;
        System.out.println("Valor total: R$" + (this.valor + this.taxaRede));
    }

    @Override
    public String gerarComprovante(){
        return hashTransacao;
    }
}
