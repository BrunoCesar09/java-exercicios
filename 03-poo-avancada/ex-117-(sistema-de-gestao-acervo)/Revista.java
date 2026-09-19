public class Revista extends ItemAcervo implements Emprestavel{
    private int edicao;
    private boolean emprestado = false;

    public Revista(String titulo, String autor, int anoPublicacao, double precoBase, int edicao){
        super(titulo, autor, anoPublicacao, precoBase);
        this.edicao = edicao;
    }

    @Override
    public void emprestar(){
        emprestado = true;

    }

    @Override
    public void devolver(){
        emprestado = false;

    }

    @Override
    public boolean estaEmprestado(){
        return emprestado;

    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Ano de edição: " + this.edicao + "\nStatus: " + (this.emprestado ? "Emprestado":"Disponível"));
    }

    @Override
    public double calcularTaxaManutencao(){
        if(this.edicao > 2020){
            double taxaFixa = 10.0;
            return getPrecoBase() + taxaFixa;
        }
        else{
            double taxaFixa = 7.00;
            return getPrecoBase() + taxaFixa;
        }
    }
}
