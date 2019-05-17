package ru.job4j.Factorial;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int i = 1; n >= i; i++){
            result = result * i;
        }
        return result;
    }
}
