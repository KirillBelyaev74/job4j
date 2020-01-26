package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (i == 9) {
                continue;
            } else if (i % 2 != 0) {
                count++;
            } else if (i == 2) {
                count++;
            }
        }
        return count;
    }
}