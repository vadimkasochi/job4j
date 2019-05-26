package ru.job4j.Array;



public class BubbleSort {
    public int[] sort(int[] array) {
        for (int j = 1; j <= array.length; j++) {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int val = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = val;
                }
            }
        }
        return array;


    }
}



