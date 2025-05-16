package geography;

// Classe abstrata Geografico (representa entidades geográficas)
public abstract class Geografico {
    public String nome;

    public Geografico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
