package org.example;

public class ListaEstativa {

    private int[] vetor;
    private int nroElem;

    public ListaEstativa(int length){
        vetor = new int[length];
        nroElem = 0;
    }

    public void addElem(int elem){
        if (vetor.length != nroElem) {
            vetor[nroElem] = elem;
            nroElem++;
            System.out.printf("Adicionado o elemento %d no vetor[%d]\n", elem, nroElem);
        } else {
            System.out.println("Lista Cheia\n");
        }
    }

    public void showElem() {
        for (int index = 0; index < nroElem; index++) {
            System.out.printf("Elemento na posição %d: %d\n", index, vetor[index]);
        }
    }

    public int searchElem (int num) {
        boolean found = false;
        int index;
        for (index = 0; index < nroElem; index++) {
            if (vetor[index] == num) {
                found = true;
                break;
            }
        }

        if (found) {
            return index;
        } else {
            return -1;
        }
    }

    public boolean removeById (int id) {
        if (id >= 0 && id < nroElem) {
            for (int index = id; index < nroElem--; index++) {
                vetor[index] = vetor[index + 1];
                return true;
            }

        }
        return false;
    }

    public boolean removeElem (int elem) {
        if (searchElem(elem) >= 0) {
            for (int index = searchElem(elem); index < nroElem - 1; index++) {
                vetor[index] = vetor[index + 1];
                nroElem--;
                return true;
            }
        }
        return false;
    }

    public boolean chanceElem (int oldElem, int newElem) {
        for(int index = 0; index < vetor.length; index++) {
            if(vetor[index] == oldElem) {
                vetor[index] = newElem;
                return true;
            }
        }
        System.out.println("Valor não encontrado");
        return false;
    }

    public int countOcurency (int ocurencyElem) {
        int ocurency = 0;
        for(int index = 0; index < vetor.length; index++) {
            if(vetor[index] == ocurencyElem) {
                ocurency++;
            }
        }
        return ocurency;
    }

    public boolean addInStart (int newElem) {
        if(nroElem == 4) {
            System.out.println("Lista Cheia");
            return false;
        } else {
            for(int index = vetor.length; index >= 1; index--){
                vetor[index + 1] = vetor[index];
            }
            vetor[0] = newElem;
            return true;
        }
    }
}
