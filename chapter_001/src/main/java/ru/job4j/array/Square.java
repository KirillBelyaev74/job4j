package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int x = 0;
        for(int i = 1; i <= bound; i++) {
            rst[x++] = i *i;
        }
        return rst;
    }
}
