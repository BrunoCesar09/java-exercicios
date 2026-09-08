public class Produto2 {
    private String nome;
    private double precoBase;

    public Produto2(String nome, double precoBase){
        this.nome = nome;
        this.precoBase = precoBase;
        setPrecoBase(precoBase);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase > 0) {
            this.precoBase = precoBase;
        } else {
            this.precoBase = 0.0;
            System.out.println("ERRO! Informe um valor válido.");
        }
    }
    public void exibirFichaTecnica(){
        System.out.println("Produto: " + this.nome + " - Preço: R$ " + this.precoBase);
    }

}
