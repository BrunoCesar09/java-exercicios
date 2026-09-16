import java.util.ArrayList;
import java.util.List;

public class GerenciadorFrota {
    private List<Veiculo3> frota = new ArrayList<>();

    public void adicionarVeiculo(Veiculo3 v){
        frota.add(v);
    }

    public void exibirCustosTotais(){
        double custoTotal= 0;
        for(int i = 0; i < frota.size(); i++){
            Veiculo3 v = frota.get(i);
            double custo = v.calcularCustoManutencao();
            System.out.println("Veículo: " + v.getModelo() + " - Custo total: " + custo);
            custoTotal += custo;
        }
        System.out.println("Custo total da frota: " + custoTotal);
    }

    public void realizarRevisoesGerais(){
        for( Veiculo3 v : frota){
            if(v instanceof Revisavel){
                Revisavel r = (Revisavel) v;
                if (r.precisaRevisao()){
                    r.realizarRevisao();
                }
            }else{
                System.out.println("O veículo " + v.getModelo() + " não precisa de revisão no momento");
            }

        }
    }
}

