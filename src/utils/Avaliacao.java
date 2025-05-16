package utils;

// Classe Avaliacao
public class Avaliacao {
    public int nota;
    public String comentario;

    public Avaliacao(int nota, String comentario) {
        if (nota < 1 || nota > 5) throw new IllegalArgumentException("Nota deve estar entre 1 e 5.");
        this.nota = nota;
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return "Nota: " + nota + " - " + comentario;
    }
}