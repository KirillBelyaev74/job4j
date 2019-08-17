package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void distanceOne() {
        int expected = 2;
        int out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out);
    }
}
