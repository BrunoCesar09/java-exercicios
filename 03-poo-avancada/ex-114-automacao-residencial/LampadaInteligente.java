public class LampadaInteligente extends Dispositivo{
    private int intensidade;

    public LampadaInteligente (String nome){
        super(nome);
        this.intensidade = intensidade;
        this.intensidade = 100;
    }

    @Override
    public void executarAcaoPrincipal(){
        if(this.ligado){
            System.out.println("A intensidade atual é: " + this.intensidade);
        }
        else{
            System.out.println("Desligado.");
        }
    }
}
