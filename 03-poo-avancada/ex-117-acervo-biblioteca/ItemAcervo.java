public abstract class ItemAcervo {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double precoBase;

    public ItemAcervo(String titulo, String autor, int anoPublicacao, double precoBase){
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
        this.autor = autor;
        setPrecoBase(precoBase);
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    public double getPrecoBase(){
        return this.precoBase;
    }
    public void setPrecoBase(double precoBase) {
        if (precoBase >= 0) {
            this.precoBase = precoBase;
        } else {
            System.out.println("Digite um preço válido.");
        }
    }

    public  void exibirDados(){
        System.out.println("\n===============");
        System.out.println("Título: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de publicação: " + getAnoPublicacao() + "\nPreço: R$" + getPrecoBase());
    }
    public abstract double calcularTaxaManutencao();

}
