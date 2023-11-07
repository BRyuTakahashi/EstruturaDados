package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaObj<Paciente> lista = new ListaObj<>(6);

        lista.adiciona(new Paciente(11, "Ana Teixeira", false, "Dor de cabeca", 30, 56.0));
        lista.adiciona(new Paciente(12, "Mario Silva", true, "Febre alta", 63, 70.5));
        lista.adiciona(new Paciente(13, "Catia Miranda", false, "Dor na lombar", 45, 61.4));
        lista.adiciona(new Paciente(14, "Fabio Reis", false, "Dor de garganta", 25, 65.7));
        lista.adiciona(new Paciente(15, "Paula Souza", true, "Gestante", 27, 57.7));
        lista.adiciona(new Paciente(16, "Lauro Macedo", true, "Pedra no rim", 65, 68.3));

        gravarArquivoCsv(lista, "pacientes");
        leExibeArquivoCsv("pacientes");
    }
    public static void gravarArquivoCsv(ListaObj<Paciente> lista, String nomeArquivo) {
        FileWriter arquivo = null;
        Formatter saida = null;
        Boolean error = false;

        nomeArquivo += ".csv";

        try {
            arquivo = new FileWriter(nomeArquivo);
            saida = new Formatter(arquivo);
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Paciente paciente = lista.getElemento(i);
                saida.format("%d;%s;%b;%s;%d;%.2f\n", paciente.getId(), paciente.getNome(), paciente.getPrioritario(), paciente.getSintomas(), paciente.getIdade(), paciente.getPeso());
            }
        }
        catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo");
            erro.printStackTrace();
            error = true;
        }
        finally {
            saida.close();
            try {
                arquivo.close();
            }
            catch (IOException erro) {
                System.out.printf("Erro ao gravar o arquivo");
                erro.printStackTrace();
                error = true;
            }

            if(error) {
                System.exit(1);
            }
        }


    }

    public static void leExibeArquivoCsv(String nomeArquivo) {

        FileReader arquivo = null;
        Scanner entrada = null;
        Boolean error = false;

        nomeArquivo += ".csv";

        try {
            arquivo = new FileReader(nomeArquivo);
            entrada = new Scanner(arquivo).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException erro) {
            System.out.printf("Arquivo inexistente");
            System.exit(1);
        }

        try {
            System.out.printf("%-4S %-14S %-11S %-15S %6S %5S\n", "id", "nome", "prioritario", "sintomas", "idade", "peso");

            while(entrada.hasNext()) {
                int id = entrada.nextInt();
                String nome = entrada.next();
                Boolean prioritario = entrada.nextBoolean();
                String sintomas = entrada.next();
                int idade = entrada.nextInt();
                Double peso = entrada.nextDouble();

                System.out.printf("%04d %-14s %-11s %-15S %06d %05.1f\n", id, nome, prioritario, sintomas, idade, peso);
            }
        }
        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            erro.printStackTrace();
            error = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            erro.printStackTrace();
            error = true;
        }
        finally {
            entrada.close();
            try {
                arquivo.close();
            }
            catch (IOException erro) {
                System.out.printf("Erro ao gravar o arquivo");
                erro.printStackTrace();
                error = true;
            }

            if(error) {
                System.exit(1);
            }
        }
    }
}