public class Livro2 extends ItemAcervo implements Emprestavel{
    private int numeroPaginas;
    private boolean emprestado = false;



    public Livro2(String titulo, String autor, int anoPublicacao, double precoBase, int numeroPaginas){
        super(titulo, autor, anoPublicacao, precoBase);
        this.numeroPaginas = numeroPaginas;
    }
    @Override
    public boolean estaEmprestado() {
        return emprestado;
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
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Páginas: " + this.numeroPaginas + "\nStatus: " + (this.emprestado ? "Emprestado" : "Disponível"));
    }

    @Override
    public double calcularTaxaManutencao(){
        if(this.numeroPaginas < 200){
            double taxaFixa = 5.0;
            return taxaFixa + getPrecoBase();
        }
        else{
            double taxaFixa = 8.0;
            return taxaFixa + getPrecoBase();
        }
    }


}
