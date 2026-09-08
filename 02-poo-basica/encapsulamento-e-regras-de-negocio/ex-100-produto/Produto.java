public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto (){

    }

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(int preco){
        if(preco >= 0){
            this.preco = preco;
        }
        else{
            System.out.println("Preço inválido");
        }
    }
    public double calcularValorEstoque(){
        return preco * quantidadeEstoque;
    }
    public void adicionarProdutos (int quantidade){
        this.quantidadeEstoque += quantidade;
    }
    public void removerProdutos (int quantidade){
        this.quantidadeEstoque -= quantidade;
    }

}

