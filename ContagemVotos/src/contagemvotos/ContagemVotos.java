package contagemvotos;

/**
 *
 * @author Virgilio Chiboleca
 */
import java.util.ArrayList;
import java.util.Date;

public class ContagemVotos {
    private ArrayList<Municipio> municipios;
    private ArrayList<Voto> votos;

    public ContagemVotos() {
        municipios = new ArrayList<>();
        votos = new ArrayList<>();
    }

    public ArrayList<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(ArrayList<Municipio> municipios) {
        this.municipios = municipios;
    }


    public ArrayList<Voto> getVotos() {
        return votos;
    }

    public void setVotos(ArrayList<Voto> votos) {
        this.votos = votos;
    }
    

    public void registrarMunicipio(String descricao, String provincia, int quantidadeRecenseados) {
        Municipio municipio = new Municipio(descricao, provincia, quantidadeRecenseados);
        municipios.add(municipio);
    }


    public void registrarVoto(boolean isBranco, boolean isValido, Date dataVoto, Candidato candidato) {
        Voto voto = new Voto(isBranco, isValido, dataVoto);
        voto.setCandidato(candidato);
        votos.add(voto);
    }

    public void listarMunicipios() {
        for (Municipio municipio : municipios) {
            System.out.println(municipio.getDescricao() + " - " + municipio.getProvincia());
        }
    }

    public void listarVotos() {
        for (Voto voto : votos) {
            System.out.println("Data: " + voto.getDataVoto() + " - Candidato: " + voto.getCandidato().getNome());
        }
    }

    // Outros métodos para contagem e manipulação dos votos podem ser adicionados aqui

    public static void main(String[] args) {
        ContagemVotos contagemVotos = new ContagemVotos();

        // Exemplo de registro de município, candidato e voto
        contagemVotos.registrarMunicipio("Municipio de Maputo", "Maputo", 5000);
        contagemVotos.registrarMunicipio("Municipio da Matola", "Matola", 2000);
        contagemVotos.registrarMunicipio("Municipio de Boane", "Maputo", 600);
        contagemVotos.registrarMunicipio("Municipio de Chibuto", "Gaza", 1000);
        contagemVotos.registrarMunicipio("Municipio de Mueda", "Cabo Delgado", 1200);
        
        
        //contagemVotos.registrarVoto(false, true, new Date(), contagemVotos.getCandidatos().get(0));

        // Exemplo de listagem de municípios, candidatos e votos
        contagemVotos.listarMunicipios();
        contagemVotos.listarVotos();
    }
}

