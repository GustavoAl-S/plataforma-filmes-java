package Models;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    // ----- CONSTRUTOR ---------
    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, String sinopse, boolean incluidoNoPlano, String diretor) {
        super(nome, anoDeLancamento, duracaoEmMinutos, sinopse, incluidoNoPlano);
        this.diretor = diretor;
    }

    // ----- GETTERS E SETTERS ------
    @Override
    public int getClassificacao() {
        return (int) pegaMedia();
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "( " + getAnoDeLancamento() +" )";
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
