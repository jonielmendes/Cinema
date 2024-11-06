import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalaDeCinema sala = new SalaDeCinema(1, 25);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Listar Filmes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                cadastrarFilme(scanner);
            } else if (opcao == 2) {
                Filme.listarFilmes();
            } else if (opcao == 0) {
                System.out.println("Saindo...");
                scanner.close();
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarFilme(Scanner scanner) {
        System.out.println("Digite o título do filme:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o gênero do filme:");
        String genero = scanner.nextLine();

        System.out.println("Digite a duração do filme (em minutos):");
        while (!scanner.hasNextInt()) {
            System.out.println("Duração inválida. Digite um número inteiro.");
            scanner.next();
        }
        int duracao = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        Filme filme = new Filme(titulo, genero, duracao);
        Filme.cadastrarFilme(filme);
    }
}
