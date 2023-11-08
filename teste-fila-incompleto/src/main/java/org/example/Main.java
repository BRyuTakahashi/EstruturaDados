package org.example;

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila(3);
        fila.insert("a");
        fila.insert("b");
        fila.insert("b");
        System.out.println(fila.poll());
    }
}