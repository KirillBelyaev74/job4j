package ru.job4j.pseudo;
import org.junit.Test;
import ru.job4j.stragery.Triangle;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenDrawSquare() {
        Triangle square = new Triangle();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("  ^  \n")
                                .append(" ^ ^ \n")
                                .append("^^^^^")
                                .toString()
                )
        );
    }
}
