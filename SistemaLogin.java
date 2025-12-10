import java.util.Scanner;
public class SistemaLogin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dados = CadastrarUsuario(in);

        String nomeCadstro = dados.split(",")[0];
        String senhaCadastro = dados.split(",")[1];
        public static String CadastrarUsuario(Scanner in) {
            System.out.print("Digite o nome Para cadastro: "); //Perguta ao usuario o nome
            String nome = in.nextLine(); // Lê o nome digitado pelo usuario

            if (nome == null || nome.isEmpty()) {
                System.out.println("Nome invalido. Tente novamente."); // Verifica se o nome é valido
                return CadastrarUsuario(in); // chama novamente o metodo para cadastrar
            }
        }


    }
}