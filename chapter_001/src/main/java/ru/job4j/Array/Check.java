package ru.job4j.Array;

public class Check {
    public boolean mono(boolean[] data) {

        boolean result = true;
        for (int i = 0; i < data.length; i++)
            if (!data[i]) {
                result = false;
                break;
            }

        return result;
    }
}