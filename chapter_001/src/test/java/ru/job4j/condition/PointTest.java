package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distanceOne() {
        int expected = 2;
        int out = (int) Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void distanceTwo() {
        int expected = 5;
        int out = (int) Point.distance(3, 5, 7, 2);
        Assert.assertEquals(expected, out);
    }
}
