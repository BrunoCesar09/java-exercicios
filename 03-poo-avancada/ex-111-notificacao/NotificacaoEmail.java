public class NotificacaoEmail extends Notificacao {
    public NotificacaoEmail(String mensagem, String remetente){
        super(mensagem, remetente);
    }

    @Override
    public  void processar(){
        System.out.println("Enviando email de " + getRemetente() + ": " + getMensagem());
    }


}
