package ru.job4j.ArrayTest;

import org.hamcrest.Matchers;
import org.junit.Test;
import ru.job4j.Array.BubbleSort;


import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{5, 1, 2, 7, 3};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[]{1, 2, 3, 5, 7};
        assertThat(result, Matchers.is(expect));
    }
}

