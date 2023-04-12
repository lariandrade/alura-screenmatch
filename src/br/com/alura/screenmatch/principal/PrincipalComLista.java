package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();

        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        /*for (Titulo item: lista) {
           System.out.println(item.getNome());
           if (item instanceof Filme) {
                Filme filme = (Filme) item;    
                System.out.println(filme.getClassificacao());
           }
           
        }*/

       //Collections.sort(lista);
       
       lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
       System.out.println(lista);
    }
        
}
