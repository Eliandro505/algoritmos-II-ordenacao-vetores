package br.com.gomes.util;

public class ImpressaoVetor {
    /**Método para imprimir um vetor de inteiros**/
    public static void imprimir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void imprimirString(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
