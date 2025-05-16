package geography;

import java.util.ArrayList;
import java.util.List;
import entities.Local;
import geography.ZonaCidade;

// Classe ZonaCidade que herda de Geografico
public class ZonaCidade extends Geografico {
    public List<Local> locais = new ArrayList<>();

    public ZonaCidade(String nome) {
        super(nome);
    }

    public void adicionarLocal(Local local) {
        locais.add(local);
    }

    public List<Local> getLocais() {
        return locais;
    }
}