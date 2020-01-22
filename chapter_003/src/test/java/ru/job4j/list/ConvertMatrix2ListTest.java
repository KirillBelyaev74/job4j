package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }

    @Test
    public void when2ArrayToThen1Array() {
        ConvertMatrix2List convertMatrix2List = new ConvertMatrix2List();
        List<int[]> input = new ArrayList<>();
        int[] firstArray = new int[]{1, 2};
        int[] secondArray = new int[]{3, 4, 5, 6};
        input.add(firstArray);
        input.add(secondArray);
        List<Integer> result = convertMatrix2List.convert(input);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(result, is(expect));
    }
}
