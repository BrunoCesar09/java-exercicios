public class CartaoDeCredito implements Pagavel{
    private String numeroCartao;

    public CartaoDeCredito(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " processado no cartão " + this.numeroCartao);

    }
}
