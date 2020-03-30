package ru.job4j.school;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void sortStudentMore70() {
        School school = new School();

        Student petr = new Student("Petr", 80);
        Student kirill = new Student("Kirill", 60);
        Student kostya = new Student("Kostya", 30);

        List<Student> student = Arrays.asList(petr, kirill, kostya);

        Map<String, Student> result = school.collect(student, x -> x.getScore() >= 70 && x.getScore() <= 100);

        assertThat(result.get("Petr").getName(), is("Petr"));
    }

    @Test
    public void sortStudentLess70More50() {

        School school = new School();

        Student petr = new Student("Petr", 80);
        Student kirill = new Student("Kirill", 60);
        Student kostya = new Student("Kostya", 30);

        List<Student> student = Arrays.asList(petr, kirill, kostya);

        Map<String, Student> result = school.collect(student, x -> x.getScore() >= 50 && x.getScore() <= 70);

        assertThat(result.get("Kirill").getName(), is("Kirill"));
    }

    @Test
    public void sortStudentLess50() {

        School school = new School();

        Student petr = new Student("Petr", 80);
        Student kirill = new Student("Kirill", 60);
        Student kostya = new Student("Kostya", 30);

        List<Student> student = Arrays.asList(petr, kirill, kostya);

        Map<String, Student> result = school.collect(student, x -> x.getScore() <= 50);

        assertThat(result.get("Kostya").getName(), is("Kostya"));
    }
}
