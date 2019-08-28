package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
            for(int index = 0; index < data.length - 1; index++) {
                if (data[index][index] != data[index + 1][index + 1]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}