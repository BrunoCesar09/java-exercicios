public class Ex111 {
    public static void main(String[]args){
        NotificacaoEmail n1 = new NotificacaoEmail("Recebemos seu pagamento!", "VIVO");
        NotificacaoUrgente n2 = new NotificacaoUrgente("Alguém está tentando entrar na sua conta! É você?", "GMAIL");
        n1.processar();
        n2.processar();
        n2.enviarSms("81988665859");
    }
}
