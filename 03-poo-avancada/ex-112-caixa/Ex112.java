public class Ex112 {
    public static void main(String[]args){
        Caixa caixa = new Caixa();
        CartaoDeCredito cartao = new CartaoDeCredito("54586659");
        Pix pix = new Pix("81958584859");
        caixa.finalizarCompra(cartao, 150);
        caixa.finalizarCompra(pix, 80);
    }
}
