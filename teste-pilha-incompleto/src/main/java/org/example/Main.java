package org.example;

public class Main {
    public static void main(String[] args) {

        int[] lista = new int[4];
        lista[0] = 1;
        lista[1] = 4;
        lista[2] = 4;
        lista[3] = 1;

        PilhaObj pilha = new PilhaObj<>(5);
        pilha
    }
    public static boolean ehPalindromo(int[] lista) {
        Pilha pilha = new Pilha(lista.length);
        for(int i = 0; i < lista.length; i++) {
            pilha.push(lista[i]);
        }
        for(int i = 0; i < lista.length; i++) {
            if(lista[i] != pilha.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void converteParaBinario(int decimal) {
        Pilha pilha = new Pilha((int) (Math.log(decimal) / (Math.log(2)) + 1));
        while (decimal != 0) {
            if(decimal % 2 != 0) {
                pilha.push(1);
            } else {
                pilha.push(0);
            }
            decimal = decimal / 2;
        }

        while(!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }


}