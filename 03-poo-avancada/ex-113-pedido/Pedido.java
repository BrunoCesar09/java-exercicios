public abstract class Pedido {
    private double valorProduto;
    private double valorFreteBase;

    public Pedido(double valorProduto, double valorFreteBase){
        setValorProduto(valorProduto);
        setValorFreteBase(valorFreteBase);

    }

    public double getValorProduto(){
        return this.valorProduto;
    }
    public void setValorProduto(double valorProduto){
        if(valorProduto <= 0){
            this.valorProduto = 0;
            System.out.println("Erro. Valor do produto inválido!");
        }
        else{
            this.valorProduto = valorProduto;
        }
    }

    public double getValorFreteBase(){
        return this.valorFreteBase;
    }
    public void setValorFreteBase(double valorFreteBase){
        if(valorFreteBase <= 0){
            this.valorFreteBase = 0;
            System.out.println("Erro. Valor do frete inválido!");
        }
        else{
            this.valorFreteBase = valorFreteBase;
        }
    }

    public abstract double calcularTotal();


}
