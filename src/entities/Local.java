package entities;

import java.util.ArrayList;
import java.util.List;
import geography.Cidade;
import geography.Estado;
import geography.Pais;
import geography.ZonaCidade;
import interfaces.Avaliavel;
import utils.Avaliacao;

// Classe Local que implementa Avaliavel
public class Local implements Avaliavel {
    public String nome;
    public String endereco;
    public ZonaCidade zonaCidade;
    public Cidade cidade;
    public Estado estado;
    public Pais pais;
    public List<Avaliacao> avaliacoes = new ArrayList<>();

    public Local(String nome, String endereco, ZonaCidade zonaCidade, Cidade cidade, Estado estado, Pais pais) {
        this.nome = nome;
        this.endereco = endereco;
        this.zonaCidade = zonaCidade;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;

        // Adicionar o local à estrutura geográfica
        zonaCidade.adicionarLocal(this);
        cidade.adicionarZona(zonaCidade);
        estado.adicionarCidade(cidade);
        pais.adicionarEstado(estado);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void avaliar(int nota, String comentario) {
        Avaliacao avaliacao = new Avaliacao(nota, comentario);
        avaliacoes.add(avaliacao);
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    @Override
    public String toString() {
        return "Local: " + nome + ", Endereço: " + endereco + ", Zona: " + zonaCidade.getNome() +
               ", Cidade: " + cidade.getNome() + ", Estado: " + estado.getNome() + ", País: " + pais.getNome();
    }
}
