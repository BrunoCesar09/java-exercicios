public class ContaCorrente extends ContaBancaria{
    private double limiteEspecial;

    public ContaCorrente(String titular, int numeroConta, double saldo, double limiteEspecial){
        super(titular, numeroConta, saldo);
        this.limiteEspecial = limiteEspecial;
    }

    public double getLimiteEspecial(){
        return this.limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial){
        this.limiteEspecial = limiteEspecial;
    }

    public void exibirExtrato(){
        System.out.println("Titular: " + getTitular() + " - Número da conta: " + getNumeroConta() + " - Saldo: " + getSaldo() + " - Limite especial: " + getLimiteEspecial());
    }
    @Override
    public void sacar(double valor) {
        double saldoDisponivel = getSaldo() + this.limiteEspecial;

        if (valor > 0 && valor <= saldoDisponivel) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Erro! Saque excede o saldo e o limite especial disponível.");
        }
    }
}

