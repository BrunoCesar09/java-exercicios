public abstract class Veiculo3 {
    private String placa;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Veiculo3(String placa, String modelo, int ano, double quilometragem){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        setQuilometragem(quilometragem);
    }

    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        if(quilometragem < 0){
            System.out.println("Digite um valor válido para quilometragem.");
        }
        else{
            this.quilometragem = quilometragem;
        }
    }

    public abstract void exibirDados();
    public abstract double calcularCustoManutencao();
}
