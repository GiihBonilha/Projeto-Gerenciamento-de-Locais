package app;

import java.util.Scanner;
import entities.Local;
import entities.Usuario;
import geography.Cidade;
import geography.Estado;
import geography.Pais;
import geography.ZonaCidade;



// Classe Principal
public class GerenciamentoLocaisApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do país, estado, cidade e zona (hierarquia de composição)
        Pais brasil = new Pais("Brasil");
        Estado sp = new Estado("São Paulo");
        Cidade saoPaulo = new Cidade("São Paulo");
        ZonaCidade centro = new ZonaCidade("Centro");

        // Criação do usuário
        Usuario usuario = new Usuario("João");

        // Menu
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Local");
            System.out.println("2. Avaliar Local");
            System.out.println("3. Listar Locais e Avaliações");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do local: ");
                    String nomeLocal = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();

                    // Instancia um novo local com a hierarquia de zonas
                    Local local = new Local(nomeLocal, endereco, centro, saoPaulo, sp, brasil);
                    usuario.cadastrarLocal(local);
                    System.out.println("Local cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do local para avaliar: ");
                    nomeLocal = scanner.nextLine();
                    Local localEncontrado = usuario.locaisFrequentados.stream()
                        .filter(l -> l.getNome().equalsIgnoreCase(nomeLocal))
                        .findFirst()
                        .orElse(null);

                if (localEncontrado != null) {
                    System.out.print("Nota (1 a 5): ");
                    int nota = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Comentário: ");
                    String comentario = scanner.nextLine();
                    usuario.avaliarLocal(localEncontrado, nota, comentario);
                    System.out.println("Avaliação registrada.");
                } else {
                    System.out.println("Local não encontrado.");
                }
                break;

            case 3:
                usuario.listarLocais();
                break;

            case 4:
                System.out.println("Saindo do sistema.");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    } while (opcao != 4);

    scanner.close();
}
}

