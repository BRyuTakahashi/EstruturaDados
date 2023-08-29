package org.example;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetor = new String[10];
        String nome;

        for (int indice = 0; indice < vetor.length; indice++){
            System.out.printf("Digite o nome no vetor[%d]", indice);
            vetor[indice] = scanner.nextLine();
        }

        //Pedindo nome ao usuario
        System.out.printf("Digite o nome que deseja buscar");
        nome = scanner.nextLine();

        //Procurando nome no vetor
        for (int indice = 0; indice < vetor.length; indice++){
            if (nome.equalsIgnoreCase(vetor[indice])){
                System.out.printf("Nome encontrado no indice %d", indice);
                break;
            } else if (indice == 9){
                System.out.println("Nome não encontrado");
            }

        }
    }
}
