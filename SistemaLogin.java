import java.util.Scanner;
public class SistemaLogin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dados = CadastrarUsuario(in);

        String nomeCadstro = dados.split(",")[0];
        String senhaCadastro = dados.split(",")[1];


    }
}