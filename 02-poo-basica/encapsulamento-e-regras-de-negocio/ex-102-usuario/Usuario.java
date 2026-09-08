public class Usuario {
    private String username;
    private String senha;

    public Usuario(String username, String senha){
        this.username = username;
        this.senha = senha;
    }
    public void fazerLogin (String senhaDigitada){
        if(senhaDigitada.equals(senha)){
            System.out.println("Login efetuado com sucesso!");
        }
        else{
            System.out.println("Senha incorreta");
        }
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}
