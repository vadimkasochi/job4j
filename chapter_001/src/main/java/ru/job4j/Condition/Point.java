package ru.job4j.Condition;

public class Point {
    public double distance(int x1, int y1, int x2, int y2) {

        double first = Math.pow(x2 - x1, 2);
        double neFirst = Math.pow(y2 - y1, 2);
        return Math.sqrt(first) + Math.sqrt(neFirst);
    }
}