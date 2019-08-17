package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        int in = 100;
        int expected = 80;
        int out = (int) Fit.manWeight(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void womanWeight() {
        int in = 110;
        int expected = 69;
        int out = (int) Fit.womanWeight(in);
        Assert.assertEquals(expected, out);
    }
}
