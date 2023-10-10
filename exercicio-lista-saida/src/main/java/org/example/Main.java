package org.example;

import org.example.Entity.Evento;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean repeticao = true;
        Scanner scanner = new Scanner(System.in);
        int opcao;

        ListaObj eventos = new ListaObj<>(5);

        System.out.println("Bem vindo ao registador de eventos\n");

        while(repeticao) {
            System.out.println("Escolha uma opção entre as desejadas: (digite 1, 2 ou 3");
            System.out.println("1- Adicionar Evento");
            System.out.println("2- Exibir eventos existentes");
            System.out.println("3- Sair");
            opcao = scanner.nextInt();

            if(opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.println("Digite uma opção valida!\n");
            }
            switch (opcao) {
                case 1:
                    System.out.println("Digite o indentificador:");
                    Integer id = scanner.nextInt();
                    System.out.println("Digite o nome do evento:");
                    String nomeEvento = scanner.nextLine();
                    System.out.println("Digite a categoria do evento:");
                    String categoria = scanner.nextLine();
                    System.out.println("Digite uma descrição do evento:");
                    String descricao = scanner.nextLine();
                    System.out.println("Digite a data do evento(dd/mm/aaaa):");
                    String dataEvento = scanner.nextLine();
                    System.out.println("Digite a quantidade de barracas dentro do evento:");
                    Integer qtdBarracas = scanner.nextInt();
                    System.out.println("Digite o valor da entrada:");
                    Double precoEntrada = scanner.nextDouble();

                    Evento evento = new Evento(id, nomeEvento, categoria, descricao, dataEvento, qtdBarracas, precoEntrada);
                    eventos.adiciona(evento);
                    System.out.println("Evento adicionado com sucesso!\n");
                    break;
                case 2:
                    for (int i = 0; i < eventos.getTamanho(); i++) {
                        System.out.printf("%-18s %14s %16s\n", "Nome do Evento", "Descrição", "Data do Evento");
                        Evento eventoDaVez = eventos.getElemento(i);
                        System.out.printf("%-18s %14s %16s\n", eventoDaVez.getNomeEvento(), eventoDaVez.getDescricao(), eventoDaVez.getDataEvento());
                    }
                    break;

                case 3:
                    System.out.println("Obrigado por usar o sistema ^_^");
                    repeticao = false;
                    break;
            }
        }
    }
}