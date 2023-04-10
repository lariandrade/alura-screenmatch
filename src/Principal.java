import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Barbie");
       
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinutos(90);

       // meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);

        ArrayList<Filme> listaFilmes = new ArrayList<>();

        listaFilmes.add(meuFilme);
        System.out.println(listaFilmes.size());
        System.out.println("toString do filme: " + listaFilmes.get(0).toString());

    }
}
