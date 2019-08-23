package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int payment = (int) (amount / 100 * percent) + amount;
        boolean x = true;
        while (x) {
            payment = payment - (monthly * 12);
            year++;
            if (payment <= 0) {
                x = false;
            }
        }
        return year;
    }
}
