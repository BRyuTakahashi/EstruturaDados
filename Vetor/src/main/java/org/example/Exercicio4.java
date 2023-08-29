package org.example;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int numero;
        int repeticao = 0;

        for (int indice = 0; indice < vetor.length; indice++){
            System.out.printf("Digite o numero no vetor[%d]", indice);
            vetor[indice] = scanner.nextInt();
        }

        //pedindo numero e exibindo suas repeticoes
        System.out.println("Digite o numero que deseja buscar");
        numero = scanner.nextInt();

        for (int indice = 0; indice < vetor.length; indice++){
            if(numero == vetor[indice]){
                repeticao++;
            }
        }

        if(repeticao == 0){
            System.out.printf("O numero %d não ocorreu nenhuma vez", numero);
        } else {
            System.out.printf("O número %d ocorreu %d vezes", numero, repeticao);
        }
    }
}
