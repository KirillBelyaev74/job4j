package ru.job4j.jdk9;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SchoolTest {

    @Test
    public void whenMore70() {
        School school = new School();
        List<Student> students = List.of(
                new Student("Ivan", 90)
                ,new Student("Kostya", 10)
                ,new Student("Petr", 70)
                ,new Student("Kirill", 30)
                ,new Student("Alex", 50)
                ,new Student(null, 0)
        );
        List<Student> result = school.levelOf(students, 50);
        List<Student> expect = List.of(
                new Student("Ivan", 90)
                ,new Student("Petr", 70)
                ,new Student("Alex", 50)
        );
        assertThat(expect, is(result));
    }
}
