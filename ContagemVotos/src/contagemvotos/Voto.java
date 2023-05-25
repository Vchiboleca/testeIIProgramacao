package contagemvotos;

/**
 *
 * @author Virgilio Chiboleca
 */
import java.util.Date;

public class Voto {
    private boolean isBranco;
    private boolean isValido;
    private Date dataVoto;
    private Candidato candidato;

    public Voto(boolean isBranco, boolean isValido, Date dataVoto) {
        this.isBranco = isBranco;
        this.isValido = isValido;
        this.dataVoto = dataVoto;
    }

    // Getters e Setters
    public boolean isBranco() {
        return isBranco;
    }

    public void setBranco(boolean branco) {
        isBranco = branco;
    }

    public boolean isValido() {
        return isValido;
    }

    public void setValido(boolean valido) {
        isValido = valido;
    }

    public Date getDataVoto() {
        return dataVoto;
    }

    public void setDataVoto(Date dataVoto) {
        this.dataVoto = dataVoto;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}

