package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] carro = new String[5];
        int[] rendimento = new int[5];
        int maiorRendimento = 0;
        int posicao = 0;

        // cadastrando os carros
        for (int indice = 0; indice < carro.length; indice++){
            System.out.printf("Digite o modelo de carro no carro[%d]", indice);
            carro[indice] = scanner.next();
        }

        // cadastrando o rendimento dos carros
        for (int indice = 0; indice < carro.length; indice++){
            System.out.printf("Digite o rendimento do carro %s:", carro[indice]);
            rendimento[indice] = scanner.nextInt();
        }

        // calculando carro com maior rendimento
        for (int indice = 0; indice < carro.length; indice++){
            if (maiorRendimento < rendimento[indice]){
                maiorRendimento = rendimento[indice];
                posicao = indice;
            }
        }

        System.out.printf("O %S é o modelo com maior rendimento de %d km", carro[posicao], rendimento[posicao]);
    }
}