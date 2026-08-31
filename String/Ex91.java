
public class Ex91 {
    public static void main(String[]args){
    String dadosProduto = "Notebook_Dell,R$ 4.500;00,Eletrônicos";
    dadosProduto = dadosProduto.replace(",","|");
    dadosProduto = dadosProduto.replace(";",",");
    String[] dadosParticionados = dadosProduto.split("\\|");
    for(int i = 0; i < dadosParticionados.length; i++){
        System.out.println(dadosParticionados[i]);
    }

    }
}
