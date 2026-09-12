public class PagamentoCartao2 extends Pagamento2 implements Rastreavel2 {
    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao2(double valor, String numeroCartao, int parcelas){
        super(valor);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void processar(){
        this.confirmado = true;
        System.out.println("Valor processado: R$" + this.valor + " - Quantidade de parcelas: " + this.parcelas);
    }

    @Override
    public String gerarComprovante(){
        String ultimosQuatro = numeroCartao.substring((numeroCartao.length()-4));
        return "Comprovante cartão final: " + ultimosQuatro + " - Valor: R$" + this.valor;



    }
}
