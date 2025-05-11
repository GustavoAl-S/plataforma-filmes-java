package calculos;

public class FiltroRecomendacao {

    public void filtro(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os melhores filmes");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muuito bem avaliado.");
        } else {
            System.out.println("Adicione à sua lista e assista em breve.");
        }
    }
}
