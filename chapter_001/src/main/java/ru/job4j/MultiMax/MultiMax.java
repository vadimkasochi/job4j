package ru.job4j.MultiMax;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        if (first > second) {
            return result = first > third ? first : third;
        }
        else {
            return result = second > third ? second : third;
        }
    }
}
