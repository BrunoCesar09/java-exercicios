public interface Autenticavel {
    boolean autenticar(String senha);
    void alterarSenha(String senhaAntiga, String senhaNova);
}
