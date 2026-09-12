public abstract class Pagamento2 {
    protected double valor;
    protected boolean confirmado;

    public Pagamento2(double valor){
        this.valor = valor;
        confirmado = false;
    }

    public void confirmar(){
        this.confirmado = true;
    }
    public void cancelar(){
        this.confirmado = false;
    }

    public abstract void processar();
}
