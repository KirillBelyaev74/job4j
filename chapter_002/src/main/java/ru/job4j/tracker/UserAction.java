package ru.job4j.tracker;

public interface UserAction {
    public boolean execute(Input input, Tracker tracker);
    public String name();
}
