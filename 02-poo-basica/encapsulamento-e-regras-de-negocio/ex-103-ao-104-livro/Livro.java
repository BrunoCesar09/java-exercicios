public class Livro extends Produto2 {
    private String autor;
    private int numeroPaginas;

    public Livro(String nome, double precoBase, String autor, int numeroPaginas){
        super(nome, precoBase);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getNumeroPaginas(){
        return this.numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }
    public void exibirDadoslivro() {
        super.exibirFichaTecnica();
        System.out.println("Nome do autor: " + this.autor + "- Quantidade de páginas: " + this.numeroPaginas);

    }
    
}
