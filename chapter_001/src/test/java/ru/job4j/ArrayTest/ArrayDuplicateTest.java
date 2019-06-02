package ru.job4j.ArrayTest;

import org.junit.Test;
import ru.job4j.Array.ArrayDuplicate;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayDuplicateTest {
          @Test
          public void whenArray () {
              String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
              String[] except = {"Привет", "Мир", "Супер"};
              ArrayDuplicate duplicate = new ArrayDuplicate();
              String[] result = duplicate.RemoveDuplacate(input);
              assertThat(result, arrayContainingInAnyOrder(except));

    }
}
