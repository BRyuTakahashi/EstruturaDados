package org.example;

public class ListaEstaticaTest {

    public static void main(String[] args) {
        ListaEstativa listaEstativa = new ListaEstativa(5);

        listaEstativa.addElem(4);
        listaEstativa.addElem(3);
        listaEstativa.addElem(2);
        listaEstativa.addElem(1);
        listaEstativa.addElem(0);
        listaEstativa.addElem(5);

        listaEstativa.showElem();
        System.out.printf("Elemento encontrado na posição: %d\n", listaEstativa.searchElem(0));

        listaEstativa.removeById(3);
        listaEstativa.showElem();

        System.out.printf("\n\n");
        listaEstativa.removeElem(3);
        listaEstativa.showElem();
    }
}
