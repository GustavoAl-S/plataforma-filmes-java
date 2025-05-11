package Models;

import calculos.Classificavel;

public class Episodio implements Classificavel {
    private String nome;
    private String resumo;
    private double duracao;
    private int numero;
    private Serie serie;
    private int visualizacoes;

    public Episodio(String nome, String resumo, double duracao, int numero, Serie serie, int visualizacoes) {
        this.nome = nome;
        this.resumo = resumo;
        this.duracao = duracao;
        this.numero = numero;
        this.serie = serie;
        this.visualizacoes = visualizacoes;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (visualizacoes > 100){
            return 4;
        } else {
            return 0;
        }
    }
}
