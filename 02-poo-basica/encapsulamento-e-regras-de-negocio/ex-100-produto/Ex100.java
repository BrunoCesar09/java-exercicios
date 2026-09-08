public class Ex100 {
    public static void main(String[]args){
        Produto p1 = new Produto("Console PS5", 5000, 10);
        System.out.println("Produto: " + p1.getNome() + " - Preço: R$" + p1.getPreco());
        p1.setNome("Ps5 Slim");
        p1.setPreco(4500);
        System.out.println("Produto: " + p1.getNome() + " - Preço: R$" + p1.getPreco());

    }
}
