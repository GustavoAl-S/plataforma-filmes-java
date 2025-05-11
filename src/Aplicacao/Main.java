package Aplicacao;

import Models.Episodio;
import Models.Filme;
import Models.Serie;
import calculos.Calcular;
import calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Filme 1
        Filme filme1 = new Filme("O poderoso Chefão", 1972, 175,
                null, true, null);
        System.out.println(filme1.exibeFichaTecnica());

        // Filme 2
        System.out.println();
        Filme filme2 = new Filme("Como treinar seu Dragão", 2001, 120,
                null, true, null);;
        System.out.println(filme2.exibeFichaTecnica());

        // Serie 1
        System.out.println();
        Serie serie1 = new Serie("The Last of Us", 2022, "Serie baseada no jogo",
                true, 2, 10, 60);
        System.out.println(serie1.exibeFichaTecnica());

        System.out.println();
        Calcular calculadora = new Calcular();
        calculadora.incluir(filme1);
        calculadora.incluir(filme2);
        calculadora.incluir(serie1);
        System.out.println("\nTempo para assistir todos os titulos:" + calculadora.getTempoTotal());

        Episodio episodio1 = new Episodio("O inicio", "O principio de tudo", 60, 1,
                serie1, 200);
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(episodio1);

        // Filtro que irá avaliar o filme dentro do escopo
        System.out.println();
        System.out.println("Avaliação do Filme 1");
        filtro.filtro(filme1);

        System.out.println();
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(filme1);
        listaFilmes.add(filme2);
        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Filme: " + listaFilmes.get(0).getNome());
    }
}
