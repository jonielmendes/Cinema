public class Ingresso {
    private String tipo;
    private String assento;
    private SalaDeCinema sala;


    public Ingresso(String tipo, String assento, SalaDeCinema sala) {
        this.tipo = tipo;
        this.assento = assento;
        this.sala = sala;
    }
    public String getTipo() {
        return tipo;
    }

    public String getAssento() {
        return assento;
    }

    public SalaDeCinema getSala() {
        return sala;
    }
}
