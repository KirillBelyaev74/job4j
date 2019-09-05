package ru.job4j.array;

public class ArrayMax {
    public int[] sum(int[] inputOne, int[] inputTwo) {
        int x = 0;
        int[] result = new int[inputOne.length + inputTwo.length];
        System.arraycopy(inputOne, 0, result, 0, inputOne.length);
        System.arraycopy(inputTwo, 0, result, inputOne.length, inputTwo.length);
        for (int out = 0; out < result.length - 1; out++) {
            for (int in = out + 1; in < result.length; in++) {
                if (result[in] < result[out]) {
                    x = result[in];
                    result[in] = result[out];
                    result[out] = x;
                }
            }
        }
        return result;
    }
}
