package ru.job4j.ArrayTest;

import org.junit.Test;
import ru.job4j.Array.Square;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayTest {
    @Test
    public void whenBouynd3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBouynd5Then149() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }
}
