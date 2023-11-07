package org.example;

import java.util.Stack;

public class Pilha {

    // 01) Atributos
    private int[] pilha;
    private int topo;

    // 02) Construtor
    public Pilha(int capacidade) {
        pilha = new int[capacidade];
        topo = -1;
    }

    // 03) MÃ©todo isEmpty
    public Boolean isEmpty() {
        return topo == -1;
    }

    // 04) MÃ©todo isFull
    public Boolean isFull() {
        if(pilha.length == topo + 1) {
            return true;
        } else {
            return false;
        }
    }

    // 05) MÃ©todo push
    public void push(int info) {
        if(isFull()) {
            throw new IllegalStateException("Pilha cheia!");
        } else {
            topo++;
            pilha[topo] = info;
        }
    }

    // 06) MÃ©todo pop
    public int pop() {
        if(isEmpty()) {
            return -1;
        } else {
            return pilha[topo--];
        }
    }

    // 07) MÃ©todo peek
    public int peek() {
        if(isEmpty()) {
            return -1;
        } else {
            return pilha[topo];
        }
    }

    // 08) MÃ©todo exibe
    public void exibe() {
        for(int i: pilha) {
            System.out.println(i);
        }
    }


    //Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }
}