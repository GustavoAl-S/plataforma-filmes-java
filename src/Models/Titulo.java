package Models;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private String sinopse;

    private boolean incluidoNoPlano;

    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;


    public Titulo(String nome, int anoDeLancamento, int duracaoEmMinutos, String sinopse, boolean incluidoNoPlano) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.sinopse = sinopse;
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String exibeFichaTecnica() {
        return "Nome do título: " + nome + "\n" +
                "Ano de lançamento: " + anoDeLancamento + "\n" +
                "Sinopse: " + sinopse + "\n" +
                "Duração do título: " + duracaoEmMinutos + " minutos\n" +
                "Incluído no plano: " + incluidoNoPlano;
    }

    // METODOS SAO COISAS QUE UM TITULO "FAZ"

    public void avaliacao(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
