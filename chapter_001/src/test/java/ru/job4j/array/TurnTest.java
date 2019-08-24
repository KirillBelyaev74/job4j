package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turnTwo = new Turn();
        int[] input = new int[] {5, 4, 3, 2, 1};
        int[] result = turnTwo.back(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurn() {
        Turn turnTwo = new Turn();
        int[] input = new int[] {5, 4, 3, 2, 1, 0};
        int[] result = turnTwo.back(input);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
}
