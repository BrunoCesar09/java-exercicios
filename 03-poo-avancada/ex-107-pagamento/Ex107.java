public class Ex107 {
    public static void main(String[]args) {
        PagamentoPix pix1 = new PagamentoPix(100, "123456");
        PagamentoCartao cartao1 = new PagamentoCartao(100, 5);
        pix1.exibirRecibo();
        cartao1.exibirRecibo();
    }
}
