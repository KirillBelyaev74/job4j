package ru.job4j.tracker;
/**
 * Интерфейс
 */
public interface Input {
    int askInt(String question);
    int askInt(String question, int max);
}
