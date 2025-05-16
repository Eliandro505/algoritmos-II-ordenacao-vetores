package br.com.gomes.main;

import br.com.gomes.service.Ordenador;
import br.com.gomes.service.strategies.MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayNum = {5, 3, 8, 1, 2};

        System.out.printf("[insertionsort] ou [insertion] - Insertion\n" +
                "[selectionsort] ou [selection] - Selection\n" +
                "[mergesort] ou [merge] - Merge\n" +
                "[qualquer outra entrada] - Bubble\n" +
                "---[");

        String entrada = new Scanner(System.in).nextLine();
        if(entrada.equals("merge") || entrada.equals("mergesort")) {
            MergeSort.ordenar(arrayNum);
        } else {
            Ordenador ordenador = new Ordenador(entrada);
            ordenador.ordenar(arrayNum);
            System.out.println("Vetor ordenado: " + Arrays.toString(arrayNum));
        }
    }
}
