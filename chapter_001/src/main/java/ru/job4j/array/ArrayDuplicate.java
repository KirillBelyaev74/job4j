package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] duplicateDelite(String[] input) {
        int unique = input.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique - 1; in++) {
                if (input[out].equals(input[in])) {
                    input[in] = input[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(input, unique);
    }
}
