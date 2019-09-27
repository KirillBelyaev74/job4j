package ru.job4j.tracker;
/**
 * Интерфейс
 */
public interface UserAction {
    boolean execute(Input input, Tracker tracker);
    String name();
}
