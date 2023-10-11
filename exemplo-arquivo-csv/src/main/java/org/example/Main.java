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

        ListaObj listaDog = new ListaObj<>(5);

        listaDog.adiciona(new Cachorro(1, "Caramelo", "Médio", 15.90));
        listaDog.adiciona(new Cachorro(2, "Marley", "Grande", 22.00));
        listaDog.adiciona(new Cachorro(3, "Scooby", "Médio", 17.90));
        listaDog.adiciona(new Cachorro(4, "Peanut", "Pequeno", 10.40));
        listaDog.adiciona(new Cachorro(5, "Nasus", "Grande", 250.00));

        gravarArquivoCsv(listaDog, "ListaDogs");

        System.out.println("Dados lidos do arquivo:");
        leExibeArquivoCsv("ListaDogs");
    }


    public static void leExibeArquivoCsv(String nomeArq) {

        FileReader arq = null; // representa o arquivo a ser lido
        Scanner entrada = null; // obj usado para ler do arquivo
        Boolean deuRuim = false;

        nomeArq += ".csv";

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException erro) {
            System.out.printf("Arquivo inexistente");
            System.exit(1);
        }

        try {
            System.out.printf("%-4S %-15S %-9S %4S\n", "id", "nome", "porte", "peso");

            while(entrada.hasNext()) {
                int id = entrada.nextInt();
                String nome = entrada.next();
                String porte = entrada.next();
                Double peso = entrada.nextDouble();

                System.out.printf("%04d %-15s %-9s %4.1f\n", id, nome, porte, peso);
            }
        }
        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            erro.printStackTrace();
            deuRuim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            erro.printStackTrace();
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.printf("Erro ao gravar o arquivo");
                erro.printStackTrace();
                deuRuim = true;
            }

            if(deuRuim) {
                System.exit(1);
            }
        }
    }


    public static void gravarArquivoCsv(ListaObj<Cachorro> lista, String nomeArq) {
        FileWriter arq = null;
        Formatter saida = null;
        Boolean deuRuim = false;

        nomeArq += ".csv";

        try {
            arq = new FileWriter(nomeArq);
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Cachorro dog = lista.getElemento(i);
                saida.format("%d;%s;%s;%.2f\n", dog.getId(), dog.getNome(), dog.getPorte(), dog.getPeso());
            }
        }
        catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo");
            erro.printStackTrace();
            deuRuim = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.printf("Erro ao gravar o arquivo");
                erro.printStackTrace();
                deuRuim = true;
            }

            if(deuRuim) {
                System.exit(1);
            }
        }
    }
}