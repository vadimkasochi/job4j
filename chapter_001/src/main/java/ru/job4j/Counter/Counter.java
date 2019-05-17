package ru.job4j.Counter;

    public class Counter {
        public int add(int start, int finish) {
            int sum = 0;
            for (int i = start; finish >= start; i++)
                 if (i % 2 == 0) {
                     sum = sum + start;
                     start++;
                 }
                 else {
                     start++;
                 }
            return sum;
        }
    }

