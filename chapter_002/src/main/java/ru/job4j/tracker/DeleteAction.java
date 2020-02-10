package ru.job4j.tracker;

import java.util.function.Consumer;

public class DeleteAction extends BaseAction {

    public DeleteAction(int key, String name) {
        super(key, name);
    }

    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Введите ID: ");
        tracker.delete(id);
        return true;
    }
}
