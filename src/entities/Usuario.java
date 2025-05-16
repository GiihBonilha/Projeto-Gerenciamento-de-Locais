package entities;

import java.util.ArrayList;
import java.util.List;
import utils.Avaliacao;


// Classe Usuario
public class Usuario {
    String nome;
    public List<Local> locaisFrequentados = new ArrayList<>();
    
        public Usuario(String nome) {
            this.nome = nome;
        }
    
        public void cadastrarLocal(Local local) {
            locaisFrequentados.add(local);
        }
    
        public void avaliarLocal(Local local, int nota, String comentario) {
            if (locaisFrequentados.contains(local)) {
                local.avaliar(nota, comentario);
            } else {
                System.out.println("Você não frequentou este local.");
            }
        }
    
        public void listarLocais() {
            for (Local local : locaisFrequentados) {
                System.out.println(local);
                for (Avaliacao avaliacao : local.getAvaliacoes()) {
                    System.out.println("  " + avaliacao);
                }
            }
        }
    }
    
