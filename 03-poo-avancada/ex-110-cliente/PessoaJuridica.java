public class PessoaJuridica extends Cliente{
    private String cnpj;
    private int qtdFuncionarios;

    public PessoaJuridica(String nome, String email, String cnpj, int qtdFuncionarios){
        super(nome, email);
        this.cnpj = cnpj;
        setQtdFuncionarios(qtdFuncionarios);
    }

    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public int getQtdFuncionarios(){
        return this.qtdFuncionarios;
    }
    public void setQtdFuncionarios(int qtdFuncionarios){
        if(qtdFuncionarios <= 0){
            System.out.println("Erro. Digite um número válido");
            this.qtdFuncionarios = 0;
        }
        else{
            this.qtdFuncionarios = qtdFuncionarios;
        }
    }

    @Override
    public double calcularAnuidade(){
        return 500 + (getQtdFuncionarios() * 20);
    }
}
