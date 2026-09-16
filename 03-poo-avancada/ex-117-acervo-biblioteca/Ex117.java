public class Ex117 {
    public static void main(String[]args){
        GerenciarAcervo acervo = new GerenciarAcervo();

        Livro2 l1 = new Livro2("Mitla Yuki", "Laranja", 2026, 150, 250);
        Livro2 l2 = new Livro2("Bruno Cesar", "Branco", 2025, 110, 180);
        Revista r = new Revista("Roxo", "Jamlly Paiva", 2024, 130, 2021);
        Revista r2 = new Revista("Vermelho", "Gilmaria Barros", 1990, 200, 1998);
        AudioBook a = new AudioBook("Zoe", "Matando Titãs", 2023, 400, 120);
        AudioBook a2 = new AudioBook("José", "É isso", 1890, 80, 30);

        acervo.adicionarItem(l1);
        acervo.adicionarItem(l2);
        acervo.adicionarItem(r);
        acervo.adicionarItem(r2);
        acervo.adicionarItem(a);
        acervo.adicionarItem(a2);

        acervo.exibirTaxasTotais();
        acervo.realizarEmprestimosGerais();
    }
}
