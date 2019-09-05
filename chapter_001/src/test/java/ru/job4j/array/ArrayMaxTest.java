package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayMaxTest {
    @Test
    public void whenSumOfTwoArray() {
        ArrayMax arraymax = new ArrayMax();
        int[] inputOne = new int[] {1, 2, 4};
        int[] inputTwo = new int[] {4, 8, 2};
        int[] result = arraymax.sum(inputOne, inputTwo);
        int[] expect = {1, 2, 2, 4, 4, 8};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSumOfTwoArrayOne() {
        ArrayMax arraymax = new ArrayMax();
        int[] inputOne = new int[] {1, 7, 5, 3};
        int[] inputTwo = new int[] {1, 8, 2, 2};
        int[] result = arraymax.sum(inputOne, inputTwo);
        int[] expect = {1, 1, 2, 2, 3, 5, 7, 8};
        assertThat(result, is(expect));
    }
}
