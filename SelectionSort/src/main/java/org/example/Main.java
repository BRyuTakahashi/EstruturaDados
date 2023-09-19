package org.example;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {4,7,5,2,8,1,6,3};
        int[] vetor2 = {9,8,5,2,0,1,3,4,7};
        int[] vetor3 = {9,8,7,6,5,4,3,2,1,0};

        selectionSort(vetor);
        selectionSortOtimizado(vetor2);
        bubbleSort(vetor3);
    }

    public static void selectionSort(int[] v) {

        int comparacao = 0;
        int troca = 0;

        for (int i = 0; i < v.length - 1; i ++) {
            for (int j = i+1; j < v.length; j++) {
                comparacao++;
                if (v[j] < v[i]){
                    troca++;
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }

        // exibindo os valores do vetor em ordem
            System.out.printf("\nExibindo a quantidade de comparações: %d\n", comparacao);
            System.out.printf("Exibindo a quantidade de trocas: %d\n", troca);
            System.out.println("Exibindo os vetores em ordem:\n");
            exibeVetor(v);
    }
    public static void selectionSortOtimizado(int[] v) {

        int comparacao = 0;
        int troca = 0;

        for (int i = 0; i < v.length - 1; i ++) {
            int indMenor = i;
            for (int j = i+1; j < v.length; j++) {
                comparacao++;
                if (v[j] < v[indMenor]){
                    troca++;
                    indMenor = j;
                }
            }
            int aux = v[i];
            v[i] = v[indMenor];
            v[indMenor] = aux;
        }

        // exibindo os valores do vetor em ordem
        System.out.printf("\nExibindo a quantidade de comparações: %d\n", comparacao);
        System.out.printf("Exibindo a quantidade de trocas: %d\n", troca);
        System.out.println("Exibindo os vetores em ordem:\n");
        exibeVetor(v);
    }

    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 1; j < v.length - i; j++){
                if (v[j - 1] > v[j]){
                    v[j] = v[j-1];
                }
            }
        }
        System.out.println("Exibindo os vetores em ordem:");
        exibeVetor(v);
    }

    public static void exibeVetor(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.printf("vetor[%d]= %d  ", i, v[i]);
        }
        System.out.println();
    }
}