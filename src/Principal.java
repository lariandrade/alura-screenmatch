import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {
       /* Filme meuFilme = new Filme();
        meuFilme.setNome("Barbie");
        meuFilme.setAnoDeLancamento(2023);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);

        System.out.println("Media de avaliacoes do filme: " + meuFilme.pegaMedia());
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes()); */
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);


    }
}
