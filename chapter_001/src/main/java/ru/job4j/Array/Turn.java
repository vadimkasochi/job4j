package ru.job4j.Array;

public class Turn {
    public int[] back(int[] array) {
        int swaper = array.length;
        int swap;
        for (int i = 0; i != (swaper / 2); i++) {
            swap = array[swaper - i - 1];
            array[swaper - i - 1] = array[i];
            array[i] = swap;
        }
        return array;
    }
}
