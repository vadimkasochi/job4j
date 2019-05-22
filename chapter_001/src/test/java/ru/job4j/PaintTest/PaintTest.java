package ru.job4j.PaintTest;
import org.junit.Test;
import ru.job4j.Paint.Paint;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PaintTest {

    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst, is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }
    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst, is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }
    @Test
    public void whenPyramid4mid() {
        Paint paint = new Paint();
        String rst = paint.Trl(4);
        System.out.println(rst);
        assertThat(rst, is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }
    @Test
    public void whenPyramid5mid() {
        Paint paint = new Paint();
        String rst = paint.Trl(5);
        System.out.println(rst);
        assertThat(rst, is(
                new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("    ^    ")
                        .add("   ^^^   ")
                        .add("  ^^^^^  ")
                        .add(" ^^^^^^^ ")
                        .add("^^^^^^^^^")
                        .toString()
                )
        );
    }
}