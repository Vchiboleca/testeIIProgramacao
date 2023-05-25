package contagemvotos;

/**
 *
 * @author Virgilio Chiboleca
 */
public class Candidato {
    private String nome;
    private String bi;
    private String historial;

    public Candidato(String nome, String bi, String historial) {
        this.nome = nome;
        this.bi = bi;
        this.historial = historial;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBI() {
        return bi;
    }

    public void setBI(String BI) {
        this.bi = BI;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
}

