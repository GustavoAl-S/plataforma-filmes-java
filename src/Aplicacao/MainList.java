package Aplicacao;

import Models.Filme;
import Models.Serie;
import Models.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class MainList {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso Chefão", 1972, 175,
                null, true, null);
        filme1.avaliacao(10);
        filme1.avaliacao(5);

        Filme filme2 = new Filme("Como treinar seu Dragão", 2001, 120,
                null, true, null);
        filme2.avaliacao(8);
        filme2.avaliacao(10);

        Serie serie1 = new Serie("The Last of Us", 2022, "Serie baseada no jogo",
                true, 2, 10, 60, true);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(serie1);


        for (Titulo titulo : lista){
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme){
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }

        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Adam Sandler");
        pessoas.add("Mark Zuckerberg");
        pessoas.add("Gustavo Lima");

        System.out.println(pessoas);
        Collections.sort(pessoas);
        System.out.println("Depois de ordenar");
        System.out.println(pessoas);

    }

}
