package ru.job4j.matrix;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import java.util.List;

public class MatrixTest {

    @Test
    public void whenArrayToList() {

        Matrix matrix = new Matrix();

        Integer[][] arrays = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

        List<Integer> result = matrix.arrayToList(arrays);

        List<Integer> expect = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8);

        assertThat(result, is(expect));
    }
}
