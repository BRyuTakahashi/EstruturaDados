package org.example;

public class PilhaObj<T> {

    private T[] pilha;
    private int topo;
    public PilhaObj(int tamanho) {
        pilha = (T[]) new Object[tamanho];
        topo = -1;
    }

    public Boolean isEmpty() {
        return topo == -1;
    }

    public Boolean isFull() {
        if(pilha.length == topo + 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(T info) {
        if(isFull()) {
            throw new IllegalStateException("Lista Cheia!");
        } else {
            topo++;
            pilha[topo] = info;
        }
    }

    public T pop() {
        if(isEmpty()) {

        } else {
            return pilha[topo--];
        }
    }

    public T peek() {
        if(isEmpty()) {

        } else {
            return pilha[topo];
        }
    }

    public void exibe() {
        for(T i: pilha) {
            System.out.println(i);
        }
    }
}
