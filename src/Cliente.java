public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private Ingresso ingresso;  // Ingresso associado ao cliente


    public Cliente(String nome, String cpf, String endereco, Ingresso ingresso) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.ingresso = ingresso;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }
}

