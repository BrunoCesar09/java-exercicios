public class NotificacaoUrgente extends Notificacao implements EnviavelSms{

    public NotificacaoUrgente(String mensagem, String remetente){
        super(mensagem, remetente);
    }

    @Override
    public void processar(){
        System.out.println("ALERTA URGENTE! De " + getRemetente() + ": " + getMensagem());
    }

    @Override
    public void enviarSms(String numeroTelefone){
        System.out.println("Disparando sms para " + numeroTelefone + ": " + getMensagem());
    }
}
