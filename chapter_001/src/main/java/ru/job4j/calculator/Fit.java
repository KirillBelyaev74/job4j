package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (170 - height) * 1.15;
    }

    public static double womanWeight(double height) {
        return (170 - height) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(100);
        double women = womanWeight(110);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 110 is " + women);
    }
}
