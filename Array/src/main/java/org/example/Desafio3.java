package org.example;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        String[] diaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 7");
        int diaNumero = leitor.nextInt();
        while(diaNumero < 1 || diaNumero > 6){
            System.out.println("Digite um número válido (entre 1 e 7):");
            diaNumero = leitor.nextInt();
        }

        System.out.printf("Dia da semana escolhido: %s", diaSemana[diaNumero - 1]);
    }
}
