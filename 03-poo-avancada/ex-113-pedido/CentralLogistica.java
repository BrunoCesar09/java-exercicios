public class CentralLogistica {
    public void processarEntrega(Pedido pedido){
        System.out.println("O valor total da entrega é: R$ " + pedido.calcularTotal());
    }
    public void enviarRastreio(Rastreavel item){
        System.out.println("Código de rastreio: " + item.gerarCodigoRastreio());
    }
}
