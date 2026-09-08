public class Ex108 {
    public static void main(String[]args){
        Entrega e1 = new Entrega(10);
        EntregaExpressa ee1 = new EntregaExpressa(10, 15);
        e1.exibirResumo();
        ee1.exibirResumo();
    }
}
