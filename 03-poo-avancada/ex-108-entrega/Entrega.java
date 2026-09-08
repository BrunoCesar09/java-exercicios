public class Entrega {
    private double distanciaKm;

    public Entrega(double distanciaKm){
        setDistanciaKm(distanciaKm);

    }

    public double getDistanciaKm(){
        return distanciaKm;
    }
    public void setDistanciaKm(double distanciaKm){
        if(distanciaKm <= 0){
            this.distanciaKm = 0;
            System.out.println("Distância inválida!");
        }
        else{
            this.distanciaKm = distanciaKm;
        }
    }

    public double calcularFrete(){
        return distanciaKm * 2.0;
    }

    public void exibirResumo(){
        System.out.println("Distância: " + getDistanciaKm() + "Km" + " - Valor frete: " + calcularFrete());
    }
}
