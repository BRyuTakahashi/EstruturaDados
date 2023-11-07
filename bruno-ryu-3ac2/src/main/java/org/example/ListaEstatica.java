package org.example;

public class ListaEstatica{

    // Atributos
    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int tamanho) {
        vetor = new int[tamanho];
        nroElem = 0;
    }

    // Métodos

    public int pesquisaBinaria(int valor) {

        int meio, indInf, indSup;
        indInf = 0;
        indSup = vetor.length - 1;

        while (indInf <= indSup) {
            meio = (indInf + indSup) / 2;
            if(vetor[meio] == valor) {
                return meio;
            } else if (valor < vetor[meio]) {
                indSup = meio - 1;

            } else {
                indInf = meio + 1;
            }

         }
        return -1;
    }

    public void ordena() {
        for(int x = 0; x < vetor.length - 1; x++) {
            for (int y = 1; y < vetor.length - 1; y++) {
                if(vetor[y - 1] > vetor[y]) {
                    int aux =  vetor[y-1];

                    vetor[y-1] =  vetor[y];
                    vetor[y] = aux;
                }
            }
        }
    }

    public void adicionaNoIndice(int indice, int valor) {
        if(indice < 0 || indice > nroElem) {
            System.out.println("Indice invalido");
        } else if(nroElem >= vetor.length) {
            System.out.println("Lista cheia");
        } else {
            for(int i = nroElem; i > indice; i--) {
                vetor[i] = vetor[i-1];
            }

            vetor[indice] = valor;

            nroElem++;
        }
    }

    public void adiciona(int elemento) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista está cheia");
        }
        else {
            vetor[nroElem++] = elemento;
        }
    }

    public void exibe() {
        if (nroElem == 0) {
            System.out.println("\nA lista está vazia.");
        }
        else {
            System.out.println("\nElementos da lista:");
            for (int i = 0; i < nroElem; i++) {
                System.out.print(vetor[i] + "\t");
            }
            System.out.println();
        }
    }

    public int busca(int elementoBuscado) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoBuscado) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice (int indice) {
        if (indice < 0 || indice >= nroElem) {
            System.out.println("\nÍndice inválido!");
            return false;
        }
        for (int i = indice; i < nroElem-1; i++) {
            vetor[i] = vetor[i+1];
        }
        nroElem--;
        return true;
    }

    public boolean removeElemento(int elementoARemover) {
        return removePeloIndice(busca(elementoARemover));
    }

}

