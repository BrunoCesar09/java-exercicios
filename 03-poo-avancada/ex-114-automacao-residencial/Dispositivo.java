public abstract class Dispositivo {
    protected String nome;
    protected boolean ligado;

    public Dispositivo (String nome){
        this.nome = nome;
        ligado = false;
    }

    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    abstract void executarAcaoPrincipal();
}
