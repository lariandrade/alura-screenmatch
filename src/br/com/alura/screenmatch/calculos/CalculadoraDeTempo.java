package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.*                                  ;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //polimorfismo 
    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
