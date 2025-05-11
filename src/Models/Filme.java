package Models;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, String sinopse, boolean incluidoNoPlano, String diretor) {
        super(nome, anoDeLancamento, duracaoEmMinutos, sinopse, incluidoNoPlano);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
