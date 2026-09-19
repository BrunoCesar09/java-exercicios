import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class GerenciarAcervo {
    private List<ItemAcervo> acervo = new ArrayList<>();

    public ItemAcervo buscarItemMaisCaro(){
        System.out.println("================= ITEM MAIS CARO ==================");
        return acervo.stream()
                .max(Comparator.comparingDouble(item -> item.getPrecoBase()))
                .orElse(null);
    }

    public List<ItemAcervo> buscarPorAutor(String autor){
        System.out.println("=========== BUSCA POR AUTOR ============");
        return acervo.stream()
                .filter(item -> item.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }
    public List<ItemAcervo> buscarPorPrecoMaximo(double precoMaximo){
        System.out.println("============ BUSCA POR PREÇO ============");
        return acervo.stream()
                .filter(item -> item.getPrecoBase() <= precoMaximo)
                .collect(Collectors.toList());
    }
    public void listarTitulosEmMaiusculo(){
        System.out.println("============== LISTA DOS LIVROS ============");
         acervo.stream()
                .map(item -> item.getTitulo().toUpperCase())
                .forEach(titulo -> System.out.println("\uD83D\uDCD6" + titulo));
    }

    public double calcularMediaPreco(){
        System.out.println("============ MÉDIA DE PREÇOS ===========");
        return acervo.stream()
                .mapToDouble(item -> item.getPrecoBase())
                .average()
                .orElse(0.0);

    }

    public void cadastrarLivro(String titulo, String autor, int anoPublicacao, double precoBase, int numeroPaginas){
        try {
            Livro2 livro = new Livro2(titulo, autor, anoPublicacao, precoBase, numeroPaginas);
            acervo.add(livro);
            System.out.println("Livro " + titulo + " cadastrado com sucesso!");
        }catch(PrecoInvalidoException e){
            System.out.println("ERRO DE PREÇO: " + e.getMessage());
        }catch(AnoInvalidoException e){
            System.out.println("Falha ao cadastrar o livro " + titulo + ": " + e.getMessage());
        }
    }
    public void cadastrarRevista(String titulo, String autor, int anoPublicacao, double precoBase, int edicao){
        try {
            Revista revista = new Revista(titulo, autor, anoPublicacao, precoBase, edicao);
            acervo.add(revista);
            System.out.println("A revista " + titulo + " cadastrada com sucesso!");
        }catch(PrecoInvalidoException e){
            System.out.println("ERRO DE PREÇO: " + e.getMessage());
        }catch(AnoInvalidoException e){
            System.out.println("Falha ao cadastrar " + titulo + ": " + e.getMessage());

        }
    }

    public void cadastrarAudioBook(String titulo, String autor, int anoPublicacao, double precoBase, int minutos){
        try {
            AudioBook audio = new AudioBook(titulo, autor, anoPublicacao, precoBase, minutos);
            acervo.add(audio);
            System.out.println("O audiobook " + titulo + " cadastrado com sucesso!");
        }catch(PrecoInvalidoException e){
            System.out.println("ERRO DE PREÇO: " + e.getMessage());
        }catch(AnoInvalidoException e){
            System.out.println("Falha ao cadastrar " + titulo + ": " + e.getMessage());

        }
    }

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
        System.out.println("\nTaxas totais: R$" + taxaTotal);
    }

    public void emprestarItemPorTitulo(String titulo){
        ItemAcervo itemEncontrado = acervo.stream()
                .filter(item -> item.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
        if(itemEncontrado == null){
           System.out.println("ERRO! O título " + titulo + " não foi encontrado no acervo.");
        }else if(itemEncontrado instanceof Emprestavel){
            Emprestavel itemEmprestavel = (Emprestavel) itemEncontrado;
            itemEmprestavel.emprestar();
            System.out.println("Item " + itemEncontrado.getTitulo() + " emprestado com sucesso!");
        }else{
            System.out.println("O item " + itemEncontrado.getTitulo() + " não é autorizado para empréstimo.");
        }
    }
}


