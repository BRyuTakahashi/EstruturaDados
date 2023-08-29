package org.example;

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;

        for (int indice = 0; indice < vetor.length; indice++){
            System.out.printf("Digite o número no vetor[%d]:", indice);
            vetor[indice] = scanner.nextInt();
        }

        for (int indice = 0; indice < vetor.length; indice++){
            soma += vetor[indice];
        }

        System.out.printf("Soma dos vetores: %d", soma);
    }

}
