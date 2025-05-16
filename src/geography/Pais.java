package geography;

import java.util.ArrayList;
import java.util.List;

// Classe Pais que herda de Geografico
public class Pais extends Geografico {
    public List<Estado> estados = new ArrayList<>();

    public Pais(String nome) {
        super(nome);
    }

    public void adicionarEstado(Estado estado) {
        estados.add(estado);
    }

    public List<Estado> getEstados() {
        return estados;
    }
}
