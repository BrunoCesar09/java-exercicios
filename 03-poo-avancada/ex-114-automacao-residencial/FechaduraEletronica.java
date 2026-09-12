public class FechaduraEletronica extends Dispositivo implements Autenticavel{
    private String senha;
    private boolean autenticado;

    public FechaduraEletronica(String nome, String senha){
        super(nome);
        this.senha = senha;
        autenticado = false;
    }

    @Override
    public boolean autenticar(String senha) {
        if (this.senha.equals(senha)) {
            return autenticado = true;

        } else {
            return autenticado = false;
        }
    }

    @Override
    public void alterarSenha(String senhaAntiga, String senhaNova){
        if(this.senha.equals(senhaAntiga)){
            System.out.println("Senha alterada com sucesso!");
            this.senha = senhaNova;
        }
        else{
            System.out.println("Senha incorreta. Não foi possível mudar senha");
        }
    }

    @Override
    public void ligar(){
        if(autenticado){
            this.ligado = true;
        }
        else{
            this.ligado = false;
        }
    }
    @Override
    public void executarAcaoPrincipal(){
        if(this.ligado){
            System.out.println("Porta destrancada.");
        }
        else{
            System.out.println("Não foi possível autenticar");
        }
    }




}
