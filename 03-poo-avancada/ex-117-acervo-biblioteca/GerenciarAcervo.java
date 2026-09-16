import java.util.ArrayList;
import java.util.List;

public class GerenciarAcervo {
    private List<ItemAcervo> acervo = new ArrayList<>();

    public void adicionarItem(ItemAcervo item){
        acervo.add(item);
    }

    public void exibirTaxasTotais(){
        double taxaTotal = 0;
        for(ItemAcervo item : acervo){
            item.exibirDados();
            double taxaIndividual = item.calcularTaxaManutencao();
            System.out.println("Taxa individual: R$" + taxaIndividual);
            taxaTotal += taxaIndividual;
        }
        System.out.println("Taxas totais: R$" + taxaTotal);
    }

    public void realizarEmprestimosGerais(){
        System.out.println("\n=== PROCESSANDO EMPRÉSTIMOS ===");
        for (ItemAcervo item : acervo){
            if(item instanceof Emprestavel){
                Emprestavel e = (Emprestavel) item;
                if(!e.estaEmprestado()){
                    e.emprestar();
                    System.out.println("Empréstimo realizado: " + item.getTitulo());
                }else {
                    System.out.println("Item indisponível");
                }
            }
        }

    }
}


