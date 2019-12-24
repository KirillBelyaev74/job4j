package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    private List<int[]> list = new ArrayList<>();
    private int counter;

    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }

    public void add(int[] list) {
        this.list.add(this.counter++, list);
    }

    public List<Integer> convert() {
        List<Integer> result = new ArrayList<>();
        for (int[] lists : this.list) {
            for (int value : lists) {
                result.add(value);
            }
        }
        return result;
    }
}