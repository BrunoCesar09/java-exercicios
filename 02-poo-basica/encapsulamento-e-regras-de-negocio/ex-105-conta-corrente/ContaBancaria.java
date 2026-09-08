public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        setSaldo(saldo);
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
            System.out.println("Erro. Informe um saldo válido!");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Erro. Digite uma quantida válida!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            setSaldo(this.saldo - valor);
        } else {
            System.out.println("Erro. Saldo insuficiente!");
        }
    }
}
