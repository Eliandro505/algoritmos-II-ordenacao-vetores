package br.com.gomes.service;

import br.com.gomes.interfaces.OrdenacaoStrategy;
import br.com.gomes.service.strategies.BubbleSort;
import br.com.gomes.service.strategies.InsertionSort;
import br.com.gomes.service.strategies.SelectionSort;

public class Ordenador {
    private OrdenacaoStrategy strategy;

    public Ordenador(String strategy) {
        if(strategy.equalsIgnoreCase("insertion") || strategy.equalsIgnoreCase("insertionsort")) {
            this.strategy = new InsertionSort();
        } else if (strategy.equalsIgnoreCase("selection") || strategy.equalsIgnoreCase("selectionsort")) {
            this.strategy = new SelectionSort();
        } else {
            this.strategy = new BubbleSort();
        }
    }

    public void ordenar(int[] arrayNum){
        strategy.ordenar(arrayNum);
    }
}
