public class Usuario {
    private String nome;  // Private protege os dados 
    private String senha; //

    public Usuario(String nome, String senha) {
        this.nome = nome;  // this refenrência ao objeto atual
        this.senha = senha; // obriga o usuário a narcer completo
        
    }
    public boolean validarSenha(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }
}
