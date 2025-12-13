import java.util.Scanner;
public class SistemaLogin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // chama o cadastro de usuario e armazena os dados retornados
        Usuario usuario = cadastrarUsuario(in);

       System.out.println("Usuário cadastrado: " + usuario.getNome());

        // chama login!
        fazerLogin(in, usuario);

        
    }

    // metodo para cadastrar usuario
    public static Usuario cadastrarUsuario(Scanner in) {
        System.out.print("Digite o nome para cadastro: ");
        String nome = in .nextLine().trim();

        if (nome.isEmpty()) {
            System.out.println("Nome invalido. tente novamente.");
            return cadastrarUsuario(in);
        }

        System.out.print("Digite a senha para cadastrar: ");
        String senha = in .nextLine().trim();

        if (senha.isEmpty()) {
            System.out.println("Senha invalida. tente novamente.");
            return cadastrarUsuario(in);

        }

        return new Usuario(nome, senha);
    }

        public static void fazerLogin(Scanner in, Usuario usuario) {
            int tentativa = 0;
            while (tentativa <3) {
                System.out.print("\nDigite seu nome: ");
                String nome = in.nextLine().trim();

                System.out.print("Digite sua senha: ");
                String senha = in.nextLine().trim();

                // verifica se está correto
                if (nome.equals(usuario.getNome()) && usuario.validarSenha(senha)) {
                    System.out.println("\n Login bem-sucessido! Bem-vindo!");
                    //chama o Menu!
                    menuPrincipal(in, usuario);
                    return;
                }

                tentativa++;
                System.out.println("Dados incorretos! Tentativas Restantes: " + (3 - tentativa));
            }
            System.out.println("\n Você errou 3 vezes. Acesso bloqueado!");
        }

        public static void menuPrincipal(Scanner in, Usuario usuario) {
            boolean rodando = true;
            while(rodando) {
                System.out.println("\n====Menu Principal====");
                System.out.println("1. ver dados: ");
                System.out.println("2. Alterar senha: ");
                System.out.println("3. Sair: ");
                System.out.print("escolha uma opcao: ");

                String opcao = in.nextLine().trim();

                switch (opcao) {
                    case "1":
                        System.out.println("\nNome: " + usuario.getNome());
                        System.out.println("senha: " + usuario.getSenha());
                        break;

                    case "2": 
                    System.out.print("Digite a nova senha: ");
                    String novaSenha = in.nextLine().trim();
                    usuario.alterarSenha(novaSenha);
                    System.out.println("Senha alterada com sucesso!");
                    break;

                    case "3":
                        System.out.println("saindo...");
                        rodando = false;
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");



                }
            }
        }

    }
