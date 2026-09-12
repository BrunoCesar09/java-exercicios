public class ProcessadorDePagamentos {
    void executarProcessamento(Pagamento2 p){
        p.processar();
        if(p instanceof Rastreavel2){
            Rastreavel2 p1 = (Rastreavel2) p;
            p1.gerarComprovante();
        }
    }
}
