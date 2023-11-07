package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno("01222151", "Bruno Ryu", "ADS", "Estrutura de Dados", 9.1, 3));
        lista.add(new Aluno("01222013", "Denilson Reis", "ADS", "Estrutura de Dados", 9.9, 1));
        lista.add(new Aluno("01222148", "Bruno Pimentel", "ADS", "Estrutura de Dados", 9.2, 2));
        lista.add(new Aluno("01222093", "Estela Polverini", "ADS", "Estrutura de Dados", 9.5, 4));
        lista.add(new Aluno("01222077", "Murilo Barbosa", "ADS", "Estrutura de Dados", 9.6, 4));

        System.out.println("Lista original:");
        for(Aluno a: lista) {
            System.out.println(a);
        }

        gravarArquivoTxt(lista, "alunos.txt");
        }

        public static void gravaRegistro(String registro, String nomeArq) {
            BufferedWriter saida = null;

            try {
                saida = new BufferedWriter(new FileWriter(nomeArq, true));
            }
            catch (IOException erro) {
                System.out.println("Erro ao abrir o arquivo");
            }

            try {
                saida.append(registro + "\n");
                saida.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao gravar o arquivo");
                erro.printStackTrace();
            }
        }

        public static void gravarArquivoTxt(List<Aluno> lista, String nomeArq) {
        int contaRegDadosGravados = 0;

        String header = "00NOTA20232";

    }
}