package br.com.gomes.service.strategies;

import java.util.Arrays;

public class MergeSort {
    public static int[] ordenar(int[] array) {
        int arrayLength = array.length;

        if(arrayLength <= 1) return array;

        int midIndex = arrayLength / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[arrayLength-midIndex];

        for(int i = 0; i < midIndex; i++) {
            leftArray[i] = array[i];
        }
        for(int i = midIndex; i < arrayLength; i++) {
            rightArray[i - midIndex] = array[i];
        }

        ordenar(leftArray);
        ordenar(rightArray);

        merge(array, leftArray, rightArray);

        System.out.println("Merge usado: "+ Arrays.toString(array));
        return array;
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int l = 0, r = 0, a = 0;
        while(l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]) {
                array[a] = leftArray[l];
                l++;
            } else {
                array[a] = rightArray[r];
                r++;
            }
            a++;
        }

        while(l < leftSize) {
            array[a] = leftArray[l];
            l++;
            a++;
        }

        while(r < rightSize) {
            array[a] = rightArray[r];
            r++;
            a++;
        }
    }
}
