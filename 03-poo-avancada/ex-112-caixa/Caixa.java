public class Caixa {
    public void finalizarCompra(Pagavel meioDePagamento, double valorTotal){
        meioDePagamento.processarPagamento(valorTotal);
    }
}
