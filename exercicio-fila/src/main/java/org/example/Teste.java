package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        //2,7,-3,-50,45,-4,30,-21,38

        Integer[] lista = {2,7,-3,-50,45,-4,30,-21,38};

        //2 7 45 30 38 -3 -50 -4 -21
        separaPositivoNegativoEmOrdem(lista);

        //2 7 45 30 38 -21 -4 -50 -3
        separaPositivoNegativoOrdemDiferente(lista);
    }
    public static void separaPositivoNegativoEmOrdem(Integer[] lista) {
        FilaObj<Integer> fila1 = new FilaObj<>(10);
        FilaObj<Integer> fila2 = new FilaObj<>(10);
        FilaObj<Integer> filaCompleta = new FilaObj<>(20);

        for(int i = 0; i < lista.length; i++) {
            if(lista[i] >= 0) {
                fila1.insert(lista[i]);
            } else {
                fila2.insert(lista[i]);
            }
        }

        while(!fila1.isEmpty()) {
            filaCompleta.insert(fila1.poll());
        }
        while(!fila2.isEmpty()) {
            filaCompleta.insert(fila2.poll());
        }

        filaCompleta.exibe();
    }

    public static void separaPositivoNegativoOrdemDiferente(Integer[] lista) {
        FilaObj<Integer> fila = new FilaObj<>(20);
        PilhaObj<Integer> pilha = new PilhaObj<>(10);

        for(int i = 0; i < lista.length; i++) {
            if(lista[i] >= 0) {
                fila.insert(lista[i]);
            } else {
                pilha.push(lista[i]);
            }
        }
        while(!pilha.isEmpty()) {
            fila.insert(pilha.pop());
        }

        fila.exibe();
    }
}
