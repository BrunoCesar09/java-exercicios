public class Ex117 {
    public static void main(String[]args) {
        GerenciarAcervo acervo = new GerenciarAcervo();

        acervo.cadastrarLivro("A giraffa laranja", "Mitla Yuki", 2026, 100, 200);
        acervo.cadastrarRevista("Remédios caseiros", "Bruno Cesar", 2025, 200, 2000);
        acervo.cadastrarAudioBook("Marx", "Jamlly Paiva",2008,300,60);


        acervo.exibirTaxasTotais();


        acervo.buscarPorAutor("Mitla Yuki").forEach(item -> System.out.println("- " + item.getTitulo()));
        acervo.buscarPorPrecoMaximo(200).forEach(item -> System.out.println("- " + item.getTitulo() + ": " + item.getPrecoBase()));
        acervo.listarTitulosEmMaiusculo();
        ItemAcervo itemMaisCaro = acervo.buscarItemMaisCaro();
        if(itemMaisCaro != null) {
            System.out.println("Livro mais caro: " + itemMaisCaro.getTitulo() + "(R$ " + itemMaisCaro.getPrecoBase() + ")");
        } else{
            System.out.println("Acervo vazio");
        }

        double mediaPrecos = acervo.calcularMediaPreco();
        System.out.println(mediaPrecos);

        System.out.println("====== EMPRÉSTIMO POR TÍTULO ======");
        acervo.emprestarItemPorTitulo("A GIRAFFA LARANJa");



        }


    }




