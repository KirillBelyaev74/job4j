package ru.job4j.loop;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        Assert.assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
       Factorial factorial = new Factorial();
       int result = factorial.calc(0);
       Assert.assertThat(result, is(1));
    }
}
