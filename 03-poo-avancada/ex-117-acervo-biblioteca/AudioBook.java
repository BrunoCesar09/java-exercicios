public class AudioBook extends ItemAcervo{
    private int duracaoMinutos;

     public AudioBook(String autor, String titulo, int anoPublicacao, double precoBase, int duracaoMinutos){
         super(titulo, autor, anoPublicacao, precoBase);
         this.duracaoMinutos = duracaoMinutos;
     }

     @Override
    public void exibirDados(){
         super.exibirDados();
         System.out.println("Minutos de duração: " + this.duracaoMinutos);
     }
     @Override
    public double calcularTaxaManutencao(){
         if(this.duracaoMinutos >= 60){
             double armazenamentoNuvem = 5 + (this.duracaoMinutos * 0.1);
             return getPrecoBase() + armazenamentoNuvem;
         }
         else{
             double armazenamentoNuvem = 5;
             return getPrecoBase() + armazenamentoNuvem;
         }
     }

}
