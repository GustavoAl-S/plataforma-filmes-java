package Models;

public class Serie extends Titulo{
    private int temporadas;
    private int epPorTemporada;
    private int minutosPorEpisodio;
    private boolean recebeEpisodiosSemanais;

    // ----- CONSTRUTOR ---------
    public Serie(String nome, int anoDeLancamento, String sinopse,
                 boolean recebeEpisodiosSemanais, int temporadas, int epPorTemporada, int minutosPorEpisodio, boolean incluidoNoPlano) {
        super(nome, anoDeLancamento, temporadas * epPorTemporada * minutosPorEpisodio, sinopse, incluidoNoPlano);
        this.temporadas = temporadas;
        this.epPorTemporada = epPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
        this.recebeEpisodiosSemanais = recebeEpisodiosSemanais;
    }

    @Override
    public String toString() {
        return "Serie: "+ this.getNome() + " (" + getAnoDeLancamento() + ")";
    }

    // ----- GETTERS E SETTERS ------
    @Override
    public int getDuracaoEmMinutos() {
        return getTemporadas() * getEpPorTemporada() * getMinutosPorEpisodio();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isRecebeEpisodiosSemanais() {
        return recebeEpisodiosSemanais;
    }

    public void setRecebeEpisodiosSemanais(boolean recebeEpisodiosSemanais) {
        this.recebeEpisodiosSemanais = recebeEpisodiosSemanais;
    }
}
