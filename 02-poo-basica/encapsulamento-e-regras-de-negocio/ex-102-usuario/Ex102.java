public class Ex102 {
    public static void main(String[]args){
        Usuario p1 = new Usuario("Mitla Yuki", "123456");
        p1.fazerLogin("45214");
        p1.fazerLogin("123456");
        p1.setSenha("654321");
        p1.fazerLogin("123456");
        p1.fazerLogin("654321");


    }
}
