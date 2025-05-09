package br.com.gomes.service.strategies;

import br.com.gomes.interfaces.OrdenacaoStrategy;


public class SelectionSort implements OrdenacaoStrategy {
    public void ordenar(int[] vetor) {
        for (int i = 0; i < vetor.length-1; i++) {
            int menor = i;
            for (int x =  i + 1; x < vetor.length; x++) {
                if (vetor[menor] > vetor[x]) menor = x;
            }
            if (menor != i) {
                int temp = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = temp;
            }
        }
        System.out.println("SelectionSort usado: ");
    }

    private static void ordenarNomes(String[] nomes) {
        for (int i = 0; i < nomes.length - 1; i++) {
            int menor = i;
            for (int x = i + 1; x < nomes.length; x++) {
                if (nomes[menor].compareTo(nomes[x]) > 0) menor = x;
            }
            if (menor != i) {
                String temp = nomes[i];
                nomes[i] = nomes[menor];
                nomes[menor] = temp;
            }
        }
    }
}
