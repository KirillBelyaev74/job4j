package ru.job4j.oop1;

public class DummyDic {
    public String engToRus(String eng) {
        String input = "Неизвестное слово: " + eng;
        return input;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String result = dummyDic.engToRus("World");
        System.out.println(result);
    }
}
