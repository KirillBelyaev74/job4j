package ru.job4j.departments;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {

    @Test
    public void whenMissedSortAsc() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChangeOneSortAsc() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChangeTwoSortAsc() {
        List<String> input = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMissedSortDesc() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1/sk1", "k1");
        List<String> result = Departments.sortDesc(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChangeOneSortDesc() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1/sk1", "k1");
        List<String> result = Departments.sortDesc(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChangeTwoSortDesc() {
        List<String> input = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> expect = Arrays.asList("k1/sk1/ssk1", "k1/sk1", "k1");
        List<String> result = Departments.sortDesc(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenFillGaps() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenDescCompare() {
        List<String> input = Arrays.asList("k2/sk1", "k2");
        List<String> expect = Arrays.asList("k2", "k2/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }
}