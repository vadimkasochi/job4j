package ru.job4j.MultiMaxTest;

import org.junit.Test;
import ru.job4j.MultiMax.MultiMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondTwo() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenSecondOne() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 2, 1);
        assertThat(result, is(4));
    }
    @Test
    public void whenSecondThree() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 1, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenSecondVomit() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 4, 4);
        assertThat(result, is(4));
    }
}
