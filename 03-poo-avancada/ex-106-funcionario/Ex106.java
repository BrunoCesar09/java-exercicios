public class Ex106 {
    public static void main(String[]args){
        Funcionario f1 = new Funcionario("Bruno Paiva", "56985745853", 3000);
        Gerente g1 = new Gerente("Mitla Yuki", "06258659824", 6000, 2000);
        f1.exibirHolerite();
        g1.exibirHolerite();
    }
}
