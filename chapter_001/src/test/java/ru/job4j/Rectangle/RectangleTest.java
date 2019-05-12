package ru.job4j.Rectangle;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;




public class RectangleTest {

        @Test
        public void p4k1s1() {
            assertThat(Rectangle.square(4, 1), is(1));
        }

        @Test
        public void p6k2s2() {
            assertThat(Rectangle.square(6, 2), is(2));
        }
    }
