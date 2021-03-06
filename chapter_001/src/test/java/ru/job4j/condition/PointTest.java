package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }
    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        Point second = new Point(2, 2);
        double result = Math.round(first.distance(second) * 100.0) / 100.0;
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(1.41D));
    }
    @Test
    public void when1And2() {
        Point first = new Point(1, 1, 1);
        Point second = new Point(2, 2, 2);
        double result = Math.round(first.distance3d(second) * 100.0) / 100.0;
        assertThat(result, is(1.73D));
    }
    @Test
    public void when1And5() {
        Point first = new Point(1, 1, 1);
        Point second = new Point(5, 5, 5);
        double result = Math.round(first.distance3d(second) * 100.0) / 100.0;
        assertThat(result, is(6.93D));
    }
}