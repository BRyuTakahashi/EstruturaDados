package org.example;


import org.example.Entity.Evento;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean repeticao = true;
        Scanner scanner = new Scanner(System.in);
        int opcao;

        ListaObj eventos = new ListaObj<>(5);

        System.out.println("Bem vindo ao registador de eventos\n");

        while (repeticao) {
            System.out.println("Escolha uma opção entre as desejadas: (digite 1 a 5)");
            System.out.println("1- Adicionar Evento");
            System.out.println("2- Exibir eventos existentes");
            System.out.println("3- Gravar eventos existentes");
            System.out.println("4- Exibir todos os eventos gravados");
            System.out.println("5- Sair");
            opcao = scanner.nextInt();

            if (opcao < 0 && opcao > 5) {
                System.out.println("Digite uma opção valida!\n");
            }
            switch (opcao) {
                case 1:
                    System.out.println("Digite o indentificador:");
                    Integer id = scanner.nextInt();
                    System.out.println("Digite o nome do evento:");
                    String nomeEvento = scanner.next();
                    System.out.println("Digite a categoria do evento:");
                    String categoria = scanner.next();
                    System.out.println("Digite uma descrição do evento:");
                    String descricao = scanner.next();
                    System.out.println("Digite a data do evento(dd/mm/aaaa):");
                    String dataEvento = scanner.next();
                    System.out.println("Digite a quantidade de barracas dentro do evento:");
                    Integer qtdBarracas = scanner.nextInt();
                    System.out.println("Digite o valor da entrada:");
                    Double precoEntrada = scanner.nextDouble();

                    Evento evento = new Evento(id, nomeEvento, categoria, descricao, dataEvento, qtdBarracas, precoEntrada);
                    eventos.adiciona(evento);
                    System.out.println("Evento adicionado com sucesso!\n");
                    break;
                case 2:
                    System.out.printf("%-18s %30s %16s\n", "Nome do Evento", "Descrição", "Data do Evento");
                    for (int i = 0; i < eventos.getTamanho(); i++) {
                        Evento eventoDaVez = (Evento) eventos.getElemento(i);
                        System.out.printf("%-18s %30s %-16s\n", eventoDaVez.getNomeEvento(), eventoDaVez.getDescricao(), eventoDaVez.getDataEvento());
                    }
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.printf("Gravando os eventos cadastrados:\n");
                    gravaArquivoTxt(eventos, "eventos2023");
                    break;

                case 4:
                    System.out.printf("Imprimindo todos os eventos cadastrados:\n");
                    leArquivoTxt("eventos2023");
                    break;

                case 5:
                    System.out.println("Obrigado por usar o sistema ^_^");
                    repeticao = false;
                    break;
            }
        }
    }

    public static void gravaRegistro(String registro, String nomeArq) {
        BufferedWriter saida = null;

        // Bloco try-catch para abrir o arquivo
        try {
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
        } catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
        }

        // Bloco try-catch para gravar o registro e fechar o arquivo
        try {
            saida.append(registro + "\n");
            saida.close();
        } catch (IOException erro) {
            System.out.println("Erro ao gravar o arquivo");
            erro.printStackTrace();
        }
    }

    public static void gravaArquivoTxt(ListaObj<Evento> lista, String nomeArq) {
        int contaRegDadosGravados = 0;

        // Monta o registro de header
        String header = "00EVENTO2023";
        header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        header += "01";

        // Grava o header
        gravaRegistro(header, nomeArq);

        // Monta e grava os registros de dados (registros de corpo)
        for (Evento a : lista.getVetor()) {
            String corpo = "02";
            corpo += String.format("%-5.5s", a.getId());
            corpo += String.format("%-5.5s", a.getNomeEvento());
            corpo += String.format("%-8.8s", a.getCategoria());
            corpo += String.format("%-50.50s", a.getDescricao());
            corpo += String.format("%-50.50s", a.getDataEvento());
            corpo += String.format("%-40.40d", a.getQtdBarracas());
            corpo += String.format("%05.2f", a.getPrecoEntrada());
            // Grava o registro de corpo
            gravaRegistro(corpo, nomeArq);
            // Contabiliza a quantidade de reg de dados gravados
            contaRegDadosGravados++;
        }

        // Monta e grava o registro de trailer
        String trailer = "01";
        trailer += String.format("%010d", contaRegDadosGravados);

        gravaRegistro(trailer, nomeArq);
    }

    public static void leArquivoTxt(String nomeArq) {
        BufferedReader entrada = null;
        String registro, tipoRegistro;
        String nomeEvento, categoria, descricao, dataEvento;
        int id, qtdBarracas;
        Double precoEntrada;
        int contaRegDadosLidos = 0;
        int qtdRegDadosGravados;

        // Cria uma listaLida para receber os objetos Alunos com os dados lidos do arquivo
        List<Evento> listaLida = new ArrayList<>();

        // Bloco try-catch para abrir o arquivo
        try {
            entrada = new BufferedReader(new FileReader(nomeArq));
        } catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
        }

        // Bloco try-catch para ler o arquivo
        try {
            // Le a primeira linha do arquivo
            registro = entrada.readLine();

            while (registro != null) {
                // Obtem o tipo do registro que sao os 2 primeiros caracteres do registro
                // 0123456...
                // 00NOTA20232
                // 1234567...
                // substring considera os indices iniciando de zero
                // substring espera receber como 1o argumento o indice inicial do que se deseja
                // e o 2o argumento eh o indice final do que se deseja MAIS UM
                // O 2o argumento tem o mesmo valor da posicao final do campo no doc layout

                tipoRegistro = registro.substring(0, 2);
                if (tipoRegistro.equals("00")) {
                    System.out.println("Eh um registro de header");
                    System.out.println("Tipo de arquivo: " + registro.substring(2, 6));
                    System.out.println("Ano e semestre: " + registro.substring(6, 11));
                    System.out.println("Data e hora de gravação do arquivo: " + registro.substring(11, 30));
                    System.out.println("Versão do documento: " + registro.substring(30, 32));
                } else if (tipoRegistro.equals("01")) {
                    System.out.println("Eh um registro de trailer");
                    qtdRegDadosGravados = Integer.parseInt(registro.substring(2, 12));
                    if (qtdRegDadosGravados == contaRegDadosLidos) {
                        System.out.println("Quantidade de reg de dados gravados é compatível com a " +
                                "quantidade de reg de dados lidos");
                    } else {
                        System.out.println("Quantidade de reg de dados gravados é incompatível com a " +
                                "quantidade de reg de dados lidos");
                    }
                } else if (tipoRegistro.equals("02")) {
                    System.out.println("Eh um registro de corpo");
                    id = Integer.parseInt(registro.substring(2, 5));
                    nomeEvento = registro.substring(5, 15).trim();
                    categoria = registro.substring(15, 25).trim();
                    descricao = registro.substring(25, 70).trim();
                    dataEvento = registro.substring(70, 80).trim();
                    qtdBarracas = Integer.parseInt(registro.substring(80, 83));
                    precoEntrada = Double.valueOf(registro.substring(83, 90).replace(',', '.'));

                    // Contabiliza que leu mais um reg de dados
                    contaRegDadosLidos++;

                    // Criar um objeto Aluno com os dados lidos desse registro
                    Evento a = new Evento(id, nomeEvento, categoria, descricao, dataEvento, qtdBarracas, precoEntrada);

                    // Para importar esse dado, podemos fazer
                    // repository.save(a);

                    // No nosso caso, como não estamos conectados a banco de dados,
                    // vamos add o objeto a a uma listaLida
                    listaLida.add(a);
                } else {
                    System.out.println("Eh um registro inválido");
                }

                // Le o proximo registro do arquivo
                registro = entrada.readLine();
            } // fim do while

            // Fecha o arquivo
            entrada.close();

        } // fim do try
        catch (IOException erro) {
            System.out.println("Erro ao ler o arquivo");
            erro.printStackTrace();
        }

        // Aqui tb seria possível enviar toda a lista para o BD
        // repository.saveAll(listaLida);

        // Exibe a lista lida
        System.out.println("\nLista lida:");
        for (Evento a : listaLida) {
            System.out.println(a);
        }
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
}