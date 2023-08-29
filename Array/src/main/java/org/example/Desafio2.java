package org.example;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int pares = 0;

        for (int indice = 0; indice < vetor.length; indice++){
            System.out.printf("Digite o número no vetor[%d]:", indice);
            vetor[indice] = scanner.nextInt();
        }

        for (int indice = 0; indice < vetor.length; indice++){
            if (vetor[indice] % 2 == 0){
                pares++;
            }
        }
        System.out.printf("Quantidade de números pares: %d\n", pares);
    }
}
