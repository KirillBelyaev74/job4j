package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 0;
        int x = 1;
        for (int i = 1; i <= n ; i++) {
           x = x * i;
        }
        result = x;
        return result;
    }
}
