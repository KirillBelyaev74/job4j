package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class SqMaxTest {
    @Test
    public void maxForth() {
        int out = SqMax.max(1,2,3,4);
        Assert.assertEquals(out, 4);
    }
    @Test
    public void maxThird() {
        int out = SqMax.max(1,3,4,2);
        Assert.assertEquals(out, 4);
    }
    @Test
    public void maxSecond() {
        int out = SqMax.max(1,4,3,2);
        Assert.assertEquals(out, 4);
    }
    @Test
    public void maxFirst() {
        int out = SqMax.max(4,3,1,2);
        Assert.assertEquals(out, 4);
    }
}
