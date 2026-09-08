import java.util.ArrayList;
public class Ex92 {
    public static void main(String[] args){
        ArrayList<String> carrinho = new ArrayList<>();
        carrinho.add("arroz");
        carrinho.add("feijão");
        carrinho.add("farinha");
        System.out.println(carrinho.size());
        for(int i = 0; i < carrinho.size(); i++){
            System.out.println(carrinho.get(i));
        }
        carrinho.remove(1);
        for(int i = 0; i <carrinho.size(); i++){
            System.out.println(carrinho.get(i));
        }
    }
}
