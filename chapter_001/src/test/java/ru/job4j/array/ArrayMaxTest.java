package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayMaxTest {
    @Test
    public void whenBothEmpty() {
        ArrayMax arrayMaxone = new ArrayMax();
        int[] expect = new int[0];
        int[] result = arrayMaxone.sum(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }
    @Test
    public void whenAscOrder() {
        ArrayMax algo = new ArrayMax();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.sum(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }
    @Test
    public void whenLeftLess() {
        ArrayMax algo = new ArrayMax();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.sum(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }
    @Test
    public void whenLeftGreat() {
        ArrayMax algo = new ArrayMax();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.sum(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }
    @Test
    public void whenGreat() {
        ArrayMax algo = new ArrayMax();
        int[] expect = {7, 8, 9, 10, 11, 12};
        int[] result = algo.sum(new int[] {8, 10, 12}, new int[] {7, 9, 11});
        assertThat(result, is(expect));
    }
}
