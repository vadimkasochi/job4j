package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddOnePlusOneThenTwo2()  {
        Calculator calc = new Calculator();
        double result = calc.vachel(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddOnePlusOneThenTwo3()  {
        Calculator calc = new Calculator();
        double result = calc.umn(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddOnePlusOneThenTwo4()  {
        Calculator calc = new Calculator();
        double result = calc.razdel(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
