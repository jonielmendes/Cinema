public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme("Harry Potter", "Fantasia", 180);

        SalaDeCinema sala = new SalaDeCinema(1, 25, filme);

        Ingresso ingresso1 = new Ingresso("Inteira", "A1", sala);
        Ingresso ingresso2 = new Ingresso("Meia", "B2", sala);

        Cliente cliente1 = new Cliente("Joniel Mendes", "123.456.789-00", "Rua dos Programadores, 123", ingresso1);
        Cliente cliente2 = new Cliente("Patrícia", "987.654.321-00", "Rua B, 456", ingresso2);

        sala.adicionarCliente(cliente1);
        sala.adicionarCliente(cliente2);

        sala.listarClientes();
    }
}


