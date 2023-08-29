package org.example;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[7];

        for (int indice = 0; indice < vetor.length; indice++){
            System.out.printf("Digite o texto que quer atribuir ao vetor vetor[%d]", indice);
            vetor[indice] = scanner.nextInt();
        }

        // imprimindo na ordem numerica
        System.out.println("\n\nImprimindo os numeros na ordem:\n");
        for (int indice = 0; indice < vetor.length; indice++){
            System.out.printf("Numero no vetor[%d]: %d\n", indice, vetor[indice]);
        }

        // imprimindo na ordem inversa
        System.out.println("\n\nImprimindo os numeros na ordem inversa:\n");
        for (int indice = vetor.length - 1; indice >= 0; indice--){
            System.out.printf("Numero no vetor[%d]: %d\n", indice, vetor[indice]);
        }
    }
}