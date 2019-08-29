package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double resultOne = distance(0, 0, 2, 0);
        double resultTwo = distance(3, 5, 7, 2);
        System.out.println("result (0, 0) to (2, 0) " + resultOne);
        System.out.println("result (3, 5) to (7, 2) " + resultTwo);
    }
}
