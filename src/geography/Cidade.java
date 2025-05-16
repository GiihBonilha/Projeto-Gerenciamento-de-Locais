package geography;

import java.util.ArrayList;
import java.util.List;


// Classe Cidade que herda de Geografico
public class Cidade extends Geografico {
    public List<ZonaCidade> zonas = new ArrayList<>();

    public Cidade(String nome) {
        super(nome);
    }

    public void adicionarZona(ZonaCidade zona) {
        zonas.add(zona);
    }

    public List<ZonaCidade> getZonas() {
        return zonas;
    }
}
