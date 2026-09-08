public class Ex110 {
    public static void main(String[]args){
        PessoaFisica pf = new PessoaFisica("Bruno Cesar", "cesarbrunops@gmail.com", "06262662559");
        PessoaJuridica pj = new PessoaJuridica("Jamlly Paiva", "jamllypaiva@gmail.com", "05265896584", 10);
        pf.exibirDados();
        pj.exibirDados();

    }
}
