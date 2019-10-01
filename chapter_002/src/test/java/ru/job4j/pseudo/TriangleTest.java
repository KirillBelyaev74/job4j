package ru.job4j.pseudo;

import org.junit.Test;
import ru.job4j.stragery.Square;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("   *   ")
                                .append("  ***  ")
                                .append(" ***** ")
                                .append("*******")
                                .toString()
                )
        );
    }
}
