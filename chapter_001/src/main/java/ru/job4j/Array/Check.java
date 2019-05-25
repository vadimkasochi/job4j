package ru.job4j.Array;

public class Check {
    public boolean mono(boolean[] data) {

        boolean result = true;
        for (int i = 0; i < data.length; i++)
            if(data[0] != data[i]) {
                result = false;
                break;
            }
            else if (data[1] != data[i]) {
                result = false;
            }
            else if (data[2] != data[i]) {
                result = false;
            }


        return result;
    }
}
