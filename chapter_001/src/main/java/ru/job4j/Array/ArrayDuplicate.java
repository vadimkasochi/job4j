package ru.job4j.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDuplicate {

    public String [] RemoveDuplacate(String[] array) {

        int unique = array.length;
        for (int out = 0; out <unique; out++){
            for(int in = out + 1; in < unique; in++) {
                if(array[out].equals(array[in])){
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
