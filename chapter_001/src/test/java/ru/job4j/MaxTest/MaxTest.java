package ru.job4j.MaxTest;


import org.junit.Test;
import ru.job4j.Max.Max;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class MaxTest {
        @Test
        public void whenMax1To2Then2() {
            Max max = new Max();
            int result = max.max(1, 2);
            assertThat(result, is(2));
        }
        @Test
        public void whenMinUpToDown() {
            Max max = new Max();
            int result = max.min(1, 2);
            assertThat(result, is(1));
        }
        @Test
        public void whenVomitOneToTwo() {
            Max max = new Max();
            boolean result = max.vomit(1, 2);
            assertThat(result, is(false));
        }

    }

