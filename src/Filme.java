import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private String genero;
    private int duracao;
    private static List<Filme> filmesCadastrados = new ArrayList<>(); // Lista global de filmes

    // Construtor
    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    // Método para adicionar filme ao catálogo global
    public static void cadastrarFilme(Filme filme) {
        filmesCadastrados.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    // Método para listar todos os filmes cadastrados
    public static void listarFilmes() {
        if (filmesCadastrados.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
        } else {
            System.out.println("Lista de todos os filmes cadastrados:");
            for (Filme filme : filmesCadastrados) {
                System.out.println("Nome: " + filme.getTitulo() +
                        ", Gênero: " + filme.getGenero() +
                        ", Duração: " + filme.getDuracao() + " minutos");
            }
        }
    }
}
