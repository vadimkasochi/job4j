package ru.job4j.Counter;

    public class Counter {
        public int add(int start, int finish) {
            int sum = 0;
            for (int i = 1; finish >= start; i++)
                 if (i % 2 == 0) {
                     sum = sum + i;
                     start++;
                 }
                 else {
                     start++;
                 }
            return sum;
        }
    }

