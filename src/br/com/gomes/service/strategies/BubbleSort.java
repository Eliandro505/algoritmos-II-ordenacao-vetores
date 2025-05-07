package br.com.gomes.service.strategies;

import br.com.gomes.interfaces.OrdenacaoStrategy;

public class BubbleSort implements OrdenacaoStrategy {
    public void ordenar(int[] arrayNum) {
        int size = arrayNum.length;
        int contador = 0;
        for (int x = 0; x < size - 1; x++) {
            boolean trocou = false;
            for (int y = 0; y < size - 1 - x; y++) {
                contador++;
                if (arrayNum[y] > arrayNum[y + 1]) {
                    int temp = arrayNum[y];
                    arrayNum[y] = arrayNum[y + 1];
                    arrayNum[y + 1] = temp;
                    trocou = true;
                }
            }
            if(!trocou) break;
        }
        System.out.println("BubbleSort usado: " + contador);
    }
}