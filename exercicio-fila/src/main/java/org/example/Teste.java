package org.example;

import java.util.List;

public class Teste {

    public Integer separaPositivoNegativoEmOrdem(List<Integer> lista) {
        FilaObj<Integer> fila1 = new FilaObj<>(10);
        FilaObj<Integer> fila2 = new FilaObj<>(10);

        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i) >= 0) {
                fila1.insert(lista.get(i));
            } else {
                fila2.insert(lista.get(i));
            }
        }
        int ordem = 0;
        while(!fila1.isEmpty()) {
             ordem += fila1.poll();
        }

    }
}
