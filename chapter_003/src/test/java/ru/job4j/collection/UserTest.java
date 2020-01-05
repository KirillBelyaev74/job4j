package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void whenCompatorByNameMore() {
        Comparator<User> comparator = new UserByNameMore();
        int result = comparator.compare(
                new User("Petr", 1),
                new User("Ivan", 0)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameLess() {
        Comparator<User> comparator = new UserByNameLess();
        int result = comparator.compare(
                new User("Petr", 1),
                new User("Ivan", 0)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenCompatorByAgeMore() {
        Comparator<User> comparator = new UserByAgeMore();
        int result = comparator.compare(
                new User("Petr", 1),
                new User("Ivan", 0)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenCompatorByAge() {
        Comparator<User> comparator = new UserByAgeLess();
        int result = comparator.compare(
                new User("Petr", 1),
                new User("Ivan", 0)
        );
        assertThat(result, greaterThan(0));
    }
}