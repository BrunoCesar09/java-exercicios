public class Gerente extends Funcionario {
    private double bonusGestao;

    public Gerente(String nome, String cpf,double salarioBase, double bonusGestao){
        super(nome, cpf, salarioBase);
        this.bonusGestao = bonusGestao;
    }

    public double getBonusGestao(){
        return bonusGestao;
    }

    public void setBonusGestao(double valor){
        this.bonusGestao = valor;
    }

    @Override
    public double calcularSalarioFinal(){
        return getSalarioBase() + getBonusGestao();
    }
}
