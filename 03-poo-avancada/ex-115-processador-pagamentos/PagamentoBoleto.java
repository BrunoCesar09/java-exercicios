public class PagamentoBoleto extends Pagamento2{
    private String codigoBarras;

    public PagamentoBoleto(double valor, String codigoBarras){
        super(valor);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processar(){
        if(this.confirmado){
            System.out.println("Código de barras: " + this.codigoBarras + " - Valor: R$" + this.valor);
        }
        else{
            System.out.println("Boleto aguarda confirmação");
        }
    }

}
