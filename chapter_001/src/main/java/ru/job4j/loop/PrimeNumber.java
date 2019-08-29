package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            for (int j = 2; j < i; j++) {
                if (i % 2 != 0) {
                    count++;
                    break;
                }
            }
            if (i == 2) {
                count++;
            }
        }
        return count;
    }
}