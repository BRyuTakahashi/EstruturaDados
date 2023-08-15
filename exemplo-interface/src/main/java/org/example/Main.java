package org.example;

public class Main {
    public static void main(String[] args) {
        Alimento alimento = new Alimento(1, "batata frita", 13.9, 29);
        Perfume perfume = new Perfume(2, "Egeo Spicy", 39.9, "baunilha defumada com pimenta preta");
        Servico servico = new Servico("limpar", 42.9);
        Tributo tributo = new Tributo();

        tributo.adicionarTributavel(alimento);
        tributo.adicionarTributavel(perfume);
        tributo.adicionarTributavel(servico);

        System.out.println(tributo.calculaTotalTributo());

        System.out.println(alimento);
        System.out.println(perfume);
        System.out.println(servico);
    }
}