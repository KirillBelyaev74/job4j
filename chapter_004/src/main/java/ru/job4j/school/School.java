package ru.job4j.school;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public Map<String, Student> collect(List<Student> student, Predicate<Student> predicate) {
        return student.stream().filter(predicate).collect(Collectors.toMap(Student::getName, s -> s));
    }
}
