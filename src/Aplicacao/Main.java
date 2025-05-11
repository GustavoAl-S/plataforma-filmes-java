import Models.Filme;
import Models.Serie;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();

        filme1.setNome("Poderoso Chefao");
        filme1.setAnoDeLancamento(2001);
        filme1.exibeFichaTecnica();

        System.out.println();
        Serie serie1 = new Serie();

        serie1.setNome("The Last of Us");
        serie1.setTemporadas(2);
        serie1.setEpPorTemporada(10);
        serie1.setMinutosPorEpisodio(60);
        serie1.exibeFichaTecnica();
        System.out.printf("Tempo para maratonar a série: " + serie1.getDuracaoEmMinutos());

    }
}
