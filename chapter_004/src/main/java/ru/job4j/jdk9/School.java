package ru.job4j.jdk9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {

    public List<Student> levelOf(List<Student> students, int bound) {

        return students
                .stream()
                .flatMap(Stream::ofNullable)
                .sorted(Student::compareTo)
                .takeWhile(student -> student.getScope() >= bound)
                .collect(Collectors.toList());
    }
}
