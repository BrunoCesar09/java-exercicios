public class Ex115 {
    public static void main(String[]args){
        ProcessadorDePagamentos p = new ProcessadorDePagamentos();

        PagamentoBoleto boleto = new PagamentoBoleto(100, "123456789");
        PagamentoCartao2 cartao = new PagamentoCartao2(120, "123456789", 2);
        PagamentoCripto cripto = new PagamentoCripto(150, "123456789", 100);

        System.out.println("TESTANDO BOLETO == SEM CONFIRMAR ==");
        p.executarProcessamento(boleto);
        System.out.println("TESTANDO BOLETO == COM CONFIRMAÇÃO==");
        boleto.confirmar();
        p.executarProcessamento(boleto);
        System.out.println("TESTANDO CARTÃO");
        p.executarProcessamento(cartao);
        System.out.println("TESTANDO CRIPTO");
        p.executarProcessamento(cripto);

    }


}
