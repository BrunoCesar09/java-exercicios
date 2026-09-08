public class Pix implements  Pagavel{
    private String chavePix;

    public Pix (String chavePix){
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " processado via PIX para " + this.chavePix);
    }
}
