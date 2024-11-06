public class SalaDeCinema {
    private int numeroSala;
    private int capacidade;

    public SalaDeCinema(int numeroSala, int capacidade) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
    }

    public void listarFilmesDaSala() {
        System.out.println("Filmes exibidos na Sala " + numeroSala + ":");
        Filme.listarFilmes();
    }

    // Getter para o número da sala
    public int getNumeroSala() {
        return numeroSala;
    }
}

