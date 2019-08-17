package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int inEuro = 140;
        int inDollar = 120;
        int inRuble = 2;
        int outEuro = rubleToEuro(inEuro);
        int outDollar = rubleToDollar(inDollar);
        int outEuroToRuble = euroToRuble(inRuble);
        int outDollarToRuble = dollarToRuble(inRuble);
        boolean passedEuro = outEuro == inRuble;
        boolean passedDollar = outDollar == inRuble;
        boolean passedRuble = outEuroToRuble == inEuro;
        boolean passedRubleTwo = outDollarToRuble == inDollar;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        System.out.println("120 rubles are 2 dollar. Test result : " + passedDollar);
        System.out.println("2 euro are 140 ruble. Test result : " + passedRuble);
        System.out.println("2 dollar are 120 ruble. Test result : " + passedRubleTwo);
    }
}
