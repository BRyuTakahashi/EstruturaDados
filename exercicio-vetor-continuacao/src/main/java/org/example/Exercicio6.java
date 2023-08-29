package org.example;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer dia;
        Integer mes;
        Integer diaAno = 0;
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] meses = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        // pedindo um dia de 1 a 31
        System.out.println("Digite um número de dia de 1 a 31:");
        dia = scanner.nextInt();
        while (dia <= 0 || dia > 31){
            System.out.println("Digite um número válido(de 1 a 31):");
            dia = scanner.nextInt();
        }

        // pedindo um numero de 1 a 12
        System.out.println("Digite um número de mês de 1 a 12:");
        mes = scanner.nextInt();
        while (mes <= 0 || mes > 12){
            System.out.println("Digite um número válido(de 1 a 12):");
            mes = scanner.nextInt();
        }

        // calculando dia do ano
        if (dias[mes - 1] < dia){
            System.out.printf("Não existe dia %d/%d", dia, mes);
        } else {
            for (int indice = 0; indice < mes - 1; indice++){
                diaAno += dias[indice];
            }
            diaAno += dia;
            System.out.printf("O dia %d/%d corresponde ao dia %d do ano", dia, mes, diaAno);
        }
    }
}
