import java.util.ArrayList;
import java.util.List;

public class SalaDeCinema {

    private int numero;
    private int capacidadeMaxima;
    private Filme filme;  // Cada sala de cinema tem um filme
    private List<Cliente> clientes;  // Lista de clientes


    public SalaDeCinema(int numero, int capacidadeMaxima, Filme filme) {
        this.numero = numero;
        this.capacidadeMaxima = capacidadeMaxima;
        this.filme = filme;
        this.clientes = new ArrayList<>();  // Inicialmente, a lista de clientes está vazia
    }


    public int getNumero() {
        return numero;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public Filme getFilme() {
        return filme;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarCliente(Cliente cliente) {
        if (clientes.size() < capacidadeMaxima) {
            clientes.add(cliente);
            System.out.println("Cliente " + cliente.getNome() + " adicionado com sucesso.");
        } else {
            System.out.println("A sala está cheia. Não é possível adicionar mais clientes.");
        }
    }

    public boolean estaCheia() {
        return clientes.size() >= capacidadeMaxima;
    }

    public void listarClientes() {
        System.out.println("Filme em exibição: " + filme.getTitulo());
        System.out.println("Gênero: " + filme.getGenero());
        System.out.println("Duração: " + filme.getDuracao() + " minutos");
        System.out.println("Clientes presentes:");

        if (clientes.isEmpty()) {
            System.out.println("Não há clientes na sala.");
        } else {
            for (Cliente cliente : clientes) {
                Ingresso ingresso = cliente.getIngresso();
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Endereço: " + cliente.getEndereco());
                System.out.println("Tipo de Ingresso: " + ingresso.getTipo());
                System.out.println("Assento: " + ingresso.getAssento());
                System.out.println("Sala: " + ingresso.getSala().getNumero());
                System.out.println("Filme: " + ingresso.getSala().getFilme().getTitulo() + " (" + ingresso.getSala().getFilme().getGenero() + ")");
                System.out.println("Duração: " + ingresso.getSala().getFilme().getDuracao() + " minutos");
                System.out.println("--------------------");
            }
        }
    }
}




