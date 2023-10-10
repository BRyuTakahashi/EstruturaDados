package org.example;

public class ListaObj <T> {

    // 01) Declarar vetor de int:
    // É inicializado no construtor
    private T[] vetor;

    // 02) Criar atributo nroElem:
    // Tem dupla função: representa quantos elementos foram adicionado no vetor
    // Também o índice de onde será adicionado o próximo elemento
    private int nroElem;

    // 03) Criar Construtor:
    // Recebe como argumento o tamanho máximo do vetor
    // Cria vetor com tamanho máximo informado
    // Inicializa nroElem
    public ListaObj(int tamanho) {
        vetor = (T[]) new Object[tamanho];
        nroElem = 0;
    }

    // 04) Método adiciona:
    // Recebe o elemento a ser adicionado na lista
    // Se a lista estiver cheia usar IllegalStateException();
    public void adiciona(T elemento) {
        if(nroElem <= vetor.length - 1) {
            vetor[nroElem] = elemento;
            nroElem++;
        } else {
            throw new IllegalStateException("Lista Cheia");
        }
    }

    // 05) Método busca:
    // Recebe o elemento a ser procurado na lista
    // Retorna o índice do elemento, se for encontrado
    // Retorna -1 se não encontrou
    public int busca(T elementoBuscado) {
        for(int indice = 0; indice < nroElem; indice++) {
            if(vetor[indice] == elementoBuscado) {
                return indice;
            }
        }
        return -1;
    }

    // 06) Método removePeloIndice:
    // Recebe o índice do elemento a ser removido
    // Se o índice for inválido, retorna false
    // Se removeu, retorna true
    public boolean removePeloIndice(int indice) {
        if(isIndiceValido(indice)) {
            if(nroElem == vetor.length) {
                nroElem--;
                return true;
            } else {
                for (int id = indice; id < nroElem; id++) {
                    vetor[id] = vetor[id + 1];
                }

                nroElem--;
                return true;
            }

        } else {

          return false;
        }
    }

    // 07) Método removeElemento
    // Recebe um elemento a ser removido
    // Utiliza os métodos busca e removePeloIndice
    // Retorna false, se não encontrou o elemento
    // Retorna true, se encontrou e removeu o elemento
    public boolean removeElemento(T elementoARemover) {
        for(int indice = 0; indice < nroElem; indice++) {
            if(vetor[indice] == elementoARemover) {
                if(nroElem == vetor.length) {
                    nroElem--;
                    return true;
                } else {
                    for (int id = indice; id < nroElem; id++) {
                        vetor[id] = vetor[id + 1];
                    }

                    nroElem--;
                    return true;
                }
            }
        }
        return false;
    }

    // 08) Método getTamanho
    // Retorna o tamanho da lista
    public int getTamanho() {

        return nroElem;
    }

    // 09) Método getElemento
    // Recebe um índice e retorna o elemento desse índice
    // Se o índice for inválido, retorna null
    public T getElemento(int indice) {
        if(isIndiceValido(indice)) {

            return vetor[indice];

        } else {

            return null;
        }
    }

    // 10) Método limpa
    // Limpa a lista
    public void limpa() {
        nroElem = 0;
    }

    // 11) Método exibe:
    // Exibe os elementos da lista
    public void exibe() {
        for(int indice = 0; indice < nroElem; indice++) {
            System.out.println(vetor[indice]);
            //System.out.println("Objeto na posição vetor[%d]: %s", indice, vetor[indice]);
        }
    }

    // Get do vetor
    // Não retirar, é usado nos testes
    public T[] getVetor() {
        return vetor;
    }
    public boolean isIndiceValido(int indice) {
        if(indice >= 0 && indice <= nroElem) {
            return true;
        } else {
            return false;
        }
    }
}


