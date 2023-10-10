package org.example;

public class Main {
    public static void main(String[] args) {
        ListaObj lista = new ListaObj<>(5);

        lista.adiciona(5);
        lista.adiciona(4);
        lista.adiciona(3);
        lista.adiciona(2);
        lista.adiciona(1);


        lista.removePeloIndice(4);

    }
}