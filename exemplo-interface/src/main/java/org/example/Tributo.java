package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> lista;

    public Tributo () {
        lista = new ArrayList<>();
    }

    public void adicionarTributavel(Tributavel t) {
        lista.add(t);
    }

    public Double calculaTotalTributo() {
        Double totalTributo = 0.0;
        for (Tributavel t: lista) {
            totalTributo += t.getValorTributo();
        }
        return totalTributo;
    }
}
