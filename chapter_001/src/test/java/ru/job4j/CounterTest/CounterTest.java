package ru.job4j.CounterTest;

import org.junit.Test;
import ru.job4j.Counter.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

        @Test
        public void sumOfPositiveNumber() {
            Counter counter = new Counter();
            int result = counter.add(1, 10);
            assertThat(result, is(30));
        }
    }

