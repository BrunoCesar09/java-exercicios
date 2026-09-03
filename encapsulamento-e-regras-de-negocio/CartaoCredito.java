public class CartaoCredito {
    private String titular;
    private double limite;
    private double saldoDevedor;

    public CartaoCredito(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
        this.saldoDevedor = 0;
    }
    public void realizarCompra(double valor){
        if(valor <= this.limite){
            this.saldoDevedor += valor;
            this.limite -= valor;
            System.out.println("Compra realizada com sucesso");
        }
        else{
            System.out.println("ERRO. Saldo insuficiente");
        }

    }
    public void pagarFatura(double valor){
        if(valor <= saldoDevedor){
            this.saldoDevedor -= valor;
        }
        else{
            System.out.println("ERRO. Valor maior que a fatura atual");
        }
    }
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getLimite() {
        return this.limite;
    }
    public void setLimite(double valor) {
        if (valor >= 0) {
            this.limite = valor;
        } else {
            System.out.println("Erro! Limite negativo");
        }
    }
    public double getSaldoDevedor(){
       return this.saldoDevedor;
    }
}

