package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        Double media = 0.0;

        // recebendo os numeros
        for (int indice = 0; indice < vetor.length; indice++){
            System.out.printf("Digite o numero que quer adicionar ao vetor[%d]", indice);
            vetor[indice] = scanner.nextInt();
        }

        //calculando a media
        for(int indice = 0; indice < vetor.length; indice++){
            media += vetor[indice];
        }
        media = media / 10;
        System.out.printf("\nMedia dos numeros: %.2f\n\n", media);

        //exibindo numero acima da media
        System.out.println("Exibindo numero acima da media");
        for(int indice = 0; indice < vetor.length; indice++){
            if(vetor[indice] > media){
                System.out.printf("Vetor[%d] = %d\n", indice, vetor[indice]);
            }
        }
    }
}
