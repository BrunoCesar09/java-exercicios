public class PedidoComum extends Pedido{

    public PedidoComum(double valorFreteBase, double valorProduto){
        super(valorFreteBase, valorProduto);
    }
    @Override
    public double calcularTotal(){
        return getValorFreteBase() + getValorProduto();
    }
}
