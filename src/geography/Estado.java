package geography;

import java.util.ArrayList;
import java.util.List;

// Classe Estado que herda de Geografico
public class Estado extends Geografico {
    public List<Cidade> cidades = new ArrayList<>();

    public Estado(String nome) {
        super(nome);
    }

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public List<Cidade> getCidades() {
        return cidades;
    }
}