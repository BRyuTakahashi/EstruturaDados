package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);
        Boolean loop = true;
        String nome, autor, isbn, gravadora, desc;
        Integer codigo, quantHoras;
        Double preco, valorHora;

        while(loop){
            System.out.println("Digite qual função deseja executar:\n" +
                    "1- Adicionar um livro ao carrinho;\n" +
                    "2- Adicionar um DVD ao carrinho;\n" +
                    "3- Adicionar um serviço ao carrinho;\n" +
                    "4- Exibir itens do carrinho;\n" +
                    "5- Exibir total da venda;\n" +
                    "6- Encerrar compra.");

            Integer funcao = scanner.nextInt();

            switch (funcao) {
                case 1:
                    System.out.println("Digite o nome do livro:");
                    nome = scanner.nextLine();
                    System.out.println("Digite o autor:");
                    autor = scanner.nextLine();
                    System.out.println("Digite o código do livro:");
                    codigo = scanner.nextInt();
                    System.out.println("Digite o preço do livro:");
                    preco = scanner.nextDouble();
                    System.out.println("Digite o ISBN:");
                    isbn = scanner.nextLine();

                    Livro livro = new Livro(codigo, preco, nome, autor, isbn);
                    carrinho.adicionarVendavel(livro);
                    break;

                case 2:
                    System.out.println("Digite o nome do DVD:");
                    nome = scanner.nextLine();
                    System.out.println("Digite a gravadora:");
                    gravadora = scanner.nextLine();
                    System.out.println("Digite o código:");
                    codigo = scanner.nextInt();
                    System.out.println("Digite o preço do DVD:");
                    preco = scanner.nextDouble();

                    DVD dvd = new DVD(codigo, preco, nome, gravadora);
                    carrinho.adicionarVendavel(dvd);
                    break;

                case 3:
                    System.out.println("Digite a descrição do serviço:");
                    desc = scanner.nextLine();
                    System.out.println("Digite o código do serviço:");
                    codigo = scanner.nextInt();
                    System.out.println("Digite a quantidade de horas que deseja contratar:");
                    quantHoras = scanner.nextInt();
                    System.out.println("Digite o valor da hora:");
                    valorHora = scanner.nextDouble();

                    Servico servico = new Servico(desc, codigo, quantHoras, valorHora);
                    carrinho.adicionarVendavel(servico);
                    break;

                case 4:
                    carrinho.exibeListaCarrinho();
                    break;

                case 5:
                    carrinho.calcTotalVenda();
                    break;

                case 6:
                    System.out.println("Agradecemos por usar nosso sistema");
                    loop = false;
            }
        }
    }
}