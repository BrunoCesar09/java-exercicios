public class PedidoPremium extends Pedido implements Rastreavel {

    public PedidoPremium(double valorProduto, double valorFreteBase){
        super(valorProduto, valorFreteBase);
    }

    @Override
    public double calcularTotal(){
        return getValorProduto() + (getValorFreteBase() * 0.5);
    }

    @Override
    public String gerarCodigoRastreio(){
       return "PRM - " + (int)(this.getValorProduto() + this.getValorFreteBase());
    }
}
