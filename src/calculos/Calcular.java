package calculos;

import Models.Titulo;

public class Calcular {
    private int tempoTotal;

    public void incluir(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
