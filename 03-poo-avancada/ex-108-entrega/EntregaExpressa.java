public class EntregaExpressa extends Entrega{
    private double taxaUrgencia;

    public EntregaExpressa (double distanciaKm, double taxaUrgencia){
        super(distanciaKm);
        setTaxaUrgencia(taxaUrgencia);

    }

    public double getTaxaUrgencia(){
        return this.taxaUrgencia;
    }

    public void setTaxaUrgencia(double taxaUrgencia){
        if( taxaUrgencia <= 0){
            System.out.println("Erro. Digite uma valor válido.");
            this.taxaUrgencia = 0;
        }
        else{
            this.taxaUrgencia = taxaUrgencia;
        }
    }
    @Override

    public double calcularFrete(){
        return (getDistanciaKm() * 3) + this.taxaUrgencia;
    }
}
