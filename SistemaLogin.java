import java.util.Scanner;
public class SistemaLogin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // chama o cadastro de usuario e armazena os dados retornados
        String dados = CadastrarUsuario(in);

        // separa os dados retornando em nome e senha
        String nomeCadastro = dados.split(",")[0];
        String senhaCadastro = dados.split(",")[1];

        System.out.println("\nUsuário cadastrado com sucesso!");
        System.out.println("Nome: " + nomeCadastro);
        System.out.println("Senha: " + senhaCadastro);

        // chama login!
        fazerLogin(in, nomeCadastro, senhaCadastro);

        
    }

    // metodo para cadastrar usuario
    public static String CadastrarUsuario(Scanner in) {
        System.out.print("Digite o nome para cadastro: ");
        String nome = in .nextLine();

        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome invalido. tente novamente.");
            return CadastrarUsuario(in);
        }

        System.out.print("Digite a senha para cadastrar: ");
        String senha = in .nextLine();

        if (senha == null || senha.trim().isEmpty()) {
            System.out.println("Senha invalida. tente novamente.");
            return CadastrarUsuario(in);
        } else {
                //retorna os dadados concatenados
        return nome + "," + senha;
        }
    }

        public static void fazerLogin(Scanner in, String nomecorreto, String senhaCorreta) {
            int tentativa = 0;
            while (tentativa <3) {
                System.out.print("\nDigite seu nome: ");
                String nome = in.nextLine();

                System.out.print("Digite sua senha: ");
                String senha = in.nextLine();

                // verifica se está correto
                if (nome.equals (nomecorreto) && senha.equals(senhaCorreta)) {
                    System.out.println("\n Login bem-sucessido! Bem-vindo, " + nome + "!");
                    //chama o Menu!
                    menuPrincipal(in, nome, senha);
                    return;
                }

                tentativa++;
                System.out.println("Dados incorretos! Tentativas Restantes: " + (3 - tentativa));
            }
            System.out.println("\n Você errou 3 vezes. Acesso bloqueado!");
        }

        public static void menuPrincipal(Scanner in, String nome, String senha) {
            boolean rodando = true;
            while(rodando) {
                System.out.println("\n====Menu Principal====");
                System.out.println("1. ver dados: ");
                System.out.println("2. Alterar senha: ");
                System.out.println("3. Sair: ");
                System.out.print("escolha uma opcao: ");

                String opcao = in.nextLine();

                switch (opcao) {
                    case "1":
                        System.out.println("\n=== Seus dados === ");
                        System.out.println("Nome: " + nome);
                        System.out.println("Senha: " + senha);
                        break;

                    case "2": 
                    System.out.print("Digite a nova senha: ");
                    senha = in.nextLine();
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
