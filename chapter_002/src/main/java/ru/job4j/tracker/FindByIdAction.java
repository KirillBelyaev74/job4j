package ru.job4j.tracker;

import java.util.function.Consumer;

public class FindByIdAction extends BaseAction {

    public FindByIdAction(int key, String name) {
        super(key, name);
    }

    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Введите ID: ");
        Item item = tracker.findById(id);
        output.accept(String.format("%s, %s", item.getName(), item.getId()));
        return true;
    }
}
