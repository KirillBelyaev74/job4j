/**
 * Calculator - Класс для орефметических операций
 *
 * @author Kirill Belayev
 * @version 23.08.19
 * @since 1.0
 */
package ru.job4j.calculator;

public class Calculator {
    /**
     * Метод для сложения чисел
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    /**
     * Метод для деления чисел
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }
    /**
     * Метод для умножения чисел
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }    /**
     * Метод для вычитания чисел
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + " = " + result);
    }

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        add(1, 1);
        subtrack(10, 5);
        multiply(2, 1);
        div(4, 2);
    }
}
