package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind5() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4, 7, 3, 6};
        int value = 7;
        int start = 4;
        int finish = 6;
        int result = find.indexOf(input, value, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 7;
        int start = 1;
        int finish = 3;
        int result = find.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}