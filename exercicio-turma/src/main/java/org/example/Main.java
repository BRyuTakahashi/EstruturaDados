package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] turma1 = new String[10];
        String[] turma2 = new String[10];
        Integer contador1 = 0;
        Integer contador2 = 0;

        for(int indice = 0; indice < 10; indice++){
            System.out.println("Digite o nome do aluno(a):");
            String nome = scanner.next();
            System.out.printf("Digite a turma do aluno(a) %s, 1 ou 2?", nome);
            Integer turma = scanner.nextInt();

            if (turma == 1){
                turma1[contador1] = nome;
                contador1++;
            } else {
                turma2[contador2] = nome;
                contador2++;
            }
        }

        // imprimindo os nomes da turma 1
        System.out.println("Alunos da turma 1:");
        for (int indice = 0; indice < contador1; indice++) {
            System.out.printf("%d: %s \n", indice, turma1[indice]);
        }

        // imprimindo os nomes da turma 2
        System.out.println("\nAlunos da turma 2:");
        for (int indice = 0; indice < contador2; indice++){
            System.out.printf("%d: %s \n", indice, turma2[indice]);
        }
    }
}