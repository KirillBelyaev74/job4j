package ru.job4j.tracker;
/**
 * Интерфейс
 */
public interface Input {
    int askInt(String question, int max);
    String askStr(String question);
}
