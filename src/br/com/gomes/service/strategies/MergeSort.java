package br.com.gomes.service.strategies;

public class MergeSort {
    public static void main(String[] args) {

    }

    private static void merge(int vetor[], int aux[], int inicio, int fim) {
        int meio = (inicio + fim) /2;
        if(inicio<fim) {
            merge(vetor, aux, inicio, meio);
            merge(vetor, aux, meio+1, fim);
            intercalacao(vetor, aux, inicio, meio, fim);
        }
    }

    public static void intercalacao(int vetor[], int aux[], int inicio, int meio, int fim) {

    }
}
