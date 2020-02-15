package ru.job4j.school;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void sortStudentMore70() {
        School school = new School();
        List<Student> student = Arrays.asList(
                new Student("Petr", 80)
                , new Student("Kirill", 60)
                , new Student("Kostya", 30));
        List<Student> result = school.collect(student, x -> x.getScore() >= 70 && x.getScore() <= 100);
        for(int index = 0; index != result.size(); index++) {
            assertThat(result.get(index).getName(), is("Petr"));
        }
    }

    @Test
    public void sortStudentLess70More50() {
        School school = new School();
        List<Student> student = Arrays.asList(
                new Student("Petr", 80)
                , new Student("Ivan", 60)
                , new Student("Kostya", 30));
        List<Student> result = school.collect(student, x -> x.getScore() >= 50 && x.getScore() <= 70);
        for(int index = 0; index != result.size(); index++) {
            assertThat(result.get(index).getName(), is("Ivan"));
        }
    }

    @Test
    public void sortStudentLess50() {
        School school = new School();
        List<Student> student = Arrays.asList(
                new Student("Petr", 80)
                , new Student("Kirill", 60)
                , new Student("Kostya", 30));
        List<Student> result = school.collect(student, x -> x.getScore() <= 50);
        for(int index = 0; index != result.size(); index++) {
            assertThat(result.get(index).getName(), is("Kostya"));
        }
    }
}
