public abstract class ItemAcervo {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double precoBase;
    private StatusEmprestimo status;

    public ItemAcervo(String titulo, String autor, int anoPublicacao, double precoBase){
        if(precoBase <= 0) {
            throw new PrecoInvalidoException("O preço base (" + precoBase + ") deve ser maior que 0");
        }
        if(anoPublicacao > 2026){
            throw new AnoInvalidoException("Ano de publicação inválido: " + anoPublicacao);
        }
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
        this.autor = autor;
        this.precoBase = precoBase;
        this.status = StatusEmprestimo.DISPONIVEL;

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
    public StatusEmprestimo getStatus(){
        return this.status;
    }
    public void setStatus(StatusEmprestimo status){
        this.status = status;
    }

    public  void exibirDados(){
        System.out.println("\n===============");
        System.out.println("Título: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de publicação: " + getAnoPublicacao() + "\nPreço: R$" + getPrecoBase());
    }
    public abstract double calcularTaxaManutencao();
    public void realizarEmprestimo(){
        if(this.status == StatusEmprestimo.DISPONIVEL){
            this.status = StatusEmprestimo.EMPRESTADO;
            System.out.println("Empréstimo realizado: " + this.titulo);
        }else{
            System.out.println("Não foi possível emprestar: " + this.titulo + ". Status atual: " + this.status);
        }
    }

}
