public class Filme {

    // Atributos sao caracteristicas que o seu Filme vai ter
    // Podemos inserir outras atributos
    // Como produtora, duraçoesEmMinutos, atores, etc...

    private String nome;
    private int anoDeLancamento;
    private int duracaoDoFilme;
    private String sinopse;

    private boolean incluidoNoPlano;

    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int estrelas;

    // METODOS define o comportamento da classe, ou seja o que classe "FAZ"
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme = " + nome);
        System.out.println("Ano de lancamento = " + anoDeLancamento);
        System.out.println("Sinopse = " + sinopse);
        System.out.println("Duração do filme = " + duracaoDoFilme + " minutos");
        System.out.println("Filme está incluso no plano = " + incluidoNoPlano);
    }

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

    public int getDuracaoDoFilme() {
        return duracaoDoFilme;
    }

    public void setDuracaoDoFilme(int duracaoDoFilme) {
        this.duracaoDoFilme = duracaoDoFilme;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
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

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }
}
