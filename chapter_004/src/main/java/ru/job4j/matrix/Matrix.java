package ru.job4j.matrix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {

    public List<Integer> arrayToList(Integer[][] arrays) {

        return Arrays.stream(arrays).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
