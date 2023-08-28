package org.example;

import java.util.Scanner;

public class Main {
    public static void exibeVetor(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.printf("vetor[%d]= %d\n", i, v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Declaração e criacção de um vetor de tamanho 5
        int[] vetor = new int[5];

        // adicionando valores no vetor
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i * 10;
        }

        // exibir o vetor
        System.out.println("Valores do vetor:");
        exibeVetor(vetor);

        // preenchendo o vetor com valores digitados pelo usuarop
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o valor no indice %d:", i);
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Valores do vetor:");
        exibeVetor(vetor);

        // Declaração e Criação de um vetor já inicializado com valores
        int[] vet2 = {100, 200, 300, 400, 500, 600, 700};

        // Declaração e criação de um vetor de Strings
        String[] vet3 = new String[4];
        for(int i = 0; i < vet3.length; i++){
            System.out.printf("Digite o texto que quer atribuir ao vetor vet3[%d]", i);
            vet3[i] = scanner.nextLine();
        }

        // exibindo os valores do vetor vet3
        for(String s: vet3){
            System.out.println(s + "\n");
        }
    }
}