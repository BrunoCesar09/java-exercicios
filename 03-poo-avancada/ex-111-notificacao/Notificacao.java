public abstract class Notificacao {
    private String mensagem;
    private String remetente;

    public Notificacao(String mensagem, String remetente){
        this.mensagem = mensagem;
        this.remetente = remetente;
    }

    public String getMensagem(){
        return this.mensagem;
    }

    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public String getRemetente(){
        return this.remetente;
    }

    public void setRemetente(String remetente){
        this.remetente = remetente;
    }

    public abstract void processar();

}
