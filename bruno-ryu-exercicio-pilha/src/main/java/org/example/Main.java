package org.example;

import org.example.entity.Evento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Repositorio repositorio = new Repositorio();
        boolean repeticao = true;
        Scanner scanner = new Scanner(System.in);
        int numeroEscolhido;

        while(repeticao) {
            System.out.println("Digite uma opção abaixo:");
            System.out.println("1- Salvar objeto");
            System.out.println("2- Deletar objeto");
            System.out.println("3- Exibir");
            System.out.println("4- Desfazer");
            System.out.println("5- Agendar salvar");
            System.out.println("6- Executar agendado");
            System.out.println("7- Fim");
            numeroEscolhido = scanner.nextInt();

            while(numeroEscolhido < 1 || numeroEscolhido > 7) {
                System.out.println("Opção escolhida invalida! Escolha uma entre as operações:");
                System.out.println("1- Salvar objeto");
                System.out.println("2- Deletar objeto");
                System.out.println("3- Exibir");
                System.out.println("4- Desfazer");
                System.out.println("5- Agendar salvar");
                System.out.println("6- Executar agendado");
                System.out.println("7- Fim");
                numeroEscolhido = scanner.nextInt();
            }

            switch(numeroEscolhido) {
                case 1:
                    boolean erro = false;

                    System.out.println("Digite o ID do evento (maior que 100):");
                    int id = scanner.nextInt();
                    if(id < 100) {
                        erro = true;
                        while(erro) {
                            System.out.println("ID invalido! Digite um ID maior que 100");
                            id = scanner.nextInt();
                            if(id >= 100) {
                                erro = false;
                            }
                        }
                    }
                    System.out.println("Digite o nome do evento:");
                    String nomeEvento = scanner.next();
                    System.out.println("Digite a categoria do evento:");
                    String categoria = scanner.next();
                    System.out.println("Digite uma breve descrição do evento:");
                    String descricao = scanner.next();
                    System.out.println("Digite a data do evento:");
                    String dataEvento = scanner.next();
                    System.out.println("Digite a quantidade de barracas que terão:");
                    int qtdBarracas = scanner.nextInt();
                    System.out.println("Digite o preço da entrada:");
                    double precoEntrada = scanner.nextDouble();


                    Evento evento = new Evento(id, nomeEvento, categoria, descricao, dataEvento, qtdBarracas, precoEntrada);
                    repositorio.salvar(evento);
                    break;
                case 2:
                    System.out.println("Digite o ID do evento que deseja deletar:");
                    int idEventoDeletar = scanner.nextInt();
                    if(idEventoDeletar < 100) {
                        boolean idInvalido = true;
                        while(idInvalido) {
                            System.out.println("ID invalido!");
                            idEventoDeletar = scanner.nextInt();
                            if(idEventoDeletar >= 100) {
                                idInvalido = false;
                            }
                        }
                    }
                    repositorio.deletar(idEventoDeletar);
                    break;

                case 3:
                    repositorio.exibir();
                    break;

                case 4:
                    repositorio.desfazer();
                    break;

                case 5:
                    boolean erroAgendado = false;

                    System.out.println("Digite o ID do evento (maior que 100):");
                    int idAgendado = scanner.nextInt();
                    if(idAgendado < 100) {
                        erroAgendado = true;
                        while(erroAgendado) {
                            System.out.println("ID invalido! Digite um ID maior que 100");
                            idAgendado = scanner.nextInt();
                            if(idAgendado >= 100) {
                                erroAgendado = false;
                            }
                        }
                    }
                    System.out.println("Digite o nome do evento:");
                    String nomeEventoAgendado = scanner.next();
                    System.out.println("Digite a categoria do evento:");
                    String categoriaAgendado = scanner.next();
                    System.out.println("Digite uma breve descrição do evento:");
                    String descricaoAgendado = scanner.next();
                    System.out.println("Digite a data do evento:");
                    String dataEventoAgendado = scanner.next();
                    System.out.println("Digite a quantidade de barracas que terão:");
                    int qtdBarracasAgendado = scanner.nextInt();
                    System.out.println("Digite o preço da entrada:");
                    double precoEntradaAgendado = scanner.nextDouble();


                    Evento eventoAgendado = new Evento(idAgendado, nomeEventoAgendado, categoriaAgendado, descricaoAgendado, dataEventoAgendado, qtdBarracasAgendado, precoEntradaAgendado);
                    repositorio.agendarSalvar(eventoAgendado);
                    break;

                case 6:
                    System.out.println("Digite a quantidade de operações que deseja fazer:");
                    int qtdOperacoes = scanner.nextInt();
                    repositorio.executarAgendado(qtdOperacoes);
                    break;

                case 7:
                    System.out.println("Obrigado por usar nosso sistema");
                    repeticao = false;
                    break;
            }

        }
    }
}