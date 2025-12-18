import java.util.Scanner;

public class opcao {
    public static void main(String[] args) {
        String senhaCorreta = "ruan123";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Acesso permitido.");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes > 0) {
                    System.out.println("Senha incorreta. Tente novamente. Tentativas restantes: " + tentativasRestantes);
                    System.out.println("Digite a senha: ");
                    senhaDigitada = scanner.nextLine();
                } else {
                    System.out.println("Numero maximo de tentativas atingido. Acesso bloqueado.");
                }
            }
        }


    }
}
