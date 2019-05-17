package ru.job4j.FactorialTest;

import org.junit.Test;
import ru.job4j.Factorial.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void sumOfPositiveNumber() {
        Factorial counter = new Factorial();
        int result = counter.calc(5);
        assertThat(result, is(120));
    }
    @Test
    public void sumOfZeroNumber() {
        Factorial counter = new Factorial();
        int result = counter.calc(0);
        assertThat(result, is(1));
    }
}
