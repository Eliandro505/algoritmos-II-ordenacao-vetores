package br.com.gomes.service.strategies;

import br.com.gomes.util.ImpressaoVetor;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numeros = {5, 1, 9, 4};
        ordernar(numeros);
        ImpressaoVetor.imprimir(numeros);
    }

    public static void ordernar(int[] vetor) {
        for (int x = 1; x < vetor.length; x++) {
            int chave = vetor[x];
            int y = x - 1;

            while (y >= 0 && vetor[y] > chave) {
                vetor[y+1] = vetor[y];
                y--;
            }
            vetor[y+1] = chave;
        }
    }
}
