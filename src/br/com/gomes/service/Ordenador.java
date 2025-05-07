package br.com.gomes.service;

import br.com.gomes.interfaces.OrdenacaoStrategy;
import br.com.gomes.service.strategies.BubbleSort;
import br.com.gomes.service.strategies.InsertionSort;

public class Ordenador {
    private OrdenacaoStrategy strategy;

    public Ordenador(String strategy) {
        if(strategy.equalsIgnoreCase("insertion") || strategy.equalsIgnoreCase("insertionsort")) {
            this.strategy = new InsertionSort();
        } else {
            this.strategy = new BubbleSort();
        }
    }

    public void ordenar(int[] arrayNum){
        strategy.ordenar(arrayNum);
    }
}
