package contagemvotos;

import java.util.ArrayList;

/**
 *
 * @author Virgilio Chiboleca
 */
public class Municipio {
    private String descricao;
    private String provincia;
    private int quantidadeRecenseados;
    private ArrayList<Candidato> candidatos;

    public Municipio(String descricao, String provincia, int quantidadeRecenseados) {
        this.descricao = descricao;
        this.provincia = provincia;
        this.quantidadeRecenseados = quantidadeRecenseados;
        this.candidatos = new ArrayList<>();
    }
    public Municipio(){
        this.candidatos = new ArrayList<>();
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getQuantidadeRecenseados() {
        return quantidadeRecenseados;
    }

    public void setQuantidadeRecenseados(int quantidadeRecenseados) {
        this.quantidadeRecenseados = quantidadeRecenseados;
    }
    
    public void registrarCandidato(String nome, String bi, String historial) {
        Candidato candidato = new Candidato(nome, bi, historial);
        candidatos.add(candidato);
    }
    
    public void listarCandidatos() {
        for (Candidato candidato : candidatos) {
            System.out.println(candidato.getNome() + " - " + candidato.getBI());
        }
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}

