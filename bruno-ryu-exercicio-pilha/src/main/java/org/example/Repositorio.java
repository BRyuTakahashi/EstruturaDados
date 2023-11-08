package org.example;

import org.example.entity.Evento;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Evento> lista;
    private PilhaObj<Integer> pilha;
    private FilaObj<Evento> fila;

    public Repositorio() {
        lista = new ArrayList<>(10);
        pilha = new PilhaObj<>(10);
        fila = new FilaObj<>(10);
    }

    public void salvar(Evento eventoNovo) {
        if(pilha.isFull()) {
            System.out.println("Lista de eventos cheia!");
        } else {
            lista.add(eventoNovo);
            pilha.push(eventoNovo.getId());
        }
    }

    public void deletar(int id) {
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId() == id) {
                lista.remove(i);
            }
            System.out.println("ID inexistente");
        }
    }

    public void exibir() {
        if(lista.isEmpty()) {
            System.out.println("Repositório vazio");
        } else {
            lista.toString();
            pilha.exibe();
            fila.exibe();
        }
    }

    public void desfazer() {
        if(pilha.isEmpty()) {
            System.out.println("Não há nada a desfazer");
        } else {
            int id = pilha.pop();
            deletar(id);
        }
    }

    public void agendarSalvar(Evento eventoNovo) {
        if(pilha.isFull()) {
            System.out.println("Fila cheia de eventos");
        } else {
            fila.insert(eventoNovo);
        }
    }

    public void executarAgendado(int qtdOperacoes) {
        if(fila.isEmpty()) {
            System.out.println("Não há eventos agendados");
        } else if(qtdOperacoes <= 0 || qtdOperacoes > fila.getTamanho()) {
            System.out.println("Quantidade invalida!");
        } else {
            for(int i = 0; i < qtdOperacoes; i++) {
                System.out.println(fila.poll());
            }
        }
    }
}
