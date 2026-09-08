public class Ex113 {
    public static void main(String[]args){
        CentralLogistica central = new CentralLogistica();
        PedidoComum comum = new PedidoComum(100, 20);
        PedidoPremium premium = new PedidoPremium(200, 40);
        central.processarEntrega(comum);
        central.processarEntrega(premium);
        central.enviarRastreio(premium);
    }
}
